package ru.netology;

public class MoviePosterManager {
    private MoviePoster[] posters = new MoviePoster[0];
    private int lastCount;

    public MoviePosterManager() {
        this.lastCount = 10;
    }

    public MoviePosterManager(int lastCount) {
        this.lastCount = lastCount;
    }

    // 1.
    public void add(MoviePoster poster) {
        MoviePoster[] tmp = new MoviePoster[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    // 2.
    public MoviePoster[] findAll() {
        return posters;
    }

    //3.
    public MoviePoster[] findLast() {
        int resultLength;
        if (posters.length >= this.lastCount) {
            resultLength = lastCount;
        } else {
            resultLength = posters.length;
        }
        MoviePoster[] result = new MoviePoster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }
}