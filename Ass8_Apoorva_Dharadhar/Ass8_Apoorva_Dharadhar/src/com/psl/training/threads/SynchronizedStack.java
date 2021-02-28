package com.psl.training.threads;

import java.util.Stack;

class MainClassObj
{
	synchronized public void method()
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName());
		System.out.println("Accessed");
	}
}

class ThreadOne extends Thread
{
	MainClassObj mc1=new MainClassObj();
	public ThreadOne(MainClassObj mc1)
	{
		this.mc1=mc1;
	}
	public void run()
	{
		mc1.method();
	}
}

class ThreadTwo extends Thread
{
	MainClassObj mc2=new MainClassObj();
	public ThreadTwo(MainClassObj mc2)
	{
		this.mc2=mc2;
	}
	
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mc2.method();
	}
}

class AccessObj
{
	public void method1(Stack s2)
	{
		ThreadTwo t2=(ThreadTwo) s2.pop();
		ThreadOne t1=(ThreadOne) s2.pop();
		t1.run();
		t2.run();
		
	}
}


public class SynchronizedStack {

	
	public static void main(String[] args)
	{
		MainClassObj mc=new MainClassObj();
		
		Stack<Object> st=new Stack<Object>();
		ThreadOne t1=new ThreadOne(mc);
		ThreadTwo t2=new ThreadTwo(mc);
		st.push(t1);
		st.push(t2);
		
		AccessObj ao=new AccessObj();
		ao.method1(st);
		
	}
}
