package com.psl.assignment.four;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import psl.com.exceptions.ContactException;
import psl.com.exceptions.EmptyInputException;
import psl.com.exceptions.InvalidEmailException;
import psl.com.exceptions.NewStackException;
public class Contact {
	static int top=0;
	private String firstName;
	private String lastName;
	private String dob;
	private String email;
	private String mobile;
	private String telephone;
	private String middleName;
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAnniversary() {
		return anniversary;
	}

	public void setAnniversary(String anniversary) {
		this.anniversary = anniversary;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	private String address;
	private String gender;
	private String anniversary;
	private String area;
	private String city;
	private String pincode;
	private String state;
	private String county;
	private String website;
	/*
	 * , Middle name
	 * Gender, Anniversary, Address, Area, City, Pincode, State, Country, 
	 * website
	 * */
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setName(String firstName)
	{
		this.firstName=firstName;
	}

	public String getFirstName()
	{
		return firstName;
	}
	public static boolean Validate(String name, String lName, String dob, String email, String mobilePhone, String tele) throws EmptyInputException, InvalidEmailException, ContactException
	{
		String regex="^\s$";
		String regex2="^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
		Pattern pattern=Pattern.compile(regex);
		Pattern pt1=Pattern.compile(regex2);
		Matcher m1=pattern.matcher(name);
		Matcher m2=pattern.matcher(lName);
		Matcher m3=pattern.matcher(dob);
		Matcher m4=pattern.matcher(email);
		Matcher m5=pt1.matcher(email);
		Matcher m6=pattern.matcher(mobilePhone);
		Matcher m7=pattern.matcher(tele);
		boolean pass=true;
		int cnt=0;
		
		if(m1.matches())
		{
			pass=false;
			throw new EmptyInputException("FirstName is empty");
		}
		
		if(m2.matches())
		{
			pass=false;
			throw new EmptyInputException("LastName is empty");
		}
		
		if(m3.matches()) {
			pass=false;
			throw new EmptyInputException("Date of Birth is empty");
		}
		
		if(m4.matches()) {
			pass=false;
			throw new EmptyInputException("Email is empty");
		}

		if(!m5.matches())
		{
			pass=false;
			throw new InvalidEmailException("Email should be in a proper format");
		}

		if(m6.matches() && m7.matches())
		{
			pass=false;
			throw new ContactException("ContactException-1");
		}
		
		
			
			if(pass=true)
			{
				return true;
			}
			else
			{
				return false;
			}
		
			
		
		
	}
		
	//}
	public static void push(Contact t, Contact[] arr ) throws NewStackException
	{
		
		if(t==null)
			{
			
				throw new NewStackException("Push attempt made when Stack was initialized");
			}
		else if(top==2)
		{
			throw new NewStackException("Push attempt was made when stack was already full");
		}
		else
		{
			arr[top]=t;
		}
			
		}

	public static void pop(Contact t) throws NewStackException 
	{
		//i.	A pop must fail on an uninitialized stack and empty stack
		if(t==null)
		{
			throw new NewStackException("Pop attempt made when Stack was not initialized");
		}
		else if(top==0)
		{
			throw new NewStackException("Pop attempt made when stack is empty");
		}
		else
		{
			t=null;
			top--;
		}
	}
		

	public static void main(String[] args) throws NewStackException 
	{
		Scanner sc=new Scanner(System.in);
		String firstName="abc";
		String lastName="def";
		String dateOfBirth="12/03/1998";
		String email="apoorva@gmail.com";
		String telephone="12345678";
		String mobilePhone="9474234512";
		Contact[] tr=new Contact[2];
		
		for(int i=0;i<2;i++)
		{
			
			
			try
			{
				
					boolean isValid=Validate(firstName, lastName, dateOfBirth, email, telephone, mobilePhone);
					if(isValid)
					{
						
					  
						Contact cs=new Contact();
						cs.setName(firstName);
						cs.setLastName(lastName);
						cs.setDob(dateOfBirth);
						cs.setEmail(email);
						cs.setMobile(mobilePhone);
						cs.setTelephone(telephone);
						System.out.println("Enter middle name");
						String mName = sc.next();
						cs.setMiddleName(mName);
						System.out.println("Enter gender");
						String gender = sc.next();
						cs.setGender(gender);
						System.out.println("Enter anniversary");
						String anniversary = sc.next();
						cs.setAnniversary(anniversary);
						System.out.println("Enter address");
						String address = sc.next();
						cs.setAddress(address);
						System.out.println("Enter area");
						String area = sc.next();
						cs.setArea(area);
						System.out.println("Enter city");
						String city = sc.next();
						cs.setCity(city);
						System.out.println("Enter pincode");
						String pinc = sc.next();
						cs.setPincode(pinc);
						System.out.println("Enter state");
						String state = sc.next();
						cs.setState(state);
						System.out.println("Enter country");
						String country = sc.next();
						cs.setCounty(country);
						System.out.println("Enter website");
						String website = sc.next();
						cs.setWebsite(website);
						push(cs, tr);
						
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				
				}
			
			
			
			
			top++;
			
		
		}
		try
		{
			Contact r=new Contact();
			/*push(r); 
			On making a push attempt, "Push  attempt was made when stack was already full
			psl.com.exceptions.NewStackException 
			will be thrown.*/
			
			
			/*pop(r);
			pop(r);
			pop(r);
			*On making three consecutive pop attempts when only two objects of this class were
			*in existence, it will throw
			*Exception occurred -Pop attempt made when stack is empty
			*psl.com.exceptions.NewStackException
			*
			*/
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
