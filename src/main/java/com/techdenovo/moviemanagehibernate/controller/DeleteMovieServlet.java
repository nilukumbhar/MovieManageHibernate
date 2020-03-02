package com.techdenovo.moviemanagehibernate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.moviemanagehibernate.dao.MovieDAO;
import com.techdenovo.moviemanagehibernate.dao.MovieDAOImpl;
import com.techdenovo.moviemanagehibernate.model.Movie;


@WebServlet("/DeleteMovieServlet")
public class DeleteMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DeleteMovieServlet() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
     Long id =Long.parseLong(request.getParameter("id"));
		
		MovieDAO movieDAO = new MovieDAOImpl();
	    Movie movie = movieDAO.findById(id);
		request.setAttribute("movie", movie);
		RequestDispatcher dispatcher =request.getRequestDispatcher("delete-movie.jsp");
		dispatcher.forward(request, response);
	}
		
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id =Long.parseLong(request.getParameter("movie-id"));
		String movieName = request.getParameter("movie-name");
		String movieDecsription = request.getParameter("movie-description");
		
		    Movie movie = new Movie();
		    movie.setMovie_id(id);
			movie.setMovie_name(movieName);
		    movie.setMovie_description(movieDecsription);
			System.out.println(movie.getMovie_id()+ movie.getMovie_name()+ movie.getMovie_description());
			MovieDAO movieDAO = new MovieDAOImpl();
			movieDAO.deleteMovie(movie);
			
	        response.sendRedirect("sucess.jsp");
		}
}
