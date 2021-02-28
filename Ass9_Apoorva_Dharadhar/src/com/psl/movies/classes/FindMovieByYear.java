package com.psl.movies.classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.psl.movies.db.ConnectionUtil;


public class FindMovieByYear {
	Connection cn=ConnectionUtil.getConnection();
	public List<Movies> searchMovie()//List<Movies>
	{
		List<Movies> m=new ArrayList<Movies>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year by which you wish to search the movies");
		String year=sc.nextLine();
		String query="select * from moviesTable where releaseDate like '%"+year+"%';";
		try {
			Statement stmt = cn.createStatement();
			 ResultSet rs = stmt.executeQuery(query);
			 while(rs.next())
			 {
				 int movieId=rs.getInt(1);
				// System.out.println(movieId);
				 String movieName=rs.getString(2);
				 //System.out.println(movieName);
				 double TotalBusinessDone =rs.getDouble(3);
				 double rating=rs.getDouble(4);
				 Date dt=rs.getDate(5);
				 String language=rs.getString(6);
				 String movieType=rs.getString(7);
				 String actors=rs.getString(8);
				 Movies m1=new Movies();
				 m1.setMovieId(movieId);
				 m1.setMovieName(movieName);
				 m1.setTotalBusinessDone(TotalBusinessDone);
				 m1.setRating(rating);
				 m1.setReleaseDate(dt);
				 m1.setLanguage(language);
				 m1.setMovieType(movieType);
				 List<String> actorList=new ArrayList<String>();
				 actorList.add(actors);
				 m1.setCasting(actorList);
				 m.add(m1);
				 /* TotalBusinessDone | rating | releaseDate | language | movieType       | actors*/
			 }
//			  int id  = rs.getInt("movieId");
//			  System.out.print("ID: " + id);
			  rs.close();
			  cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
		
	}
	
	
	public static void main(String[] args)
	{
//		FindMovieByYear fm=new FindMovieByYear();
//		List<Movies> m=fm.searchMovie();
//		System.out.println(m);
	}
//	
//	public static void main(String[] args)
//	{
//		FindMoviesByYear fy=new FindMoviesByYear();
//		FindMovieByYear 
//		List<Movies> m=fy.searchMovie();
//		System.out.println(m);
//	}
//	

}
