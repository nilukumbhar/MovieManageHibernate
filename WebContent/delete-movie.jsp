<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
<%@include file="NewMenu.jsp" %>
<form action="DeleteMovieServlet" method="post">

<div class="row">
      
   		<div class="col-md-3"></div>
   		<div class="col-md-6">
	   
		  	<div class="form-group">
			    <label for="inputMovieId">Id</label>
			    <input type="text" class="form-control" id="inputMovieId" aria-describedby="emailHelp" name="movie-id"  value="${movie.movie_id}" readonly="readonly"/>	   
		  	</div>
		   <div class="form-group">
			    <label for="inputMovieName">  MovieName</label>
			    <input type="text" class="form-control" id="inputMovieName" aria-describedby="emailHelp" name="movie-name"  value="${movie.movie_name}"/>	   
		  	</div>
		   <div class="form-group">
			    <label for="inputMovieDescription"> MovieDescription</label>
			    <input type="text" class="form-control" id="inputMovieDescription" aria-describedby="emailHelp" name="movie-description" value="${movie.movie_description}"/>
		  </div>	 
		  <button type="submit" class="btn btn-primary">Delete Movie</button>
		
	</div>
	</div>
	</form>
</div>

<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
</body>
</html>
</html>