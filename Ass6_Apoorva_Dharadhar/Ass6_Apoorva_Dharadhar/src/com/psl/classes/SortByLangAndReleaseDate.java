package com.psl.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortByLangAndReleaseDate {
	
	public void sort(List<Movies> l)
	{
		
		ArrayList<Movies> al=new ArrayList<Movies>(); 
		for(Movies m: l)
		{
			al.add(m);
		}
		Collections.sort(al);
		for(Movies m: al)
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
