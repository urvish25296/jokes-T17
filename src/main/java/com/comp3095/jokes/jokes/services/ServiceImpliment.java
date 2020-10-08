/*
 * Project: Chuck Norris Jokes
 * Assignment: #1
 * Authors:
 *       Urvish M Patel (101212717)
 *       Dhyan Patel (101179309)
 *       Hanok Mengesha(101158122)
 *       Dipak Sutradhar (101184818)
 * Date: 07-Oct-2020
 * Description: This is service implimentationfile, we impliment JokeService interface and
 *              methods.
 * */


package com.comp3095.jokes.jokes.services;

import com.comp3095.jokes.jokes.repository.JokeService;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpliment implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ServiceImpliment() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String Jokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
