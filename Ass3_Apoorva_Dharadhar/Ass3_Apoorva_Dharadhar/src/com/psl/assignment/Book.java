package com.psl.assignment;

public class Book 
{
	//book_title, book_price, book_author and book_publication. 
	private String book_title;
	private double book_price;
	private String book_publication;
	
	public void setBookTitle(String book_title)
	{
		this.book_title=book_title;
	}
	public String getBookTitle()
	{
		return book_title;
	}
	public void setBookPrice(double book_price)
	{
		this.book_price=book_price;
	}
	public double getBookPrice()
	{
		return book_price;
	}
	public void setBookPublication(String book_publication)
	{
		this.book_publication=book_publication;
	}
	public String getBookPublication()
	{
		return book_publication;
	}
	

}
