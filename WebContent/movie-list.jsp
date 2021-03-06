<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">

    <form action="ListServlet" method="get">
	<%@include file="NewMenu.jsp" %>
	
	<div class="container">
		<div class="table-responsive">
	         	<table class="table">
				    <thead class="thead-dark">
						  <tr>
						    <th>ID</th>
							<th>Name</th>
							<th>Description</th>
							<th>Action</th>
						  </tr>
					</thead>
					<tbody>						
						<c:forEach var="movie" items="${listMovies}">
							<tr >								
								<td><c:out value="${movie.movie_id}"/></td>
								<td><c:out value="${movie.movie_name}"/></td>
								<td><c:out value="${movie.movie_description}"/></td>
								<td><a href="EditMovieServlet?id=${movie.movie_id}">Edit</a>  
								    <a href="DeleteMovieServlet?id=${movie.movie_id}">Delete</a>
								</td>
							</tr>
							
						</c:forEach>
					</tbody>
				</table>
	        </div>
	 </div>
	         
 </div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</form>
</body>
</html>