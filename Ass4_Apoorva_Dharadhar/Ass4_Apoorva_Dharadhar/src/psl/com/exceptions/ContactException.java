package psl.com.exceptions;

public class ContactException extends Exception{
	public ContactException(String msg)
	{
		super(msg);
		if(msg.equalsIgnoreCase("ContactException-1"))
		{
			System.out.println("Invalid number");
		}
		else
		{
			System.out.println("Phone number or Mobile number should not be empty");
		}
	}
}
