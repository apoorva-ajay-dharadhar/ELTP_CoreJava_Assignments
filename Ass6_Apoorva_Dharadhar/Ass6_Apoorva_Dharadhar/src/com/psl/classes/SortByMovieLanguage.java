package com.psl.classes;

import java.util.Comparator;
import java.util.List;

public class SortByMovieLanguage{

	public void sortByLang(List<Movies> movieList)
	{
		String[] movieLang=new String[movieList.size()];
		int i=0;
		for(Movies m1: movieList)
		{
			movieLang[i]=m1.getLang();
			i++;
		}
		for(int j=0;j<i;j++)
		{
			System.out.println(movieLang[j]);
		}
		
		movieList.sort(Comparator.comparing(Movies::getLang));
		
		for(Movies m: movieList)
		{
			System.out.println("Movie Name:"+m.getName()+""
					+ "Movie Language:"+m.getLang()+""
						   +"Movie Director:"+m.getDirector()+
							"Movie Producer:"+m.getProducer()+
							"Movie Duration:"+m.getProducer()+
							"Movie Release Date:"+m.getReleaseDate()
					
					);
		}
	}

	
	
	
		
	
}
