package com.revature.movie;

/**
 * Creating the buildmethod for each of my variables.
 */

public class Movie {
    private int rank, year, minutes, votes, metascore;
    private String title, genre, description, director, actors;
    private float rating, revenue;

    public Movie(int rank, int year, int minutes, int votes, int metascore, String title, String genre, String description, String director, String actors, float rating, float revenue){
        this.rank = rank;
        this.year = year;
        this.minutes = minutes;
        this.votes = votes;
        this.metascore = metascore;
        this.title = title;
        this.genre = genre;
        this.description = description;
        this.director = director;
        this.actors = actors;
        this.rating = rating;
        this.revenue = revenue;
    }

    public Movie(){

    }

    public Movie buildmethod(){
        return new Movie();
    }


    public int getRank() {
        return rank;
    }

    public Movie setRank(int rank) {
        this.rank = rank;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Movie setYear(int year) {
        this.year = year;
        return this;
    }

    public int getMinutes() {
        return minutes;
    }

    public Movie setMinutes(int minutes) {
        this.minutes = minutes;
        return this;
    }

    public int getVotes() {
        return votes;
    }

    public Movie setVotes(int votes) {
        this.votes = votes;
        return this;
    }

    public int getMetascore() {
        return metascore;
    }

    public Movie setMetascore(int metascore) {
        this.metascore = metascore;
        return this;
    }

    public String getTitle() {
        return title;

    }

    public Movie setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Movie setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Movie setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDirector() {
        return director;
    }

    public Movie setDirector(String director) {
        this.director = director;
        return this;
    }

    public String getActors() {
        return actors;
    }

    public Movie setActors(String actors) {
        this.actors = actors;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Movie setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public float getRevenue() {
        return revenue;
    }

    public Movie setRevenue(float revenue) {
        this.revenue = revenue;
        return this;
    }

}
