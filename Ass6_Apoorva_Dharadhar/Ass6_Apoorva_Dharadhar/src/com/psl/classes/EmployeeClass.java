package com.psl.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeClass {

	public int totalVehicles(List<Vehicles> lv)
	{
		int cnt=0;
		for(Vehicles v: lv)
		{
			cnt++;
		}
		System.out.println("*************Returned Count***************"+cnt);
		return cnt;
	}
	
	public void addVehicle()
	{
		
		Scanner sc=new Scanner(System.in);
		
	}
	
	public static void main(String[] args)
	{
		EmployeeClass e[]=new EmployeeClass[2];
		
		
		Scanner sc=new Scanner(System.in);
		String ans="y";
		
		for(int i=0;i<2;i++)
		{
			List<Vehicles> vehList=new ArrayList<Vehicles>();	
			e[i]=new EmployeeClass();
			System.out.println("Enter the Vehicle details for Employee "+(i+1));
			while(ans.equalsIgnoreCase("y"))
			{
					System.out.println("Do you want to add a vehicle?(y/n)");
					 ans=sc.next();
					 sc.nextLine();
					 if(ans.equalsIgnoreCase("y"))
					 {

					 String vehicleCompany="";
						String vehicleType="";
						System.out.println("Enter the vehicle's type(two-wheeler/four-wheeler)?");
						vehicleType=sc.nextLine();
						System.out.println("Enter the vehicle's company?");
						vehicleCompany=sc.nextLine();
						Vehicles v=new Vehicles();
						
						v.setName(vehicleCompany);
						v.setType(vehicleType);
						vehList.add(v);
						 }
			 else
			 {
				 ans="y";
				 break;
			 }			
			}
		
			System.out.println("Total number of vehicles owned by Employee"+i+" are"+e[i].totalVehicles(vehList));
			
		}
		
		
		
		
	}
}
