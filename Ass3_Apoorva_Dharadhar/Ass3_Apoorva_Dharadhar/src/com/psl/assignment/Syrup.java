package com.psl.assignment;

public class Syrup extends Medicine{
//Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine.
	
	public Syrup(String name, String address)
	{
		super(name, address);
	}
	public void displayLabel()
	{
		System.out.println("CompanyName:"+getCompanyName()+" CompanyAddress:"+ getCompanyAddress());
		System.out.println("Syrups should be placed in a cool dry place.");
	}
}
