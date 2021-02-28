import java.util.*;
public class EzeeShop {
	static String[] productNames=new String[1];
static String[] initProductNames()
{
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<1;i++)
	{
		productNames[i]=sc.nextLine();
	}
return(productNames);
}
	static boolean isPresent(String[] productNames, String keyword)
	{
		int flag=0,k=0;
	 for(int i=0;i<productNames.length;i++)
	 {
		 String[] arr=productNames[i].split(" ");
		 String tempVariable=arr[i].toLowerCase();
		 if(tempVariable.contains(keyword))
		 {
			 k=i;
			 flag=1;
		 }
	 }
	 if(flag==1)
	 {
		 System.out.println(productNames[k]);
		 return true;
	 }
	 else
	 {
		 return false;
	 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String productName="";
String keyword="";
System.out.println("Enter the product names");
String[] productList=initProductNames();
System.out.println("Enter the keyword");
keyword=sc.next();
keyword=keyword.toLowerCase();
boolean output=isPresent(productList, keyword);

if(output==true)
{
	System.out.println("Keyword is present in the given product names");
}
else
{
	System.out.println("Keyword is not present in the given product names");
}
	}

}
