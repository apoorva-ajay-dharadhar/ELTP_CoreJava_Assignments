package com.psl.movies.classes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import com.psl.movies.file.SerializaDeserialize;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Select operation to be performed");
		int opt=0;
		Scanner sc=new Scanner(System.in);
		opt=sc.nextInt();
		switch(opt)
		{
		case 1:
		{
			System.out.println("1. Add new movie in the list");
			AddNewMovie am=new AddNewMovie();
			am.addMovie();
			break;
		}
		case 2:
		{
			String fPath = "C:\\Users\\hp\\eclipse-workspace\\Assignment9\\File1.txt";
			File fread=new File(fPath);
			SerializaDeserialize sd=new SerializaDeserialize();
			List<Movies> movieList=sd.populateMovies(fread);
			sd.serializeMovies(movieList, "FileSerialized.txt");
		//	ArrayList<Movies> movie=sd.deserializeMovies("FileSerialized.txt");
			//System.out.println(movie);
			break;
		}
		case 3:
		{
			String fPath = "C:\\Users\\hp\\eclipse-workspace\\Assignment9\\File1.txt";
			File fread=new File(fPath);
			SerializaDeserialize sd=new SerializaDeserialize();
			System.out.println("3. Deserialize movies  from given files");
			ArrayList<Movies> movie=sd.deserializeMovies("FileSerialized.txt");
			System.out.println(movie);
			break;
		}
		case 4:
		{
			System.out.println("4. Find the Movies realeased in entered year");
			FindMovieByYear fm=new FindMovieByYear();
			List<Movies> m=fm.searchMovie();
			System.out.println(m);
			break;
		}
		case 5:
		{
			System.out.println("5. Find the list of movies by actor");

			FindMovieByActors actors=new FindMovieByActors();
			List<Movies> lm=actors.findByActor();
			System.out.println(lm);
			break;
		}
		case 6:
		{
			System.out.println("6. Update Movie Rating");
			UpdateMovieRating actors=new UpdateMovieRating();
			List<Movies> lm=actors.updateRating();
			System.out.println(lm);
			break;
		}
		case 7:
		{
			System.out.println("7. Update Business Done by Movie");
			UpdateMovieBusiness updateB=new UpdateMovieBusiness();
			 List<Movies> m1=updateB.updateBusiness();
			 System.out.println(m1);
			break;
		}
		case 8:
		{
			System.out.println("8. Find the set of movies as per the review comments  done business more than entered amount descending order of amount");
			BusinessDoneDesc bd=new BusinessDoneDesc();
			TreeSet<Movies> m=bd.businessDone(5000);
			System.out.println(m);
			break;
		}
		}
		
		
		
		
		
		
		
		
		
	}

}
