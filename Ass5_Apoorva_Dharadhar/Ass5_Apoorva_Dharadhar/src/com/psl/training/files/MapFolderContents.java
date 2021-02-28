package com.psl.training.files;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapFolderContents {
	public static File[] fileArray;
	static Map<String,File> hashMap=new HashMap<String,File>(); 
	public static void print()
	{
		Set<String> set=hashMap.keySet();
		for(String st : set)
		{
			System.out.println(st+",                     "+hashMap.get(st));
		}
	}
	public void displayFolderContents(File path)
	{
		int isDir=check(path);
	
		if(isDir==0)
		{
			File[] contentArr=path.listFiles();
			for(int i=0;i<contentArr.length;i++)
			{
				if(contentArr[i].isDirectory())
				{
					displayFolderContents(contentArr[i]);
				}
				else
				{
					
					hashMap.put(contentArr[i].getName(), path);
				//System.out.println("Directory Name:"+hashMap.get(path)+"         File Name:"+contentArr[i]);
				}
				}
		}
		else if(isDir==1)
		{
			File[] contentArr=path.listFiles();
			for(int i=0;i<contentArr.length;i++)
			{
				hashMap.put(contentArr[i].getName(), path);
				//System.out.println("Directory Name:"+path+"         File Name:"+contentArr[i].getName());
			}
		}
		else 
		{
			System.out.println("Invalid path");
		}
	
	}
	
	public static File[] checkForDirectory(File name)
	{

		int val=0;
		
		if(name.exists() && name.isDirectory())
		{
			fileArray=name.listFiles();
			val=0;
		}
		else if(name.exists() && name.isFile())
		{
			val=1;
		}
		else
		{
			val=2;
		}
		return fileArray;
	}
	
	public static int check(File name)
	{
		int val=0;
		if(name.exists() && name.isDirectory())
		{
		val=0;
	//	System.out.println("Stage 1");
		}
		else if(name.exists() && name.isFile())
		{
			val=1;
		}
		else
		{
			val=2;
		}
		return val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the directory path");
		String dirPath=sc.nextLine();
		MapFolderContents folderContents=new MapFolderContents();
		File dirName=new File(dirPath);
	folderContents.displayFolderContents(dirName);
		print();
	}

}
