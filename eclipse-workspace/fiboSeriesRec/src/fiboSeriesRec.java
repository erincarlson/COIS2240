/*
fiboSeriesRec

Erin Carlson
0580765
COIS-2240
2/6/18

Description: calculates fibonacci numbers using recursion
*/

import java.util.Scanner;

public class fiboSeriesRec
{
	public static void main(String[] args)
	{
		// scans input
		// calls fibRec method
		// gives output
		// times program 
				
		int series;
		
		Scanner read = new Scanner(System.in);		
		System.out.print("Enter an integer: ");
		series = read.nextInt();
		read.close();
		
		long startTime = System.nanoTime();
		
		
		for(int i = 0; i < series; i++)
		{	
			System.out.print(fibRec(i) + " ");
		}
		

		long endTime = System.nanoTime();

		System.out.println();
		System.out.println("Time: " + (endTime - startTime) + " nanoseconds");
	}

	
/*
--------------------------------------------------------------------------------------------------
	Calculates fibonacci sequence
	One parameter, n, integer
	Three returns, first num in sequence, second/third num in sequence, continuing iteration
--------------------------------------------------------------------------------------------------
*/
	
	public static int fibRec(int n)
	{			
		if (n == 0)
			return 0;
		else if (n == 1 || n == 2)
			return 1;
		else
			return fibRec(n - 2) + fibRec(n - 1);
	}	
}