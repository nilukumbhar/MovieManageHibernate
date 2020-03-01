package com.techdenovo.moviemanagehibernate.dao;

import org.hibernate.Session;

import com.techdenovo.Utility.HiberUtility;
import com.techdenovo.moviemanagehibernate.model.Movie;

public class MovieDAOImpl implements MovieDAO {
	    @Override
		public Long addMovie(Movie movie) {
			Session session = (Session) HiberUtility.getSessionFactory();
			Long id =(Long) session.save(movie);
			return null;
		}

	}


