package com.techdenovo.moviemanagehibernate.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.moviemanagehibernate.dao.MovieDAO;
import com.techdenovo.moviemanagehibernate.dao.MovieDAOImpl;
import com.techdenovo.moviemanagehibernate.model.Movie;


@WebServlet("/ListServlet")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ListServlet() {
        super();
    }
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		MovieDAO movieDAO = new MovieDAOImpl();
		List<Movie> movies = movieDAO.getAllMovies();
		if(!movies.isEmpty()) {
			request.setAttribute("listMovies", movies);
			RequestDispatcher dispatcher =request.getRequestDispatcher("movie-list.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
