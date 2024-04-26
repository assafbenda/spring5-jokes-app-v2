package services;

import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotes  implements ChuckNorrisService {

    private final guru.springframework.norris.chuck.ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuotes() {
        this.chuckNorrisQuotes = new guru.springframework.norris.chuck.ChuckNorrisQuotes();
    }
    public ChuckNorrisQuotes(guru.springframework.norris.chuck.ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }


    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
