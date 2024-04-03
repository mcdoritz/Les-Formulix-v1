package fr.lesformulix.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {


    @GetMapping
    public String landing(Model model){
        model.addAttribute("pageTitle", "Les Zinzins");

        return "outside/landing";
    }

}
