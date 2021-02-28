package com.psl.classes;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
public void clearFile()
{
	FileWriter fileWriter = null;
	
	try {
		fileWriter = new FileWriter("C:\\Users\\hp\\eclipse-workspace\\Employee\\src\\com\\psl\\classes\\File1.txt");
		fileWriter.write("");
		System.out.println("String written in file");
	}catch(Exception e)
	{
		System.out.println("Exception caught");
		e.printStackTrace();
	}
try {
		fileWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
