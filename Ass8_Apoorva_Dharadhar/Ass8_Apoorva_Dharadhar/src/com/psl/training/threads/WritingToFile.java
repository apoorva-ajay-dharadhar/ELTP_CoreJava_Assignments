package com.psl.training.threads;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile{

	synchronized public void  WriteTo()
	{
		FileWriter fileWriter =null;
		try {
			fileWriter=new FileWriter("C:\\Users\\hp\\Desktop\\Example\\Folder1\\File1.txt");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			Thread t=Thread.currentThread();
			System.out.println(t.getName());
			
			//fileWriter.write(str);
			
			fileWriter.append("This is line written by thread /1:"+t.getName());
			fileWriter.append("\n");
			fileWriter.append("\n");
			
			
			//
			System.out.println("String written in file");
		}catch(Exception e)
		{
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	try {
		  try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	

}
