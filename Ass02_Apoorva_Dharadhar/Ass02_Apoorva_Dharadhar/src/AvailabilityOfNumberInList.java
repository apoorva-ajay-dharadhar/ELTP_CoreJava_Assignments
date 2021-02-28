import java.util.*;
public class AvailabilityOfNumberInList {

static int findPosition(int num,int[] nos)
{
	int flag=0, pos=0;
	for(int i=0;i<nos.length;i++)
	{
		if(nos[i]==num)
		{
			flag=1;
			pos=i;
			break;
		}
	}
	if(flag==1)
	{
		return pos;
	}
	else
	{
		return 0;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] numberList= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		System.out.println("Enter the number to be searched in the array");
		int number=sc.nextInt();
		int output=findPosition(number,numberList);
		if(output==0)
		{
			System.out.println("Number not present in the given list");
		}
		else
		{
			System.out.println("Number is available in the list at the location: "+output);
		}
	}

}
