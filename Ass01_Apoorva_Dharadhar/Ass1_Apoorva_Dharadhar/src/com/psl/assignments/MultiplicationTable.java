package com.psl.assignments;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] table=new String[13][13];
		int m=1,n=1;
		for(int row=1;row<13;row++)
		{
			n=row;
			for(int col=1;col<13;col++)
			{
				m=col;
				table[col][row]="";
				table[col][row]=table[col][row]+m*n;
			}
		}
		
		int nm=1;
		
		for(int i=1;i<13;i++)
		{
			table[0][i]=String.valueOf(nm);
			nm++;
		}
		
		for(int i=1;i<13;i++)
		{
			for(int j=0;j<1;j++)
			{
				table[i][j]="Row";
			}
		}
		
		System.out.print("     :");             
	    for(int j = 1 ; j < table[0].length ; j++) {
	    	if(j<=10)
	    	{
	    		System.out.print("   "+j);
	    	}
	    	else
	    	{
	    		System.out.print("  "+j);
	    	}
	    }
	  
	    System.out.println();
		for(int row=1;row<13;row++)
		{
			
			if(row>=10)
			System.out.print("Row "+ row+":  ");
			else
				System.out.print("Row "+ row+":   ");
			for(int col=1;col<13;col++)
			{
				int num=Integer.parseInt(table[col][row]);
				if(num < 10)
				{
					System.out.print(table[col][row]+"   ");
				}
				else if(num>=10 && num<100)
				{
					System.out.print(table[col][row]+"  ");	
				}
				else if(num>=100 && num<1000)
				{
					System.out.print(table[col][row]+" ");	
				}
				}
		System.out.println();
		}

	}

}
