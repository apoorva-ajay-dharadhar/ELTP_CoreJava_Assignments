package com.psl.training.files;
import java.io.File;
import java.util.*;
public class SearchFile {
	public boolean printFileName(File[] fileArr, int index, String fileName)
	{
		int flag=0;
		if(fileArr.length==index)
		{
			return false;
		}
		else
		{
		
			for(int i=0;i<fileArr.length;i++)
			{
				if(fileArr[i].isFile() && (fileArr[i].getName().endsWith(".pptx")|| fileArr[i].getName().endsWith(".txt") || fileArr[i].getName().endsWith(".xlsx") || fileArr[i].getName().endsWith(".pdf")) && fileArr[i].getName().equals(fileName)) 
		           {
					flag=1;
					break;
		           }
				else
				{
					flag=0;
				}
				
			}
		}
		if(flag==1)
		{
			  //Will return true if file found
			return true;
		}
		else
		{
		//Will return false if file not found
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mainDirPath="";//"C:\\Users\\hp\\Desktop\\TestDir";
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path in which file is to searched");
		mainDirPath=sc.nextLine();
		File maindir = new File(mainDirPath); 
		if(maindir.exists() && maindir.isDirectory()) 
		{
        String fileToBeSearched="";
        System.out.println("Enter the name of the File to be searched");
        SearchFile sf=new SearchFile();
        boolean ans=false;
        fileToBeSearched=sc.nextLine();
        File arr[] = maindir.listFiles();
       
        	
        	  
			ans=sf.printFileName(arr, 0, fileToBeSearched);
			if(ans==true)
			{
				System.out.println(fileToBeSearched+" found!!!!!!!!!!");
			}
			else
			{
				System.out.println(fileToBeSearched+" not found..");
			}
		}
        else
        {
        	System.out.println("Invalid Directory");
        }
	}

}
