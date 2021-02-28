package com.psl.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class CityMapMain {
	
	public static void getCities()
	{
		
	}
	
	public static HashMap<String,String> readFromFile(HashMap<String,String> mapping)
	{
		ReadFromFile rf=new ReadFromFile();
		
		
		mapping=rf.read();
		for (String key : mapping.keySet())
	    {
	       System.out.println(key + ":" + mapping.get(key));
	    }
		return mapping;
	}
	
	public static void writeToFile(HashMap<String,String> maps)
	{
		WriteToTheFile wf=new WriteToTheFile();
		wf.writeToFile(maps);
		
	}
	
	public static void getKeySet(HashMap<String,String> maps)
	{
		for(String nm: maps.keySet())
		{
			System.out.println(nm);
		}
	}
	
	public static void getAllStates(HashMap<String,String> mp)
	{
		for(String nm: mp.keySet())
		{
			System.out.println(mp.get(nm));
		}
	}
	
	public static void getCityForState(HashMap<String,String> mp)
	{
		Scanner sc=new Scanner(System.in);
		List<String> states=new ArrayList<String>();
		System.out.println("Enter the state for which you wish to list the cities");
		String state=sc.nextLine();
		 for (Entry<String,String> entry : mp.entrySet()) {
		        if (entry.getValue().equals(state)) {
		            states.add(entry.getKey());
		        }
	}
		 System.out.println(states);
	}
	
	public static void deleteCitiesForState(HashMap<String,String> mp)
	{
		System.out.println("Enter the state for which you wish to delete all the cities");
		Scanner sc=new Scanner(System.in);
		String stateName=sc.nextLine();
		HashMap<String,String> hs=mp;
		 Iterator<Map.Entry<String, String> > 
         iterator = mp.entrySet().iterator(); 

     // Iterate over the HashMap 
     while (iterator.hasNext()) { 

         // Get the entry at this iteration 
         Map.Entry<String, String> 
             entry 
             = iterator.next(); 

         // Check if this value is the required value 
         if (stateName.equals(entry.getValue())) { 

             // Remove this entry from HashMap 
             iterator.remove(); 
         } 
     }
     System.out.println(mp);
     WriteToTheFile wf=new WriteToTheFile();
    wf.clearFile();
     wf.plain(mp);
     
		
		 
	}
	public static void main(String[] args)
	{
		HashMap<String, String> mapping = new HashMap<String, String>();
		HashMap<String, String> mapping1 = new HashMap<String, String>();
		CityMapMain cm=new CityMapMain();
		mapping1=readFromFile(mapping);
		
		System.out.println("Choose an option:"
				+ "1. Get all cities    "
				+ "2. Get All states    "
				+ "3. Get cities for a state    "
				+ "4. Add new city state pair    "
				+ "5. Delete all the cities for a given state    ");
		
		Scanner sc=new Scanner(System.in);
		int op=sc.nextInt();
	switch(op)
	{
	case 1:
	{
		getKeySet(mapping1);
		break;
	}
	case 2:
	{
		getAllStates(mapping1);
		break;
	}
	case 3:
	{
		getCityForState(mapping1);
		break;
	}
	case 4:
	{
		writeToFile(mapping);
		readFromFile(mapping);
		break;
	}
	case 5:
	{
		deleteCitiesForState(mapping1);
		break;
	}
	
	}
	
		
	}

}
