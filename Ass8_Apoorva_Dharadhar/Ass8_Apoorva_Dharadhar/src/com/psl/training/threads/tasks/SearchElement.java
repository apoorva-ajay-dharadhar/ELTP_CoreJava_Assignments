package com.psl.training.threads.tasks;

public class SearchElement extends Thread{
	
	public void run()
	{
	//	Thread t=Thread.currentThread();
		//System.out.println(t.getName()+" STARTED execution ");
		int element=0;
		int search=0;
		int[] array= {1,7,3,9,3,2,0};
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==search)
			{
				System.out.println("Element found at the location "+i);
			}
		}
		
		//System.out.println(t.getName()+" ENDED execution");
	}
	
}
