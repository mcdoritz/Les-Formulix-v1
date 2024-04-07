package fr.lesformulix.controllers.users;

import fr.lesformulix.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginSignupController {

    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("pageTitle", "LOGIN / SIGNUP");
        return "outside/login";
    }
}
