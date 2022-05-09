package com.dheerajdoodhya.moviebooking.service;

import com.dheerajdoodhya.moviebooking.entity.Movie;
import com.dheerajdoodhya.moviebooking.entity.MovieComparator;
import com.dheerajdoodhya.moviebooking.entity.MovieList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class MovieService {
    public Movie getTopRatedMovie() {
        MovieList movieList = new MovieList();
        MovieComparator mc = new MovieComparator();
        List<Movie> list = movieList.getMovieList();
        Collections.sort(list, mc);
        return list.get(0);
    }
}
