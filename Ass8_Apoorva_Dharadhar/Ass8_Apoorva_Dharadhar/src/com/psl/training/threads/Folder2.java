package com.psl.training.threads;

import java.io.File;
import java.io.IOException;

public class Folder2 extends Thread{
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" is executing");
		String path1="C:\\Users\\hp\\Desktop\\Example\\Folder2";
		File f1=new File(path1);
		if(f1.exists() && f1.isDirectory()) {
			File fN1=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File1.txt");
			try {
				fN1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			File fN2=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File2.txt");
			try {
				fN2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			File fN3=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File3.txt");
			try {
				fN3.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			File fN4=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File4.txt");
			try {
				fN4.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			File fN5=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File5.txt");
			try {
				fN5.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			File fN6=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File6.txt");
			try {
				fN6.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			File fN7=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File7.txt");
			try {
				fN7.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			File fN8=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File8.txt");
			try {
				fN8.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			File fN9=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File9.txt");
			try {
				fN9.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			File fN10=new File("C:\\Users\\hp\\Desktop\\Example\\Folder2\\File10.txt");
			try {
				fN10.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(t.getName()+" stopped executing");	
	}
}
