package com.psl.training.threads.tasks;

public class FindAverage extends Thread{
	public void run()
	{
	//	Thread t=Thread.currentThread();
		//System.out.println(t.getName()+" STARTED execution ");
		int[] arr= {1,3,2,8,7,0,4};
		double avg=0;
		int n=arr.length;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/n;
		System.out.println("Average is:"+avg);
	//	System.out.println(t.getName()+" ENDED execution");
	}

}
