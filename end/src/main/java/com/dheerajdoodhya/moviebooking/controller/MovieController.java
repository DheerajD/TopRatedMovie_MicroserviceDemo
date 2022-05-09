package com.dheerajdoodhya.moviebooking.controller;

import com.dheerajdoodhya.moviebooking.entity.Movie;
import com.dheerajdoodhya.moviebooking.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(value = "/movie/top-rated", method = RequestMethod.GET)
    public Movie getTopRatedMovie() {
        return movieService.getTopRatedMovie();
    }
}
