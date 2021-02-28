package com.psl.assignment.four;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import psl.com.exceptions.InvalidInputException;
public class Movie {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc=new Scanner(System.in);
	 
		try
		{
			FileWriter fw=new FileWriter("movies1.txt");
			String inp=sc.next();
			boolean ans=false;
			
			String[] arr=inp.split(",");
			if(arr.length==3)
			{
				try
				{
					int val=Integer.parseInt(arr[0]);
				}
				catch(NumberFormatException e)
				{
					System.out.println("Enter the movie ID correctly");
				}
				ans=true;
				if(ans==true)
				{
					fw.write(inp);
					
				}
				fw.close();
			}
			else
			{
				fw.close();
				throw new InvalidInputException("Enter valid information, i.e ID, name, date");
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
		
	}


