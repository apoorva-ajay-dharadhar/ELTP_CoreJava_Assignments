package com.psl.training.threads;

public class Account {
	
	synchronized public void acc(String CustomerID)
	{
		Thread t=Thread.currentThread();
		System.out.println("Accessed by:"+t.getName());
		System.out.println("Bank Name: HDFC bank");
		System.out.println("Customer ID:"+CustomerID);
		
		
	}

}
