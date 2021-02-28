package com.psl.assignment;

public class Tablet extends Medicine{
	//Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine.
//store in a cool dry place
	public Tablet(String name, String address)
	{
		super(name, address);
	}
	public void displayLabel()
	{
		System.out.println("CompanyName:"+getCompanyName()+" CompanyAddress:"+ getCompanyAddress());
		System.out.println("Store the tablets in a cool dry place.");
	}

}
