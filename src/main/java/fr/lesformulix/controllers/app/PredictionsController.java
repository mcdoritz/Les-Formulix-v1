package fr.lesformulix.controllers.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PredictionsController {

    @GetMapping("/predict")
    public String predictions() {

        return "app/predict";
    }

}
