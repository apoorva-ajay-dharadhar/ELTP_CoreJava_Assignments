package com.psl.assignment;
import java.util.*;
public class Rectangle {
//declare private variables
	//getter setter
	//constructor default
	//parameterized 
	//Display information
	//calculate area
	/*
	 * Design different class TestRectangle class in separate source file,
	 * which will contain main function. From this main function, create 3 
	 * Rectangle objects by taking all necessary information from the user.
	 * */
	private int length;
	private int breadth;
	public Rectangle()
	{
		length=0;
		breadth=0;
	}
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void display(double calculatedArea)
	{
		System.out.println("Area of the rectangle with length "+getLength()+" and breadth "+getBreadth()+" is: "+calculatedArea);
	}
	public void calculateArea(int len, int bread)
	{
		double area=len*bread;
		display(area);
	}
	
	public void setLength(int length)
	{
		this.length=length;
	}
	public int getLength()
	{
		return length;
	}
	
	public void setBreadth(int breadth)
	{
		this.breadth=breadth;
	}
	public int getBreadth()
	{
		return breadth;
	}
	
}
