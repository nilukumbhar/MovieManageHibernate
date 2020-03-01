package com.techdenovo.moviemanagehibernate.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.techdenovo.Utility.HiberUtility;
import com.techdenovo.moviemanagehibernate.model.Movie;

@WebServlet("/AddMovie")
public class AddMovieServlet extends HttpServlet{
private static final long serialVersionUID = 1L;     
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String MovieName = request.getParameter("MovieName");
		String MovieDecsription = request.getParameter("MovieDescription");
		
		if(!(MovieName.isEmpty()) || !(MovieDecsription.isEmpty())) {
		    Movie movie = new Movie();
			movie.setMovie_name(MovieName);
			movie.setMovie_description(MovieDecsription);
			
			SessionFactory sessionFactory = HiberUtility.getSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			session.save(movie);
			session.flush();
			tx.commit();
			session.close();
			response.sendRedirect("sucess.jsp");
		}
		
	}

}


