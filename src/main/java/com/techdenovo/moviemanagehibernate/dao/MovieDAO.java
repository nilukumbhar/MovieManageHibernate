package com.techdenovo.moviemanagehibernate.dao;

import java.util.List;

import com.techdenovo.moviemanagehibernate.model.Movie;

public interface MovieDAO {
	    public List<Movie> getAllMovies();
		public Long addMovie(Movie movie);

}
