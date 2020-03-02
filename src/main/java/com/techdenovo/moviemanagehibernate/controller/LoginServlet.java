package com.techdenovo.moviemanagehibernate.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techdenovo.moviemanagehibernate.dao.UserDAO;
import com.techdenovo.moviemanagehibernate.dao.UserDAOImpl;
import com.techdenovo.moviemanagehibernate.model.User;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    String errormsg="";   
    
    public LoginServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("Username");
		String password = request.getParameter("Password");
		
		if((!username.isEmpty())&&(!password.isEmpty())) {
			UserDAO userDAO = new UserDAOImpl();
			User user = userDAO.findUserByUserName(username);
			if (user!=null) {
				if (password.equals(user.getPassword())) {
					RequestDispatcher dispatcher =request.getRequestDispatcher("Dashboard.jsp");
					dispatcher.forward(request, response);
				}
				else {
					request.setAttribute("errormsg", "Invalid Username/Password");
					RequestDispatcher dispatcher =request.getRequestDispatcher("login.jsp");
					dispatcher.forward(request, response);
				}
				
			}
		}
	}
}
