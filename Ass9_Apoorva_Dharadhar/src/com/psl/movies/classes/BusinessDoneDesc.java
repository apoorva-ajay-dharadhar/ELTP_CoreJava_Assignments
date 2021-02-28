package com.psl.movies.classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.psl.movies.db.ConnectionUtil;

public class BusinessDoneDesc {
//Set<Movies> businessDone(double amount)
	Connection cn=ConnectionUtil.getConnection();
	public TreeSet<Movies> businessDone(double amount)
	{
		TreeSet<Movies> movieSet = new TreeSet<Movies>();// (TreeSet<Object>)treeSet.descendingSet();
		//System.out.println("Enter the amount");
		Scanner sc=new Scanner(System.in);
		//double amt=sc.nextDouble();
		
		try {
			String query="select * from moviesTable where TotalBusinessDone>"+amount+";";
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery(query);
			Statement st1=cn.createStatement();
			
			while(rs.next())
			{
				int movieId=rs.getInt(1);
				String movieN=rs.getString(2);
				double TotalBusinessDone =rs.getDouble(3);
				 double rat=rs.getDouble(4);
				 Date dt=rs.getDate(5);
				 String language=rs.getString(6);
				 String movieType=rs.getString(7);
				 String actors=rs.getString(8);
				 Movies m1=new Movies();
				 m1.setMovieId(movieId);
				 m1.setMovieName(movieN);
				 m1.setTotalBusinessDone(TotalBusinessDone);
				 m1.setRating(rat);
				 m1.setReleaseDate(dt);
				 m1.setLanguage(language);
				 m1.setMovieType(movieType);
				 List<String> actorList=new ArrayList<String>();
				 actorList.add(actors);
				 m1.setCasting(actorList);
				 movieSet.add(m1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	//	System.out.println(movieSet);
		 TreeSet<Movies> res = (TreeSet<Movies>)movieSet.descendingSet();
		 //System.out.println(res);
		return res;
		
	}
	
	
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		BusinessDoneDesc bd=new BusinessDoneDesc();
//		TreeSet<Movies> m=bd.businessDone(5000);
//		//Map<String, Double> movieMap=new HashMap<String, Double>();
//		//Map<String, Set<Movies>> map=new HashMap<String, Set<Movies>>();
//		
//		
//	}
}
