package com.psl.assignments;
import java.util.*;
public class ElectricityBill {
//method for domestic connection
	static float ratePerUnit;
	static double domesticConnection(int consumedUnits)
	{
		double bill=0;
		if(consumedUnits<=100)
		{
			double tempValue;
			ratePerUnit=4;
			tempValue=consumedUnits*ratePerUnit;
			if(tempValue>250)
			{
				bill=tempValue;
			}
			else
			{
				bill=250;
			}
			
		}
		if(consumedUnits>100 && consumedUnits<=300)
		{
			ratePerUnit=4.5f;
			bill=consumedUnits*ratePerUnit;
		}
		if(consumedUnits>300 && consumedUnits<=500)
		{
			ratePerUnit=4.75f;
			bill=consumedUnits*ratePerUnit;
		}
		if(consumedUnits>500)
		{
			ratePerUnit=5;
			bill=consumedUnits*ratePerUnit;
		}
		return bill;
	}
	
	static double commercialConnection(int consumedUnits)
	{
		double bill=0;
		if(consumedUnits<=100)
		{
			double tempValue;
			ratePerUnit=4.25f;
			tempValue=consumedUnits*ratePerUnit;
			if(tempValue>350)
			{
				bill=tempValue;
			}
			else
			{
				bill=350;
			}
			
		}
		if(consumedUnits>100 && consumedUnits<=300)
		{
			ratePerUnit=4.75f;
			bill=consumedUnits*ratePerUnit;
		}
		if(consumedUnits>300 && consumedUnits<=500)
		{
			ratePerUnit=5f;
			bill=consumedUnits*ratePerUnit;
		}
		if(consumedUnits>500)
		{
			ratePerUnit=5.25f;
			bill=consumedUnits*ratePerUnit;
		}
		return bill;
	}
	//method for commercial connection
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the type of connection");
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
	//	String inp=input.toLowerCase();
		
	if(input.equalsIgnoreCase("Commercial"))
	{
		System.out.println("Enter the consumed units");
		int units=sc.nextInt();
		double Bill=commercialConnection(units);
		System.out.println("Bill Amount:"+Bill);
	}
	else if(input.equalsIgnoreCase("Domestic"))
	{
		System.out.println("Enter the consumed units");
		int units=sc.nextInt();
		double Bill=domesticConnection(units);
		System.out.println("Bill Amount:"+Bill);
	}
	else
	{
		System.out.println("Enter a valid choice");
	}
		
	}

}
