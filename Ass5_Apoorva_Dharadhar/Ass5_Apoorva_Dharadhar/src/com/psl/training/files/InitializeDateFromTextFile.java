package com.psl.training.files;
import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;
public class InitializeDateFromTextFile {

	public static void main(String[] args) {
		String fileName = "C:\\Users\\hp\\eclipse-workspace\\Ass5_Apoorva_Dharadhar\\src\\com\\psl\\training\\files\\Movies.txt";
		File file = new File(fileName);
		
		Scanner obj = null;
		try {
			obj = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(obj.hasNext())
		{
			System.out.println(obj.nextLine());
		}
		obj.close();
	
		}    
	
}


