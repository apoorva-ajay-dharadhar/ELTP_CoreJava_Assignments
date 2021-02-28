package com.psl.assignments;
import java.util.*;
public class IncomeEarned {
static float calculateProfit( int numAttendees)
{
	int totalTicketCost=numAttendees*5;
	float PerformanceCost=(float) (20+(0.50*numAttendees));
	float income=totalTicketCost-PerformanceCost;
	return income;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of attendees");
		int attendees=sc.nextInt();
		float incomeShowEarns=calculateProfit(attendees);
		System.out.println("Income:"+incomeShowEarns);
		
	}

}
