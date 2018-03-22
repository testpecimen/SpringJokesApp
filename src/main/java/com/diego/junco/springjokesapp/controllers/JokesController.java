package com.diego.junco.springjokesapp.controllers;

import com.diego.junco.springjokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Diego Junco on 22/03/2018
 **/
@Controller
public class JokesController {
    private JokesService jokesService;

    public JokesController(@Qualifier("chuckNorrisJokesService") JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokesService.getJoke());
        return "chucknorris";
    }
}
