package com.techdenovo.moviemanagehibernate.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.techdenovo.Utility.HiberUtility;
import com.techdenovo.moviemanagehibernate.model.Movie;

public class MovieDAOImpl implements MovieDAO {
	
	private SessionFactory sessionFactory=HiberUtility.getSessionFactory();
	    @Override
		public Long addMovie(Movie movie) {
			Session session = sessionFactory.openSession();
			Transaction tx=  session.beginTransaction();
			Long id =(Long) session.save(movie);
			tx.commit();
			session.close();
			return id;
		}

		@SuppressWarnings("unchecked")
		@Override
		public List<Movie> getAllMovies() {
			Session session = sessionFactory.openSession();
	        List<Movie> movieList = session.createCriteria(Movie.class).list();
	        session.close();
			return movieList;
		}
		
	
		public Movie findById(Long id) {
			Session session = sessionFactory.openSession();
			Movie movie =(Movie)session.get(Movie.class,id);
			 session.close();
			return movie;
		}

		@Override
		public void updateMovie(Movie movie) {
			Session session = sessionFactory.openSession();
			Transaction tx=  session.beginTransaction();
			session.update(movie);
			tx.commit();
			session.close();
			
		}

	

		
}

