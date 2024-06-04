package fr.lesformulix.controllers.app;

import fr.lesformulix.models.Discipline;
import fr.lesformulix.models.League;
import fr.lesformulix.models.User;
import fr.lesformulix.services.LeagueService;
import fr.lesformulix.services.LeagueUserService;
import fr.lesformulix.services.UserService;
import fr.lesformulix.utils.CheckLogin;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

import static fr.lesformulix.utils.DebugUtil.prln;

@Controller
public class LeagueController {
    @Autowired
    LeagueService ls;
    @Autowired
    LeagueUserService lus;
    @Autowired
    UserService us;
    @Autowired
    private CheckLogin checkLogin;

    @GetMapping("/league")
    public String leagues(Model model, HttpSession session){
        User user = checkLogin.checkLogin();
        if(user == null){
            return "redirect:/login";
        }else{
            prln("user : " + user.getUsername());
            prln((int) user.getId());
            ArrayList<League> leagues = new ArrayList<>(ls.getAllLeaguesByUser((int) user.getId()));
            prln("**************************");
            prln("size des résultats : " + leagues.size());
            for(League league : leagues){
                prln(league.getName());
                for(Discipline d: league.getDisciplines()){
                    prln(d.getName());
                }
            }
            prln("**************************");
            model.addAttribute("leaguesOfUser", leagues);
            model.addAttribute("league", null);
            return "app/leagues";
        }

    }

    @GetMapping("/league/{leagueId}")
    public String league(@PathVariable(value="leagueId") int leagueId, Model model){
        if(leagueId > 0){
            if(lus.checkIsUserIsInThisLeague(1, leagueId)){
                League league = ls.getLeague(leagueId);
                model.addAttribute("league", league);
            }

        }else{
            return "app/league";
        }
        return "app/league";
    }

}

