package com.diego.junco.springjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Diego Junco on 22/03/2018
 **/
@Service
public class ChuckNorrisJokesService implements JokesService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public ChuckNorrisJokesService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override

    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}