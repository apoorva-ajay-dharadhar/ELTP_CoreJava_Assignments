package com.psl.training.files;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class NumberOfWordsInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileName=new File("C:\\Users\\hp\\eclipse-workspace\\Ass5_Apoorva_Dharadhar\\src\\com\\psl\\training\\files\\Movies.txt");
		Scanner obj=null;
		String[] lines = null;
		int i=0;
		int wordCount=0;
		String line="";
		try {
			obj=new Scanner(fileName);
			
			while(obj.hasNext())
			{
				line=obj.nextLine();
				String[] arr=line.split( "[\\s,]+" );
				wordCount=wordCount+arr.length;
				for(int k=0;k<arr.length;k++)
				System.out.println(arr[k]);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(wordCount);
		obj.close();
		
	}

}
