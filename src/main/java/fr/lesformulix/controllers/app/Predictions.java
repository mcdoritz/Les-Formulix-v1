package fr.lesformulix.controllers.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Predictions {

    @GetMapping("/predict")
    public String predictions() {

        return "predict";
    }

}
