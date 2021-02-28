package com.psl.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class UniversalPrint {

	static void print(Collection c) {
		Iterator itr=c.iterator();
       while(itr.hasNext())
       {
    	   System.out.println(itr.next());
       }
    }
	
	public static void printMap(Map<?, ?> map) {
	    for (Map.Entry<?, ?> entry : map.entrySet()) {          
	         System.out.println( entry.getKey() + " " + entry.getValue() );
	    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("**********************HashSet********************");
	        Set<String> set=new HashSet<String>();
	        set.add("abc");
	        set.add("abc");
	        set.add("def");
	        print(set);
	        
	        System.out.println("**********************LinkedHashSet********************"); 
	        Set<Integer> lset=new LinkedHashSet<Integer>();
	        lset.add(1);
	        lset.add(100);
	        lset.add(100);
	        print(lset);
	        
	        System.out.println("**********************TreeSet********************");
	        Set<String> ts=new TreeSet<String>();
	        ts.add("aabbcc");
	        ts.add("ddeeff");
	        ts.add("awsedr");
	        print(ts);
	        
	        System.out.println("**********************ArrayList********************");
	        List<Integer> list=new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(3);
	        list.add(4);
	        print(list);
	        
	        
	        System.out.println("**********************Vector********************");
	        List<String> vect=new Vector<String>();
	        vect.add("a");
	        vect.add("b");
	        vect.add("c");
	        vect.add("d");
	        vect.add("d");
	        print(vect);
	        
	        System.out.println("**********************LinkedList********************");
	        List<Integer> linkedList=new LinkedList<Integer>();
	        linkedList.add(9);
	        linkedList.add(7);
	        linkedList.add(1);
	        linkedList.add(7);
	        print(linkedList);
	        
	        System.out.println("**********************HashMap<Integer, Integer>********************");
	        Map<Integer, Integer> mp=new HashMap<Integer,Integer>();
	        mp.put(1, 2);
	        mp.put(3, 4);
	        mp.put(5, 6);
	        mp.put(7, 8);
	        printMap(mp);
	        
	        
	        System.out.println("**********************HashMap<Integer, String>********************");
	        Map<Integer, String> mp1=new HashMap<Integer,String>();
	        mp1.put(1, "a");
	        mp1.put(2, "b");
	        mp1.put(3, "c");
	        mp1.put(4, "d");
	        printMap(mp1);
	        
	        System.out.println("**********************LinkedHashMap<String, Integer>********************");
	        Map<String, Integer> mp2=new HashMap<String, Integer>();
	        mp2.put("a", 1);
	        mp2.put("a", 2);
	        mp2.put("b", 3);
	        mp2.put("d", 4);
	        printMap(mp2);
	        
	        
	        System.out.println("**********************TreeMap<String, String>********************");
	        Map<String, String> mp3=new HashMap<String, String>();
	        mp3.put("a", "z");
	        mp3.put("a", "y");
	        mp3.put("a", "y");
	        mp3.put("b", "x");
	        mp3.put("d", "w");
	        printMap(mp3);
	        
	        
	        
	        
	}
	

}
