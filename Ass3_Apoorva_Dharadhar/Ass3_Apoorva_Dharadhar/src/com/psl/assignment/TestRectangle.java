package com.psl.assignment;
import java.util.*;
public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangleOne=new Rectangle();
		int len=0, brd=0;
		System.out.println("Enter the length of the rectange for rectangle 1:");
		Scanner sc=new Scanner(System.in);
		len=sc.nextInt();
		System.out.println("Enter the breadth of the rectange for rectangle 1:");
		brd=sc.nextInt();
		Rectangle r1=new Rectangle(len,brd);
		
		
		System.out.println("Enter the length of the rectange for rectangle 2:");
		len=sc.nextInt();
		System.out.println("Enter the breadth of the rectange for rectangle 1:");
		brd=sc.nextInt();
		Rectangle r2=new Rectangle(len,brd);
		
		
		System.out.println("Enter the length of the rectange for rectangle 3:");
		len=sc.nextInt();
		System.out.println("Enter the breadth of the rectange for rectangle 3:");
		brd=sc.nextInt();
		Rectangle r3=new Rectangle(len,brd);
		
		r1.calculateArea(r1.getLength(), r1.getBreadth());
		r2.calculateArea(r2.getLength(), r2.getBreadth());
		r3.calculateArea(r3.getLength(), r3.getBreadth());
		
		
		
		/*
		 *Design different class TestRectangle class in separate source file, w
		 * which will contain main function. From this main function, create 3 Rectangle 
		 * objects by taking all necessary information from the user.
		 * 
		 * */
		
		

	}

}
