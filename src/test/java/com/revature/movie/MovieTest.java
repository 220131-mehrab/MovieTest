package com.revature.movie;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * The MovieTest is testing the buildmethod from the movie class.
 */

public class MovieTest {
@Test
    public void MovieTest(){
    Movie testMovie = new Movie().buildmethod()
            .setRank(3)
            .setTitle("Split")
            .setGenre("Horror, Thriller")
            .setDescription("Three girls are kidnapped.")
            .setDirector("M. Night Shyamalan")
            .setActors("James McAvoy, Anya Taylor-Joy, Haley Lu Richardson, Jessica Sula")
            .setYear(2016)
            .setMinutes(117)
            .setRating(7.3f)
            .setVotes(157606)
            .setRevenue(138.12f)
            .setMetascore(65);

    Assertions.assertEquals(157606, testMovie.getVotes());

}
}
