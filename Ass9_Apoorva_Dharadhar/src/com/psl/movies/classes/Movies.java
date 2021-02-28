package com.psl.movies.classes;


import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class Movies implements Serializable, Comparable<Movies>{
private int movieId;
private String movieName;
private double totalBusinessDone;
private double rating;
private Date releaseDate;
private String language;
private String movieType;
private List<String> casting;
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public String getMovieName() {
	return movieName;
}
public void setMovieName(String movieName) {
	this.movieName = movieName;
}
public double getTotalBusinessDone() {
	return totalBusinessDone;
}
public void setTotalBusinessDone(double totalBusinessDone) {
	this.totalBusinessDone = totalBusinessDone;
}
public double getRating() {
	return rating;
}
public void setRating(double rating) {
	this.rating = rating;
}
public Date getReleaseDate() {
	return releaseDate;
}
public void setReleaseDate(Date releaseDate) {
	this.releaseDate = releaseDate;
}
@Override
public String toString() {
	return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", totalBusinessDone=" + totalBusinessDone
			+ ", rating=" + rating + ", releaseDate=" + releaseDate + ", language=" + language + ", movieType="
			+ movieType + ", casting=" + casting + "]";
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public String getMovieType() {
	return movieType;
}
public void setMovieType(String movieType) {
	this.movieType = movieType;
}
public List<String> getCasting() {
	return casting;
}
public void setCasting(List<String> casting) {
	this.casting = casting;
}

@Override
public int compareTo(Movies o) {
	return (int) (this.getTotalBusinessDone() - o.getTotalBusinessDone());
}
}
