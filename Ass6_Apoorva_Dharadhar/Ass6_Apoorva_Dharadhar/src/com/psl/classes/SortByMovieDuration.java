package com.psl.classes;

import java.util.Comparator;
import java.util.List;

public class SortByMovieDuration {

	public void sortByDuration(List<Movies> lm)
	{
		lm.sort(Comparator.comparing(Movies::getDuration));
		for(Movies m: lm)
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
