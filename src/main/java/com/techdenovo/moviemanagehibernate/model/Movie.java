package com.techdenovo.moviemanagehibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="MOVIE")
public class Movie {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOVIE_Id")
	private Long movie_id;
	
	@Column(name="MOVIE_NAME")
	private String movie_name;
	
	@Column(name="MOVIE_DESCRIPTION")
	private String movie_description;
	
	
	
	public Movie() {
		super();		
	}

	public Movie(Long movie_id, String movie_name, String  movie_description ) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_description = movie_description;
	}

	public Long getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Long movie_id) {
		this.movie_id = movie_id;
	}

	public String getMovie_name() {
		return movie_name;
	}

	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}

	public String getMovie_description() {
		return movie_description;
	}

	public void setMovie_description(String movie_description) {
		this.movie_description = movie_description;
	}
}
