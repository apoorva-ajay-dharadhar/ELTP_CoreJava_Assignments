package com.psl.classes;

import java.sql.Date;
import java.util.Comparator;

public class Movies implements Comparable<Movies>{
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		ReleaseDate = releaseDate;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	private String lang;
	private String ReleaseDate;
	private String director;
	private int duration;
	private String producer;
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	@Override
	public int compareTo(Movies o) {
		// TODO Auto-generated method stub
		int last = this.lang.compareTo(o.lang);
		return last == 0 ? this.ReleaseDate.compareTo(o.ReleaseDate) : last;
		
	}
	
	
	
}
