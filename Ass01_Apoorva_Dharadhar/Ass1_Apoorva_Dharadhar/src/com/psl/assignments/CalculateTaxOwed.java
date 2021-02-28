package com.psl.assignments;
import java.text.DecimalFormat;
import java.util.*;

public class CalculateTaxOwed {
	private static int taxPercent=0;
static double calTax(int gp)
{
	double payableAmount=0;
	if(gp<=240)
	{
		taxPercent=0;
		payableAmount=0;
	}
	else if(gp==240 || gp<480)
	{
		taxPercent=15;
		payableAmount=0.15*gp;
	}
	else if(gp>=480)
	{
		taxPercent=28;
		payableAmount=0.28*gp;
	}
	return payableAmount;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the gross pay amount");
		int grossPay=sc.nextInt();
		double payableTaxAmount=calTax(grossPay);
		DecimalFormat df=new DecimalFormat("########.##");
		
		System.out.println("Amount of tax owed:"+df.format(payableTaxAmount));
	}

}
