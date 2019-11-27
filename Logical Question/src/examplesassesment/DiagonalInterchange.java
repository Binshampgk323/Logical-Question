package examplesassesment;

import java.util.Scanner;

public class DiagonalInterchange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter n and m");
		  int n=s.nextInt();
		  int m=s.nextInt();
		  int a[][]=new  int[n][m];
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<m;j++)
			  {
				  a[i][j]=s.nextInt();
			  }
		  }
		  System.out.println("before");
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<m;j++)
			  {
				  System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
		  }
		  
		  for(int j=0;j<n;j++)
		  {
			  int temp=a[j][j];
			  a[j][j]=a[j][n-1-j];
			  a[j][n-1-j]=temp;
		  }
		  System.out.println("after");
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<m;j++)
			  {
				  System.out.print(a[i][j]+" ");
			  }
			  System.out.println();
		  }

	}

}
