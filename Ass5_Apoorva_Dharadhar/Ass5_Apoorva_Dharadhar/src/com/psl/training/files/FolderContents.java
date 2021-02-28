package com.psl.training.files;
import java.io.File;
import java.util.*;

public class FolderContents {
public static File[] fileArray;
	//Public void displayFolderContents(String path)
	public void displayFolderContents(File path)
	{
		//File dirName=new File(path);
		//displayFolderContents(contentArr[i]);
		int isDir=check(path);
		
		//File[] contents
		if(isDir==0)
		{
			
			//System.out.println("Confirmed that it is a Directory");
			//is a directory
			//File name=new File(path);
			File[] contentArr=path.listFiles();
			
			//System.out.println("Returned from 2 to 3....");
			for(int i=0;i<contentArr.length;i++)
			{
				//displayFolderContents(contentArr[i]);
				//System.out.println("Entered inside the directory- Checking for more files and directories");
				if(contentArr[i].isDirectory())
				{
					
					//System.out.println("One more Directory found"+contentArr[i]+"... Navigating inside that directory ");
					displayFolderContents(contentArr[i]);
					/*System.out.println("Confirmed that it is a Directory-2");
					File[] fileArr=checkForDirectory(contentArr[i]);
					for(int j=0;j<fileArr.length;j++)
					{
						System.out.println(fileArr[j]);
					}*/
					
				}
				
				else
				{
					
				System.out.println("Directory Name:"+path+"         File Name:"+contentArr[i].getName());
				}
				}
		}
		else if(isDir==1)
		{
			//is a file
			//File name=new File(path);
			File[] contentArr=path.listFiles();
			for(int i=0;i<contentArr.length;i++)
			{
				System.out.println("Directory Name:"+path+"         File Name:"+contentArr[i].getName());
			}
		}
		else 
		{
			System.out.println("Invalid path");
		}
		
		/*for(int i=0;i<contentArr.length;i++)
		{
			//System.out.println("'''''''''''''''''''''''''"+contentArr[i]);
			if(contentArr[i].isFile())
			{
				System.out.println(contentArr[i]);
			}
			else if(contentArr[i].isDirectory())
			{
				
			}
		}*/
	}
	
	public static File[] checkForDirectory(File name)
	{
//File name=new File(Dirname);
		int val=0;
		
		if(name.exists() && name.isDirectory())
		{
			//System.out.println(name+" is a valid Directory");
			fileArray=name.listFiles();
		//	System.out.println("Stage2");
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
		FolderContents folderContents=new FolderContents();
		File dirName=new File(dirPath);
	folderContents.displayFolderContents(dirName);
		
	}

}
