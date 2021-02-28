package com.psl.training.threads;

public class ThreadTwoAccount extends Thread{
	Account ad=new Account();

public ThreadTwoAccount(Account ad)
{
	this.ad=ad;
}

public void run()
{
	ad.acc("HDFC0002");
}
}
