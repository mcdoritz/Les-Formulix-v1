package fr.lesformulix.controllers.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import static fr.lesformulix.utils.DebugUtil.prln;

@Controller
public class DashboardController {

    @GetMapping("/app")
    public String landing(Model model){
        prln("Controller app");
        model.addAttribute("pageTitle", "Les Formulix");

        return "app/dashboard";
    }
}
