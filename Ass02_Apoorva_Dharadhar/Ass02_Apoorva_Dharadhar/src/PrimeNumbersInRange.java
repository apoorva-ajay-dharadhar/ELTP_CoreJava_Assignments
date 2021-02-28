import java.util.*;
public class PrimeNumbersInRange {

	static void printPrime(int start, int end)
	{
		int flag=0;
		for(int i=start;i<=end;i++)
		{
			flag=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number from which the prime numbers are to be printed");
		int startNum=sc.nextInt();
		System.out.println("Enter the number till which the prime numbers are to be printed");
		int endNum=sc.nextInt();
		printPrime(startNum, endNum);
		
	}

}
