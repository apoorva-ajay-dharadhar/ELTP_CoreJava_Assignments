import java.util.*;
public class ReverseLetterSequence {
	static String makeReverse(String str)
	{
		
		String[] wordArray=str.split(" ");
		String str1="", str2="";
		for(int i=0;i<wordArray.length;i++)
		{
			str2=new StringBuilder(wordArray[i]).reverse().toString();
			str1=str1+str2+" ";
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine();
		String ans=makeReverse(input);
		System.out.println(ans);
	}

}

