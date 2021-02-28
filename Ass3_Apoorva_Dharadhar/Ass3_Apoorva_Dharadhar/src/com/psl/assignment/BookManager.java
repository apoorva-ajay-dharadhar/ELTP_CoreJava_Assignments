package com.psl.assignment;
import java.util.*;
public class BookManager{

	public static void createBooks(Book books[])
	{
		Scanner sc=new Scanner(System.in);
		int len=books.length;
		String name="";
		for(int i=0;i<len;i++)
		{
			books[i]=new Book();
			System.out.println("Enter the name of the book");
			name=sc.nextLine();
			books[i].setBookTitle(name);
			System.out.println("Enter the price of the book");
			double bookPrice=sc.nextDouble();
			books[i].setBookPrice(bookPrice);
			sc.nextLine();
			
			System.out.println("Enter the publication of the book");
			String publicationName=sc.nextLine();
			books[i].setBookPublication(publicationName);
		}
		
		
	}
	
	public static void showBooks(Book[] books)
	{
		System.out.println("Title                 Price");
		for(int i=0;i<books.length;i++)
		{
				if(books[i].getBookTitle().length()>15)
		        {
					System.out.println(books[i].getBookTitle()+"      "+books[i].getBookPrice());
				}
			else
				{
				System.out.println(books[i].getBookTitle()+"              "+books[i].getBookPrice());
				}
		}	
	}
	public static void main(String[] args) {
		Book[] bks=new Book[2];
		createBooks(bks);
		showBooks(bks);
		
		/*
		 * createBooks and showBooks methods to create n objects of Book in an array.
		 *  Display the books along with its description as follows:-
			Book Title			    Price
			Java Programming		Rs.350.50
			Let Us C			    Rs.200.00
		 * */
		
		
		
	}

}
