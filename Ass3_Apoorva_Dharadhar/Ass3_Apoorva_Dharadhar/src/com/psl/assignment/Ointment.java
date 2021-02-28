package com.psl.assignment;

public class Ointment extends Medicine{
	/*
	 * Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine.
	 * for external use only
	 * */
	public Ointment(String name, String address)
	{
		super(name, address);
	}
	public void displayLabel()
	{
		System.out.println("CompanyName:"+getCompanyName()+" CompanyAddress:"+ getCompanyAddress());
		System.out.println("Ointments are for external use only.");
	}

}
