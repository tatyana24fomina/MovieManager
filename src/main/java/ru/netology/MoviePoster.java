package ru.netology;

import java.security.PublicKey;

public class MoviePoster {
    private int id;
    private String movieTitle;
    private String genre;
    private String movieCover;
    private boolean premiereTomorrow;


    public MoviePoster(int id, String movieTitle, String genre, String movieCover, boolean premiereTomorrow) {
        this.id = id;
        this.movieTitle = movieTitle;
        this.genre = genre;
        this.movieCover = movieCover;
        this.premiereTomorrow = premiereTomorrow;
    }

}

