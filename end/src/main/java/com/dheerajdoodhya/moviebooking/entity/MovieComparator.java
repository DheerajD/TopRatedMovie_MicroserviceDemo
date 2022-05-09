package com.dheerajdoodhya.moviebooking.entity;
import java.util.Comparator;


public class MovieComparator implements Comparator<Movie>{
    @Override
    public int compare(Movie m1, Movie m2) {
        return m2.getRating() - m1.getRating();
    }
}
