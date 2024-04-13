package fr.lesformulix.controllers.app;

import fr.lesformulix.models.League;
import fr.lesformulix.models.LeagueUser;
import fr.lesformulix.services.LeagueService;
import fr.lesformulix.services.LeagueUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static fr.lesformulix.utils.DebugUtil.prln;

@Controller
public class LeagueController {
    @Autowired
    LeagueService ls;
    @Autowired
    LeagueUserService lus;

    @GetMapping("/league")
    public String leagues(Model model) {
        // CORRIGER ICI QUAND ON DISPOSERA DES INFOS DE SESSION
        ArrayList<League> leagues = new ArrayList<>(ls.getAllLeaguesByUser(1));
        model.addAttribute("leaguesOfUser", leagues);
        model.addAttribute("league", null);
        return "app/league";
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

