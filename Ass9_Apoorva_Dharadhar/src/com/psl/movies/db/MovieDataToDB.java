package com.psl.movies.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.psl.movies.classes.Movies;



public class MovieDataToDB {
	

	Connection cn=ConnectionUtil.getConnection();
	public  void insertMovies(Movies m)
	{
		PreparedStatement pstmt = null;
		try {
			pstmt = cn.prepareStatement("insert into moviesTable values(?,?,?,?,?,?,?,?)");
			pstmt.setInt(1,m.getMovieId());
			pstmt.setString(2, m.getMovieName() );
			pstmt.setDouble(3, m.getTotalBusinessDone());
			pstmt.setDouble(4, m.getRating() );
			pstmt.setDate(5,m.getReleaseDate());
			pstmt.setString(6, m.getLanguage());
			pstmt.setString(7, m.getMovieType());
			String newString="";
			for(String a:m.getCasting())
			{
			newString=newString+a+" ";
			}
			newString=newString.toLowerCase();
			pstmt.setString(8, newString);
			pstmt.executeUpdate();
		
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
	}
	
	

}
