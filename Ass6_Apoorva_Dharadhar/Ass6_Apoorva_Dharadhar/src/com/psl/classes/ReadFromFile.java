package com.psl.classes;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFromFile {
	
	
	public HashMap<String, String> read()
	{
		String fPath = "C:\\Users\\hp\\eclipse-workspace\\Employee\\src\\com\\psl\\classes\\File1.txt";
	    HashMap<String, String> map = new HashMap<String, String>();

	    String line;
	    BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(fPath));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
			while ((line = reader.readLine()) != null)
			{
			    String[] parts = line.split(":", 2);
			    if (parts.length >= 2)
			    {
			        String key = parts[0];
			        String value = parts[1];
			        map.put(key, value);
			    } else {
			        System.out.println("ignoring line: " + line);
			    }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	    try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return map;
	}
	
	/*public static void main( String[] args ) throws IOException
	{
	    String fPath = "C:\\Users\\hp\\eclipse-workspace\\Employee\\src\\com\\psl\\classes\\File1.txt";
	    HashMap<String, String> map = new HashMap<String, String>();

	    String line;
	    BufferedReader reader = new BufferedReader(new FileReader(fPath));
	    while ((line = reader.readLine()) != null)
	    {
	        String[] parts = line.split(":", 2);
	        if (parts.length >= 2)
	        {
	            String key = parts[0];
	            String value = parts[1];
	            map.put(key, value);
	        } else {
	            System.out.println("ignoring line: " + line);
	        }
	    }

	    for (String key : map.keySet())
	    {
	        System.out.println(key + ":" + map.get(key));
	    }
	    reader.close();
	}*/

}
