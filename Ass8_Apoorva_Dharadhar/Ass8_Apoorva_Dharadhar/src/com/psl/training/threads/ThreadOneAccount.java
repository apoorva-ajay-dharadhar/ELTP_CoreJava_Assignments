package com.psl.training.threads;

public class ThreadOneAccount extends Thread{
	Account acc1=new Account();
	
	public ThreadOneAccount(Account acc1)
	{
		this.acc1=acc1;
	}
	
	public void run()
	{
		acc1.acc("HDFC0001");
	}

}
