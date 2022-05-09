package com.dheerajdoodhya.moviebooking.entity;

import java.util.ArrayList;
import java.util.List;

public class MovieList {
    public List<Movie> getMovieList() {
        Movie mv1 = new Movie("MV0001", "Pushpa", "Amazon Prime", 5);
        Movie mv2 = new Movie("MV0002", "Sholay", "Hotstar", 3);
        Movie mv3 = new Movie("MV0005", "Inception", "Amazon Prime", 4);
        List<Movie> movieList = new ArrayList<>(3);
        movieList.add(mv1);
        movieList.add(mv2);
        movieList.add(mv3);
        return movieList;
    }
}
