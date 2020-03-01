<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
			    <span class="navbar-toggler-icon"></span>
		 </button>
			  <a class="navbar-brand" href="#" >Movie Management</a>
			
		 <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
			 <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
			    <li class="nav-item dropdown ">
			        <div class="dropdown"> 
					  <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    Movie
					  </a>
					
					  <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					   <a class="dropdown-item" href="<%=request.getContextPath()%>/ListServlet">list Movie</a>
					    <a class="dropdown-item" href="<%=request.getContextPath()%>/Movie?action=insert">Add Movie</a>
					     <a class="dropdown-item" href="#">Edit Movie</a>
					    <a class="dropdown-item" href="#">Update Movie</a>
					    <a class="dropdown-item" href="#">Delete Movie</a>
					  </div>
					 </div> 
			    </li>
			    <li class="nav-item">
			          <div class="dropdown"> 
			          <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    Actor
					  </a>
			         <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
			            <a class="dropdown-item" href="<%=request.getContextPath()%>/Actor?action=list">list Actor</a>
					    <a class="dropdown-item" href="<%=request.getContextPath()%>/Actor?action=insert">Add Actor</a>
					    <a class="dropdown-item" href="#">Edit Actor</a>
					    <a class="dropdown-item" href="#">Update Actor</a>
					    <a class="dropdown-item" href="#">Delete Actor</a>
					  </div>
					  </div>
			    </li>
			     <li class="nav-item">
			        <div class="dropdown"> 
			          <a class="nav-link dropdown-toggle" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
					    Director
					  </a>
			         <div class="dropdown-menu" aria-labelledby="dropdownMenuLink">
					    <a class="dropdown-item" href="#">Add Director</a>
					    <a class="dropdown-item" href="#">Edit Director</a>
					    <a class="dropdown-item" href="#">Update Director</a>
					    <a class="dropdown-item" href="#">Delete Director</a>
					  </div>
					  </div>
			     </li>
			</ul>
			    
		 </div>
	</nav>
</body>
</html>