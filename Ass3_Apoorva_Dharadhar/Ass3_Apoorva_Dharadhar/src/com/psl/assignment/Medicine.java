package com.psl.assignment;

public class Medicine {
	private String companyName;
	private String companyAddress;
	public Medicine(String companyName, String companyAddress)
	{
		this.companyName=companyName;
		this.companyAddress=companyAddress;
	}
	
	public void setCompanyName(String companyName)
	{
		this.companyName=companyName;
	}
	public String getCompanyName()
	{
		return companyName;
	}
	
	public void setCompanyAddress(String companyAddress)
	{
		this.companyAddress=companyAddress;
	}
	public String getCompanyAddress()
	{
		return companyAddress;
	}

	public void displayLabel()
	{
		System.out.println("CompanyName:"+getCompanyName()+" CompanyAddress:"+ getCompanyAddress());
	}
	//displayLabel() in this class to print Name and address of the company. 
}
