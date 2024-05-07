package fr.lesformulix.controllers.outside;

import fr.lesformulix.models.User;
import fr.lesformulix.services.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.WebAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import static fr.lesformulix.utils.DebugUtil.prln;

@Controller
public class loginController {
    @Autowired
    private UserService us;

    @GetMapping("/login")
    public String login(Model model){
        prln("Controller login");
        model.addAttribute("pageTitle", "LOGIN");
        return "outside/login";
    }

}
