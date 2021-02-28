import java.util.*;
public class StringCombinations {
//static String[]  getCombinations(String str)
	static String getCombinations(String str, int i, int j)
	{
		char[] stringArr=str.toCharArray();
		char b=stringArr[i];
		char temp=stringArr[i];
		stringArr[i]=stringArr[j];
		stringArr[j]=temp;
		
		String retString=String.valueOf(stringArr);
		return retString;
	}
	
	static void permuteString(String str1, int start, int end)
	{
		
		
		if(start==end-1)
		{
			System.out.println(str1);
		}
		else
		{
		 for(int i=start;i<end;i++)
		 {
			 str1=getCombinations(str1,start, i);
			 
			 permuteString(str1, start+1, end);
			 
			 str1=getCombinations(str1,start, i);
		 }
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str1=sc.next();
		int leng=str1.length();
		permuteString(str1,0,leng);
	
		
	}

}
