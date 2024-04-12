package fr.lesformulix.controllers.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LeagueController {

    @GetMapping("/league")
    public String predictions() {

        return "app/league";
    }

}

