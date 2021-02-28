package com.psl.training.threads;

import com.psl.training.threads.tasks.FindAverage;
import com.psl.training.threads.tasks.FindSum;
import com.psl.training.threads.tasks.SearchElement;
import com.psl.training.threads.tasks.SortElements;

public class MultipleTasksByMultipleThreadsWithoutJoin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindAverage t1=new FindAverage();
		FindSum t2=new FindSum();
		SearchElement t3=new SearchElement();
		SortElements t4=new SortElements();
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
