package com.psl.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMovieClass {

	
	public static List<Movies> createList()
	{
		List<Movies> list=new ArrayList<Movies>();
		System.out.println("How many movie's details you want to enter?");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.nextLine();
		Movies[] movie=new Movies[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter - "
					+ "1)Movie Name"
					//+ "2)Movie Language"
					//+ "3)Movie Release Date"
					//+ "4)Movie Director"
					//+ "5)Movie Producer"
					//+ "6)Movie Duration"
					);
			String movieName=sc.nextLine();
		//ml.createMovieList();
		System.out.println("Enter 2)Movie Language");
		String movieLang=sc.nextLine();
		System.out.println("Enter 3)Movie Release Date");
		String date=sc.nextLine();
		System.out.println("Enter 4)Movie Director");
		String directorM=sc.nextLine();
		System.out.println("Enter 5)Movie Producer");
		String producerM=sc.nextLine();
		System.out.println("Enter 6)Movie Duration");
		int hoursM=sc.nextInt();
		sc.nextLine();
		CreateMovieList ml=new CreateMovieList();
		Movies mov=ml.createMovieList(movieName, movieLang, date, directorM, producerM, hoursM);
		list.add(mov);
		
	}
		return list;
	}
	
	public static void sortByMovieLanguage(List<Movies> li)
	{
		SortByMovieLanguage sl=new SortByMovieLanguage();
		sl.sortByLang(li);
	}
	
	public static void sortByDuration(List<Movies> movieList)
	{
		SortByMovieDuration sd=new SortByMovieDuration();
		sd.sortByDuration(movieList);
	}
	
	public static void SortByLanguageAndReleaseDate(List<Movies> movieList) 
	{
		SortByLangAndReleaseDate srd=new SortByLangAndReleaseDate();
		srd.sort(movieList);
		
	}
	public static void main(String[] args) {
		
		List<Movies> list=new ArrayList<Movies>();
		list=createList();
		sortByMovieLanguage(list);
		sortByDuration(list);
		SortByLanguageAndReleaseDate(list);
		
		}
		
		
	

}


/*for(Movies m1: list)
{
	System.out.println(m1.getName());
	System.out.println(m1.getLang());
	System.out.println(m1.getProducer());
	System.out.println(m1.getDirector());
	System.out.println(m1.getReleaseDate());
	System.out.println(m1.getDuration());
	
	
}*/
