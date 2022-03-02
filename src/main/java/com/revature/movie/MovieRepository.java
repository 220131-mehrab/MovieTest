package com.revature.movie;

import java.util.List;

public interface MovieRepository {
    Movie getMovie(String name);
    List<Movie> getMovieList();
}
