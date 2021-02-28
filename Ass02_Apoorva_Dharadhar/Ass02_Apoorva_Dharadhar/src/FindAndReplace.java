import java.util.*;
public class FindAndReplace {
static String FindReplace(String source, String word)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the word with which you want to replace the given word");
	String newWord=sc.next();
	String stringPostReplacement=source.replaceAll(word, newWord);
	return stringPostReplacement;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the source string");
		String sourceString=sc.nextLine();
		System.out.println("Enter the string that is to be replaced");
		String findString=sc.next();
		String ans=FindReplace(sourceString, findString);
		System.out.println("After Replacement:");
		System.out.println(ans);
	}

}
