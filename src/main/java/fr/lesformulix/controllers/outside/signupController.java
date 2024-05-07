package fr.lesformulix.controllers.outside;

import fr.lesformulix.models.User;
import fr.lesformulix.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static fr.lesformulix.utils.DebugUtil.prln;
import static fr.lesformulix.utils.SessionUtil.isUserConnected;

@Controller
public class signupController {
    @Autowired
    private UserService us;

    @GetMapping("/signup")
    public String login(User user, HttpServletRequest request, Model model) throws Exception {
        prln("Controller signup GET");
        isUserConnected(request);
        return "outside/signup";
    }

    @PostMapping("/signup")
    public String signup(@Validated User user, BindingResult bindingResult, Model model){
        prln("controller signup POST");
        if(bindingResult.hasErrors()){
            prln("erreur dans le formulaire controller signup");
            model.addAttribute("errorMessage", "Erreur avec le formulaire d'inscription");
            return "outside/signup";
        }else{
            //Vérifier les champs 1 à 1
            if(us.add(user, bindingResult) != null){
                prln("user added");
                model.addAttribute("new-user-username", user.getUsername());
                return "outside/login";
            }else{
                prln("user not added");
                model.addAttribute("errorMessage", "L'utilisateur n'a pas été créé");
                return "outside/signup";
            }
        }


    }

}
