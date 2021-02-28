package com.psl.movies.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import com.psl.movies.classes.Movies;

public class SerializaDeserialize {
	public List<Movies> populateMovies(File file)
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
			       // System.out.println("ignoring line: " + line);
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
	
	public void serializeMovies(List<Movies> movies, String fileName)
	{
		try {
			FileOutputStream fileOut = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(movies);
			out.close();
			fileOut.close();
			System.out.println("\nSerialization Successful... Checkout your specified output file..\n");
 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	}
	
	public	static ArrayList<Movies> deserializeMovies(String fileName)
	{
		ArrayList<Movies> movies=new ArrayList<Movies>();
		try {
			FileInputStream fileIn = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(fileIn);
			try {
				movies=(ArrayList<Movies>)in.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return movies;
	}
	
//	public static void main(String[] args)
//	{
//		String fPath = "C:\\Users\\hp\\eclipse-workspace\\Assignment9\\File1.txt";
//		File fread=new File(fPath);
//		SerializaDeserialize sd=new SerializaDeserialize();
//		List<Movies> movieList=sd.populateMovies(fread);
//		sd.serializeMovies(movieList, "FileSerialized.txt");
//		ArrayList<Movies> movie=deserializeMovies("FileSerialized.txt");
//		System.out.println(movie);
//	//C:\\Users\\hp\\eclipse-workspace\\Assignment9\\FileSerialized.txt
//	}

}
