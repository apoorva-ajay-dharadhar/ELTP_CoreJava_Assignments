package com.psl.classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.util.Map.Entry;
public class WriteToTheFile {
	
	public void clearFile()
	{
File file = new File("C:\\Users\\hp\\eclipse-workspace\\Employee\\src\\com\\psl\\classes\\File1.txt");
		
		FileWriter fr;
		try {
			
			PrintWriter writer = new PrintWriter(file);
			writer.print("");
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void plain(HashMap<String, String> mp)
	{
File file = new File("C:\\Users\\hp\\eclipse-workspace\\Employee\\src\\com\\psl\\classes\\File1.txt");
		System.out.println(mp);
		FileWriter fr=null;
		try {
			Scanner sc=new Scanner(System.in);
			 String data="";
			BufferedWriter br=null;
			PrintWriter pr=null;
		for (Entry<String,String> entry : mp.entrySet()) {
			       {
			    	   
			    	   String key=entry.getKey();
			    	   System.out.println("Key"+key);
			    	   String value=entry.getValue();
			    	   System.out.println("Value"+value);
			    	   data=key+":"+value;
			    	   fr = new FileWriter(file, true);
						br = new BufferedWriter(fr);
						pr = new PrintWriter(br);
			    	   pr.println(data);
			        }
		}
				
				//pr.println(data);
				pr.close();
				br.close();
				fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void writeToFile(HashMap<String,String> map)
	{
		File file = new File("C:\\Users\\hp\\eclipse-workspace\\Employee\\src\\com\\psl\\classes\\File1.txt");
		
		FileWriter fr=null;
		try {
			Scanner sc=new Scanner(System.in);
			System.out.println("Do you wish to add city-state pair to the file?");
			String ans=sc.nextLine();
			BufferedWriter br=null;
			PrintWriter pr=null;
			if(ans.equalsIgnoreCase("yes")||ans.equalsIgnoreCase("y"))
			{
				System.out.println("Enter the city");
				String city=sc.nextLine();
				System.out.println("Enter the corresponding state");
				String state=sc.nextLine();
				String data=city+":"+state;
				fr = new FileWriter(file, true);
				br = new BufferedWriter(fr);
				pr = new PrintWriter(br);
				pr.println(data);
				map.put(city, state);
			}
			else
			{
				return;
			}
			
			pr.close();
			br.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
