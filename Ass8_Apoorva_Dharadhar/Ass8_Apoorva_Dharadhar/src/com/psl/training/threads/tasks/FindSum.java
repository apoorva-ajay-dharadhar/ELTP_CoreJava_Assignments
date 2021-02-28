package com.psl.training.threads.tasks;

public class FindSum extends Thread{
	
	public void run()
	{
		//Thread t=Thread.currentThread();
		//System.out.println(t.getName()+" STARTED execution ");
		int sum=0;
		for(int i=0;i<10;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is: "+sum);
	//	System.out.println(t.getName()+" ENDED execution");
	}

}
