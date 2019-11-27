package Company;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of n*n matrix");
		int size=s.nextInt();
		int a[][]=new int[size][size];
		int b[][]=new int[size][size];
		int c[][]=new int[size][size];
		
		System.out.println("first matrix");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		
		System.out.println("Second matrix");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum of matrix");
		
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
