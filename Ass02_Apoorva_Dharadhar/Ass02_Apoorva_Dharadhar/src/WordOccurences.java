import java.util.*;
public class WordOccurences {
	static int check(String sentence,String word){
		String sentenceInLowerCase="";
		sentenceInLowerCase=sentence.toLowerCase();
	String[] wordArray=sentenceInLowerCase.split(" ");
	//String wordLowerCase=word.toLowerCase();
	int flag=0;
	for(int i=0;i<wordArray.length;i++)
	{
		if(wordArray[i].equalsIgnoreCase(word))
		{
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		return 0;
	}
	else
	{
		return 1;
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input1=sc.nextLine();
		System.out.println("Enter the word whose number of occurences are to be determined");
		String word=sc.next();
		
		int output=check(input1, word);
		if(output==1)
		{
			System.out.println("Word present in the given string");
		}
		else
		{
			System.out.println("Word not present in the given string");
		}
	}

}
