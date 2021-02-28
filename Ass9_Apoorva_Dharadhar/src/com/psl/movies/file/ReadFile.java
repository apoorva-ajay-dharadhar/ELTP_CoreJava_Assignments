package com.psl.movies.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import com.psl.movies.db.*;
import com.psl.movies.classes.Movies;

public class ReadFile {
	public static List<Movies> populateMovies(File file)
	{
		//String fPath = "C:\\Users\\hp\\eclipse-workspace\\Assignment9\\File1.txt";
		List<Movies> populateM=new ArrayList<Movies>();
		
	    String line;
	    BufferedReader reader = null;
	  
		try {
			//reader = new BufferedReader(new FileReader(fPath));
			
			if(file.isFile())
			{
				FileReader fr=new FileReader(file);
				reader = new BufferedReader(fr);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
	    	
			while ((line = reader.readLine()) != null)
			{
				Movies m=new Movies();
			    String[] parts = line.split(",");
			    if (parts.length >= 9)
			    {
			    	List<String> actors=new ArrayList<String>();
			        m.setMovieId(Integer.parseInt(parts[0]));//1
			        m.setMovieName(parts[1]);//Dil
			        actors.add(parts[2]);//amir
			        actors.add(parts[3]);//preeti
			        m.setCasting(actors);
			        m.setLanguage(parts[4]);//hindi
			        m.setMovieType(parts[5]);//romantic-comedy
			        m.setRating(Double.parseDouble(parts[6]));//5
			        String string =parts[7];
					java.sql.Date date = Date.valueOf(string);
					m.setReleaseDate(Date.valueOf(string));
			        m.setTotalBusinessDone(Double.parseDouble(parts[8]));//amount
			        
			    } else {
			        System.out.println("ignoring line: " + line);
			    }
			    populateM.add(m);
			}
			
			
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try
	    {
	    	reader.close();
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	
	    return populateM;
	    
	  
	
	  
	}
	
	
	public static void main(String[] args)
	{
		List<Movies> m=new ArrayList<Movies>();
		
		String fPath = "C:\\Users\\hp\\eclipse-workspace\\Assignment9\\File1.txt";
		File fread=new File(fPath);
		m=populateMovies(fread);
//		FinMoviesByYear fm=new FinMoviesByYear();
//		fm.searchMovie(m);
		for(Movies ms:m)
		{
//			MovieDataToDB md=new MovieDataToDB();
//			md.insertMovies(ms);
	//	System.out.println(ms);
			MovieDataToDB md=new MovieDataToDB();
			md.insertMovies(ms);
		}
		
		
	
		
	}

}
