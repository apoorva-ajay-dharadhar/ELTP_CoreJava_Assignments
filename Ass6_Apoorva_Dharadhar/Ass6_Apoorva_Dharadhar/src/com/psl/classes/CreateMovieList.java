package com.psl.classes;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class CreateMovieList {
	public Movies createMovieList(String movName, String movLang, String dt, String director, String producer, int hours)
	{
		List<Movies> movieList=new ArrayList<Movies>();
		Movies movie=new Movies();
			movie.setName(movName);
			
			movie.setLang(movLang);
			
			movie.setReleaseDate(dt);
			
			movie.setDirector(director);
			
			movie.setProducer(producer);
			
			movie.setDuration(hours);
			
		
		
		return movie;
	}
}
