package controllers;

import services.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;

@Controller
public class Jokes {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public Jokes(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke() {
        return chuckNorrisQuotes.getJoke();
    }
}
