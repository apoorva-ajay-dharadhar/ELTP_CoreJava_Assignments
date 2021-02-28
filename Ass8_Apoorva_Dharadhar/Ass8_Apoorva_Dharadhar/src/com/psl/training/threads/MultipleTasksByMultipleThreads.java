package com.psl.training.threads;

import com.psl.training.threads.tasks.FindAverage;
import com.psl.training.threads.tasks.FindSum;
import com.psl.training.threads.tasks.SearchElement;
import com.psl.training.threads.tasks.SortElements;

public class MultipleTasksByMultipleThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAverage t1=new FindAverage();
		FindSum t2=new FindSum();
		SearchElement t3=new SearchElement();
		SortElements t4=new SortElements();
		
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
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		

	
	}

}
