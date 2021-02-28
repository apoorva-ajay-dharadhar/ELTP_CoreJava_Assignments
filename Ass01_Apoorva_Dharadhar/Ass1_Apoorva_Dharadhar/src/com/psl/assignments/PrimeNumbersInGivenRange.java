package com.psl.assignments;
import java.util.*;
public class PrimeNumbersInGivenRange {
	static void isPrimeNumber(int num)
 {
		
		for(int i=2;i<=num;i++)
		{
			int flag=0;
			 for(int j=2;j<=i/2;j++)
			 {
				 if(i%j==0)
				 {
					 flag=1;
					 break;
				 }
			 }
		 if(flag==0)
		 {
			 System.out.println(i);
		 }
}
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value upto which prime numbers are to be printed");
		int rangeValue=sc.nextInt();
		PrimeNumbersInGivenRange pr=new PrimeNumbersInGivenRange();
		isPrimeNumber(rangeValue);
	}

}
