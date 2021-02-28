package com.psl.training.threads;

public class RequestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ServiceDesk sd=new ServiceDesk();
		Thread t1=new Thread(new ServiceDesk());
		Thread t2=new Thread(new ServiceDesk());
		Thread t3=new Thread(new ServiceDesk());
		Thread t4=new Thread(new ServiceDesk());
		
		t1.start();
		try
		{
			t1.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		t2.start();
		try
		{
			t2.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		t3.start();
		try
		{
			t3.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		t4.start();
		try
		{
			t4.join();
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
