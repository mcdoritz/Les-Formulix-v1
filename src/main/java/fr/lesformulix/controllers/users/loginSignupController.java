package fr.lesformulix.controllers.users;

import fr.lesformulix.models.User;
import fr.lesformulix.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static fr.lesformulix.utils.DebugUtil.prln;

@Controller
public class loginSignupController {
    @Autowired
    private UserService us;

    @GetMapping("/loginSignup")
    public String loginSignup(Model model){
        model.addAttribute("pageTitle", "LOGIN / SIGNUP");
        return "outside/loginSignup";
    }

    @PostMapping("/Signup")
    public String signup(@Validated User user, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "loginSignup";
        }
        if(us.add(user, bindingResult) != null){
            model.addAttribute("new-user-username", user.getUsername());
        }else{
            model.addAttribute("error-msg", "L'utilisateur n'a pas été créé");
        }
        return "/loginSignup";
    }

}
