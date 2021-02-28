package com.psl.classes;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueCharacter {
	
	public static void print(HashMap<String, Integer> hm)
	{
		for(String st: hm.keySet())
		{
			System.out.println(st+":"+hm.get(st));
		}
	}
	
	public static void main(String[] args)
	{
		String[] str= {"abbcc","ssddee","kkjjhh","gghhtt", "abbcc"};
		
		int[] num = new int[10];
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		String st="";
		int sz=0;
		
		for(String s: str)
		{
			if(hm.containsKey(s))
			{
				System.out.println(s+":"+hm.get(s));
			}
			else
			{
			sz=0;
			HashSet<Character> hs=new HashSet<Character>();
			
			for(int i=0;i<str.length;i++)
			{
				char c=s.charAt(i);
				hs.add(c);
			}
			sz=hs.size();
			//System.out.println(hs+","+hs.size());
			hm.put(s, sz);
			}
		}
		//for(String s: hm.keySet())
		//{
		//	System.out.println(s+":"+hm.get(s));
		//}
	//print(hm);
		
	}
}


