package com.psl.assignment;

import java.util.Random;
import java.util.Scanner;
public class TestMedicine {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Declare an array of Medicine references of size 10
 *Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 
 * */
		
		Medicine medicine[]=new Medicine[10];
		//Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 
		Scanner sc=new Scanner(System.in);
		
		Random rd=new Random();
		String name="", address="";
		for(int i=0;i<10;i++)
		{
			int val=rd.nextInt(4);
			if(val==0)
			{
				val=val+1;
			}
			switch(val) {
				case 1:
				{
					System.out.println("Enter the name of the company of tablet");
					name=sc.nextLine();
					System.out.println("Enter the address of the company of tablet");
					address=sc.nextLine();
					medicine[i]=new Tablet(name, address);
					medicine[i].displayLabel();
					break;
				}
				case 2:
				{
					System.out.println("Enter the name of the company of syrup");
					name=sc.nextLine();
					System.out.println("Enter the address of the company of syrup");
					address=sc.nextLine();
					medicine[i]=new Tablet(name, address);
					medicine[i].displayLabel();
					break;
				}
				case 3:
				{
					System.out.println("Enter the name of the company of ointment");
					name=sc.nextLine();
					System.out.println("Enter the address of the company of ointment");
					address=sc.nextLine();
					medicine[i]=new Ointment(name, address);
					medicine[i].displayLabel();
					break;
				}
			}
		
		}
	}
}
		
	