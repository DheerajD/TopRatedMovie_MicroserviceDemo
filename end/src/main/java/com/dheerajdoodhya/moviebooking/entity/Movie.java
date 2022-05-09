package com.dheerajdoodhya.moviebooking.entity;

public class Movie {

    private String movieId;
    private String movieName;
    private String oTTPlatform;
    private int rating;

    public Movie() {
    }

    public Movie(String movieId, String movieName, String oTTPlatform, int rating) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.oTTPlatform = oTTPlatform;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getoTTPlatform() {
        return oTTPlatform;
    }

    public void setoTTPlatform(String oTTPlatform) {
        this.oTTPlatform = oTTPlatform;
    }


}
