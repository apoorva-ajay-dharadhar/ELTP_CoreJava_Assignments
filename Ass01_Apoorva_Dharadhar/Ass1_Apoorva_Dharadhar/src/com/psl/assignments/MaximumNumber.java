package com.psl.assignments;

public class MaximumNumber {

	static int CalMax(int x, int y, int z)
	{
		int max=0;
		if(x==y)
		{
			if(x>z)
			{
				max = x;
			}
			else
			{
				max = z;
			}
		}
		else 
		{
			if(x>y && x>z)
			{
				max=x;
			}
		}
		if(y==z)
		{
			if(y>x)
			{
				max = y;
			}
			else
			{
				max=x;
			}
		}
		else
		{
			if(y>x && y>z)
			{
				max=y;
			}
		}
		if(x==z)
		{
			if(x>y)
			{
				max = x;
			}
			else
			{
				max=y;
			}
		}
		else
		{
			if(z>x && z>y)
			{
				max= z;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(CalMax(0,1,0));
	}

}
