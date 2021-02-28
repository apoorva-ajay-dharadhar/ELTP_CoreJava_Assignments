package com.psl.assignments;
import java.util.*;
public class CheckForVowel {

	static boolean checkAlpha(char alph)
	{
		char a=Character.toLowerCase(alph);
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the alphabet");
		Scanner sc=new Scanner(System.in);
		 char input = sc.next().charAt(0);
		 boolean ans=checkAlpha(input);
		 if(ans)
		 {
			 System.out.println("The input alphabet is a vowel");
		 }
		 else
		 {
			 System.out.println("The input alphabet is not a vowel");
		 }
	}

}
