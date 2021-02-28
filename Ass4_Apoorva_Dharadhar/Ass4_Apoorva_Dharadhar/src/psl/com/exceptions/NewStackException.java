package psl.com.exceptions;

public class NewStackException extends Exception{
	public NewStackException(String msg)
	{
		System.out.println("Exception occurred -"+msg);
	}

}
