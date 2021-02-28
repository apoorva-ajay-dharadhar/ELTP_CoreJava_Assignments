package com.psl.training.threads.tasks;

import java.util.ArrayList;
import java.util.List;

public class SortElements extends Thread{
	
	public void run()
	{
		//Thread t=Thread.currentThread();
		//System.out.println(t.getName()+" STARTED execution ");
		int[] arrayEle= {40,23,14,42,87,56,100};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arrayEle.length;i++)
		{
			for(int j=0;j<arrayEle.length-i-1;j++)
			{
				if(arrayEle[j]>arrayEle[j+1])
				{
					int num=arrayEle[j];
					arrayEle[j]=arrayEle[j+1];
					arrayEle[j+1]=num;
					
				}
			}
		}
		for(int i=0;i<arrayEle.length;i++)
		{
			list.add(arrayEle[i]);
		}
		System.out.println(list);
	//	System.out.println(t.getName()+" ENDED execution");
	}

}
