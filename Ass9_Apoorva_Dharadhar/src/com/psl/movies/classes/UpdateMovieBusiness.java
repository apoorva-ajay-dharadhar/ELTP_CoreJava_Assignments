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

public class UpdateMovieBusiness {
	
	Connection cn=ConnectionUtil.getConnection();
	public List<Movies> updateBusiness()
	{
		List<Movies> m=new ArrayList<Movies>();
		
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the name of the movie you want to update?");
			String movieName=sc.nextLine();
			System.out.println("Enter the updated business");
			double updatedB=sc.nextDouble();
			String query="update moviesTable set TotalBusinessDone="+updatedB+" where movieName like '%"+movieName+"%';";
						//update moviesTable set TotalBusinessDone=234556 where movieName like '%DDLJ%'; 
			Statement st=cn.createStatement();
			st.executeUpdate(query);
			Statement st1=cn.createStatement();
			String selectQuery="select * from moviesTable;";
			Statement st11=cn.createStatement();
			ResultSet rs1=st11.executeQuery(selectQuery);
		//	ResultSet rs1=st11.executeQuery(selectQuery);
			while(rs1.next())
			{
				// movieId | movieName          | TotalBusinessDone | rating | releaseDate | language | movieType       | actors      
				int movieId=rs1.getInt(1);
				String movieN=rs1.getString(2);
				double TotalBusinessDone =rs1.getDouble(3);
				 double rat=rs1.getDouble(4);
				 Date dt=rs1.getDate(5);
				 String language=rs1.getString(6);
				 String movieType=rs1.getString(7);
				 String actors=rs1.getString(8);
				 Movies m1=new Movies();
				 m1.setMovieId(movieId);
				 m1.setMovieName(movieName);
				 m1.setTotalBusinessDone(updatedB);
				 m1.setRating(rat);
				 m1.setReleaseDate(dt);
				 m1.setLanguage(language);
				 m1.setMovieType(movieType);
				 List<String> actorList=new ArrayList<String>();
				 actorList.add(actors);
				 m1.setCasting(actorList);
				 m.add(m1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	return m;
		
		}
	
	
	public static void main(String[] args)
	{
		UpdateMovieBusiness updateB=new UpdateMovieBusiness();
		 List<Movies> m1=updateB.updateBusiness();
		 System.out.println(m1);
	}

}
