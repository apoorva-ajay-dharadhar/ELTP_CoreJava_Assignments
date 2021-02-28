package com.psl.assignments;
import java.text.DecimalFormat;
//import java.text.DecimalFormat;
import java.util.Scanner;
public class CalculateInterestAmount {

	private float rate=0;
	static double calInterest(int amt) 
	{
		float rate=0;
		if(amt<=1000)
		{
			rate=4;
		}
		else if(amt>1000 && amt<=5000)
		{
			rate=4.5f;
		}
		else
		{
			rate=5;
		}
		double InterestAmount=0;
		InterestAmount=(amt*rate)/100;
		return InterestAmount;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter the deposit amount");
	Scanner sc=new Scanner(System.in);
	int amount=0;
	boolean correctAmt=false;
	while(correctAmt!=true)
	{
		amount=sc.nextInt();
		if(amount<0)
		{
			System.out.println("Please enter a valid deposit amount");
			correctAmt=false;
		}
		else
		{
			correctAmt=true;
		}
		
	}
	
	double calculatedInterestAmount=calInterest(amount);
	DecimalFormat df=new DecimalFormat("####.##");
	System.out.println("Interest Amount for deposit of "+amount+" is:"+df.format(calculatedInterestAmount));
	}

}
