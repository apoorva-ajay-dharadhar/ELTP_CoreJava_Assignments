package com.psl.classes;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

class myDateComparator implements Comparator<Employee> 
{ 
    public int compare(Employee s1, Employee s2) 
    { 
        return s1.getJoiningDate().compareTo(s2.getJoiningDate()); 
    } 
} 

public class TreeSetUserDefinedObject {
	public static void DisplayInfo(TreeSet<Employee> employees)
	{
		System.out.println(employees);
	}
	
	public static void DisplayDateComparison(TreeSet<Employee> employees1,Date d)
	{
	for(Employee emp: employees1)
	{
		Date d1=emp.getJoiningDate();
		if(d1.compareTo(d) < 0)
		{
			System.out.println(emp);
		}
	}
//	Display all employees who have joined organization before entered date.
		
			
	}

	
	public static void completedSixMonths(TreeSet<Employee> employees1)
	{
		for(Employee e: employees1)
		{
			
			Date date=e.getJoiningDate();

			Calendar cal = Calendar.getInstance();
			
			cal.setTime(date);
			String ap1="";
			if(cal.get(Calendar.DATE)<10)
			{
				ap1="0"+cal.get(Calendar.DATE);
			}
			else
			{
				ap1=ap1+cal.get(Calendar.DATE);
			}
			
			String ap2="";
			if(cal.get(Calendar.MONTH)<10)
			{
				ap2="0"+(cal.get(Calendar.MONTH)+1);
			}
			else
			{
				ap2=ap2+(cal.get(Calendar.MONTH)+1);
			}
	
			String f1=cal.get(Calendar.YEAR)+"-"+ap2+"-"+ap1;
			
			LocalDate localDate=LocalDate.parse(f1);
		
			 LocalDate returnvalue 
	            = localDate.plusMonths(6); 
		
			 if(returnvalue.isBefore(LocalDate.now()))
			 {
				 System.out.println(e.getFirstName()+" Completed probation");
			 }
	  
		}
		  
	}

	
	public static void findMonths()
	{
		
		
	}
	
	public static void displayDesc(TreeSet<Employee> employees1)
	{
		TreeSet<Employee> intsReverse =
	            (TreeSet<Employee>)employees1.descendingSet();
		System.out.println(intsReverse);
		
	}
	
	public static void main(String[] args)
	{
		
		TreeSet<Employee> m= new TreeSet<Employee>(new myDateComparator()); 
		SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yy");
	      Date d1 = null,d2=null,d3=null;
		try {
			d1 = sdformat.parse("12/03/1998");//12/03/2019  //15/01/2019
		    d2 = sdformat.parse("15/07/2018");//  //12/09/2019
		    d3 = sdformat.parse("01/01/2021");//01/06/2020 //01/12/2020
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee e1=new Employee();
		e1.setEmpId(1090);
		e1.setFirstName("abc");
		e1.setJoiningDate(d1);
		
		Employee e2=new Employee();
		e2.setEmpId(1020);
		e2.setFirstName("def");
		e2.setJoiningDate(d2);
		
		Employee e3=new Employee();
		e3.setEmpId(1030);
		e3.setFirstName("ghi");
		e3.setJoiningDate(d3);
		

		m.add(e1);
		 m.add(e2);
		 m.add(e3);
		Scanner sc=new Scanner(System.in);
	
		DisplayInfo(m);
		System.out.println("********************************************************");
		System.out.println("Displaying all employees who have joined organization before entered date.");
		System.out.println("Enter a date:");
		String input=sc.nextLine();
		Date d4=null;
	try {
			d4=sdformat.parse(input);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		DisplayDateComparison(m,d4);
		System.out.println("********************************************************");
		completedSixMonths(m);
		System.out.println("********************************************************");
		//findMonths(m);
		displayDesc(m);
		System.out.println("********************************************************");
		
	}
}
