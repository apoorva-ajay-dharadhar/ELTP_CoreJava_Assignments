package com.psl.assignments;
import java.util.*;
public class IsPrime {
static boolean isPrimeNumber( int num)
{
	int m=num/2;
	int flag=0;
	if(num==0||num==1)
	{
		return false;
	}
	else
	{
	for(int i=2;i<=m;i++)
	{
		if(num%i==0)
		{
			flag=1;
		}
	}
	if(flag==0)
	{
		return true;
	}
	else
	{
		return false;
	}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		boolean ans=isPrimeNumber(number);
		if(ans==true)
		{
			System.out.println(number+" is a prime number");
		}
		else
		{
			System.out.println(number+" is not a prime number");
		}
	}

}
