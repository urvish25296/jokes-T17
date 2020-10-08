/*
 * Project: Chuck Norris Jokes
 * Assignment: #1
 * Authors:
 *       Urvish M Patel (101212717)
 *       Dhyan Patel (101179309)
 *       Hanok Mengesha(101158122)
 *       Dipak Sutradhar (101184818)
 * Date: 07-Oct-2020
 * Description: This is our controller class
 * */

package com.comp3095.jokes.jokes.controllers;

import com.comp3095.jokes.jokes.services.ServiceImpliment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final ServiceImpliment serviceImpliment;

    public JokeController(ServiceImpliment serviceImpliment) {
        this.serviceImpliment = serviceImpliment;
    }

    @RequestMapping("/")
    public String allJokes(Model model){

        model.addAttribute("jokes",serviceImpliment.Jokes());
        return "home/index";
    }



}
