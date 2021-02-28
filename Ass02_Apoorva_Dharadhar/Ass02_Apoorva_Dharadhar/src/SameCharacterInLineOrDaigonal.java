import java.util.*;
public class SameCharacterInLineOrDaigonal {
static char check(char[][] array)
{
	int flag=0;
	char variable=' ';
	if((array[0][0]==array[1][1] && array[1][1]==array[2][2])||(array[0][2]==array[1][1] && array[1][1]==array[2][0]))
	{
		flag=1;
		variable=array[0][0];
	}
	else if(array[0][0]==array[0][1] && array[0][1]==array[0][2])
	{
		flag=1;
		variable=array[0][0];
	}
	else if(array[1][0]==array[1][1] && array[1][1]==array[1][2])
	{
		flag=1;
		variable=array[1][0];
	}
	else if(array[2][0]==array[2][1] && array[2][1]==array[2][2])
	{
		flag=1;
		variable=array[2][0];
	}
	else if(array[0][0]==array[1][0] && array[1][0]==array[2][0])
	{
		flag=1;
		variable=array[0][0];
	}
	else if(array[0][1]==array[1][1] && array[1][1]==array[2][1])
	{
		flag=1;
		variable=array[0][1];
	}
	else if(array[0][2]==array[1][2] && array[1][2]==array[2][2])
	{
		flag=1;
		variable=array[0][2];
	}
	else
	{
		flag=0;
	}
	if(flag==1)
	{
		return variable;
	}
	else
	{
		return 'n';
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char[][] arr=new char[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter character for location: arr["+i+"]["+j+"]");
				char inp=sc.next().charAt(0);
				arr[i][j]=inp;
			}
		}
		
		char output=check(arr);
	//	System.out.println(output);
		if(output!='n')
		{
			//System.out.println(output);
		}
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			
			}
			System.out.println();
		}
		
		
	}

}
