package com.psl.training.threads;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFileInDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Folder1 f1=new Folder1();
	Folder2 f2=new Folder2();
	Folder3 f3=new Folder3();
	Folder4 f4=new Folder4();
	
	
		f1.start();
	try
	{
		f1.join();
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	f2.start();
	try
	{
		f2.join();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	f3.start();
	try
	{
		f3.join();
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
	}
	f4.start();
	try
	{
		f4.join();
	}catch(InterruptedException e)
	{
		e.printStackTrace();
	}

	}

}
