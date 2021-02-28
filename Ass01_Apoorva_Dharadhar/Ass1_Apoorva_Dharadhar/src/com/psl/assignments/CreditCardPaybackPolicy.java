package com.psl.assignments;
import java.util.*;
public class CreditCardPaybackPolicy {
static double computePaybackAmount(double charge)
{
	double paybackAmount=0;
	if(charge<=500)
	{
		paybackAmount=paybackAmount+(charge/100)*0.25;
		
	}
	else
	{
			paybackAmount=paybackAmount + (500/100)*0.25;
			charge=charge-500;
			if(charge<=1000)
			{
				paybackAmount=paybackAmount+(charge/100)*0.50;
			}
			else
			{
				paybackAmount=paybackAmount+(1000/100)*0.50;
				charge=charge-1000;
				
				if(charge<=1000)
				{
					paybackAmount=paybackAmount+(charge/100)*0.75;
				}
				else
				{
					paybackAmount=paybackAmount+(1000/100)*0.75;
					charge=charge-1000;
					
					if(charge>1)
					{
						paybackAmount=paybackAmount+(charge/100)*0.1;
					}
				}
			}
		}
	return paybackAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the charge amount");
		double inputCharge=sc.nextDouble();
		double amount=computePaybackAmount(inputCharge);
				System.out.println("Total payback amount for charge "+inputCharge+" is:"+amount);
	}

}
