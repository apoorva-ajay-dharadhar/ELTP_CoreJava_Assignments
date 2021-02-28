package com.psl.training.threads;

public class ServiceDesk extends Thread{
	
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Customer request Queue...Service provided to:"+t.getName());
	}

}
