package com.psl.training.threads;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account ac=new Account();
		ThreadOneAccount t1=new ThreadOneAccount(ac);
		ThreadTwoAccount t2=new ThreadTwoAccount(ac);
		t1.start();
		t2.start();

	}

}
