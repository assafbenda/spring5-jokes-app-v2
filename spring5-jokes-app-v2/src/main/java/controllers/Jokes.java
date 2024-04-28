package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.ChuckNorrisService;

@Controller
public class Jokes {
    public final ChuckNorrisService chuckNorrisService;

    public Jokes(ChuckNorrisService chuckNorrisService) {
        this.chuckNorrisService = chuckNorrisService;
    }

    @RequestMapping({"/", ""})
    public String ShowJoke(Model model) {
        model.addAttribute("joke", chuckNorrisService.getJoke());
        System.out.println("controller joke is: " + chuckNorrisService.getJoke());
        return "index";
    }
}