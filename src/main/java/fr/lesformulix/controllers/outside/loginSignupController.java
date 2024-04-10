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
public class loginSignupController {
    @Autowired
    private UserService us;

    @GetMapping("/loginSignup")
    public String loginSignup(User user, Model model, HttpServletRequest request){
        prln("Controller loginSignup");
        if(request.getParameter("loginError") != null){
            model.addAttribute("pageTitle", "LOGIN : ERROR");
        }else{
            model.addAttribute("pageTitle", "LOGIN / SIGNUP");
        }
        model.addAttribute("user", user);

        return "outside/loginSignup";
    }

    @GetMapping("/login")
    public String login(Model model){
        prln("Controller login");
        model.addAttribute("pageTitle", "LOGIN");
        return "login";
    }

    @GetMapping("/login-error")
    public String login(User user, HttpServletRequest request, Model model) {
        prln("Controller login-error");
        HttpSession session = request.getSession(false);
        String errorMessage = null;
        if (session != null) {
            AuthenticationException ex = (AuthenticationException) session
                    .getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
            if (ex != null) {
                errorMessage = ex.getMessage();
            }
        }
        prln(errorMessage);
        model.addAttribute("errorMessage", errorMessage);
        return "outside/loginSignup";
    }


    @PostMapping("/signup")
    public String signup(@Validated User user, BindingResult bindingResult, Model model){
        prln("controller signup");
        if(bindingResult.hasErrors()){
            prln("erreur controller signup");
            return "outside/loginSignup";
        }
        if(us.add(user, bindingResult) != null){
            prln("user added");
            model.addAttribute("new-user-username", user.getUsername());
        }else{
            prln("user not added");
            model.addAttribute("error-msg", "L'utilisateur n'a pas été créé");
        }
        return "outside/loginSignup";
    }

}