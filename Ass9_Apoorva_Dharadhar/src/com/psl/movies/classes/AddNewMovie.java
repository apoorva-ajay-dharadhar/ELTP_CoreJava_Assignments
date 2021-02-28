package com.psl.movies.classes;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.psl.movies.db.MovieDataToDB;
import com.psl.movies.file.WriteToFile;

public class AddNewMovie {
	
	public void addMovie()
	{
		Scanner sc=new Scanner(System.in);
		Movies m=new Movies();
		System.out.println("****************Adding new movie**************");
		System.out.println("Enter movie ID");
		int id=sc.nextInt();
		sc.nextLine();
		m.setMovieId(id);
		System.out.println("Enter movie Name");
		String movie=sc.nextLine();
		m.setMovieName(movie);
		System.out.println("Enter Total Business Done");
		double business=sc.nextDouble();
		m.setTotalBusinessDone(business);
		System.out.println("Enter movie ratings");
		double rating=sc.nextDouble();
		sc.nextLine();
		m.setRating(rating);
		System.out.println("Enter releaseDate(yyy-mm-dd)");
		  String string =sc.nextLine();
		  //System.out.println(string);
		  java.sql.Date date = Date.valueOf(string);
		  m.setReleaseDate(date);
		System.out.println("Enter movie language");
		String lang=sc.nextLine();
		m.setLanguage(lang);
		System.out.println("Enter movie type");
		String type=sc.nextLine();
		m.setMovieType(type);
		
		System.out.println("Enter the number of actors");
		int n=sc.nextInt();
		sc.nextLine();
		List<String> actorList=new ArrayList<String>();
		System.out.println("Enter the actor names");
		for(int i=0;i<n;i++)
		{
			String s=sc.nextLine();
			actorList.add(s);
		}
		m.setCasting(actorList);
		
		MovieDataToDB md=new MovieDataToDB();
		md.insertMovies(m);
		WriteToFile wr=new WriteToFile();
		wr.write(m);
		
	}
	
//	public static void main(String[] args)
//	{
//		AddNewMovie am=new AddNewMovie();
//		am.addMovie();
//	}
}
