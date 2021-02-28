package com.psl.movies.file;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import com.psl.movies.classes.Movies;

public class WriteToFile {
	
	public void write(Movies movie) {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Assignment9\\File1.txt");

		FileWriter fr;
		try {
			fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			PrintWriter pr = new PrintWriter(br);
			int id=movie.getMovieId();
			String mv=movie.getMovieName();
			double business=movie.getTotalBusinessDone();
			double rating=movie.getRating();
			Date dt=movie.getReleaseDate();
			String lang=movie.getLanguage();
			String type=movie.getMovieType();
			List<String> actorNames=movie.getCasting();
			String entry="";
			
			
			String Id=String.valueOf(id);
			String bus=String.valueOf(business);
			String rtg=String.valueOf(rating);
			String dates=dt.toString();
			String actname="";
			for(int i=0;i<actorNames.size();i++)
			{
			 actname=actname+""+actorNames.get(i)+",";
			}
			String data=id+","+mv+","+actname+""+lang+","+type+","+rtg+","+dates+","+bus;
			//System.out.println()
			//pr.println(data);
			pr.println(data);
			
			
			
			pr.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
			
}
