/*
fiboSeriesIte

Erin Carlson
0580765
COIS-2240
2/6/18

Description: calculates fibonacci numbers using iteration
*/

import java.util.Scanner;

public class fibSeriesIter
{
	public static void main(String[] args)
	{
		// scans input
		// iterates/outputs fibonacci numbers
		// times program		
		
		int series;
				
		Scanner read = new Scanner(System.in);		
		System.out.print("Enter an integer: ");
		series = read.nextInt();
		read.close();
				
		long startTime = System.nanoTime();
			
		
		for(int i=0; i < series; i++)
			{	
				if(i == 0)
					System.out.print("0 ");
				else if(i == 1 || i == 2)
					System.out.print("1 ");
				else			
				{
					int num1 = 1, num2 = 1, fib = 1;
			
					for(int j = 3; j <= i; j++)
					{
						fib = num1 + num2;
						num1 = num2;
						num2 = fib;
					}
					System.out.print(fib + " ");
				}	
			}
			long endTime = System.nanoTime();

			System.out.println();
			System.out.println("Time: " + (endTime - startTime) + " nanoseconds");	
	}	
}