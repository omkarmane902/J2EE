package com.qsp.manytomany.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Actors {

	@Id
	private int id;
    private String name;
    
    
    
    @ManyToMany 
    List<Movies>Movies;
    
    
    public Actors() {
	}


	public Actors(int id, String name, List<com.qsp.manytomany.entity.Movies> movies) {
		super();
		this.id = id;
		this.name = name;
		Movies = movies;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Movies> getMovies() {
		return Movies;
	}


	public void setMovies(List<Movies> movies) {
		Movies = movies;
	}
    
    
    
    

}
