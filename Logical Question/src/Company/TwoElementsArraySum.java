package Company;

import java.util.Scanner;

public class TwoElementsArraySum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Size of array");
		int n=s.nextInt();
		
		int a[]=new int[n];
		int sum1[]=new int[n];
		System.out.println("Sum");
		int sum=s.nextInt();
		int i=0,j=0;

		System.out.println("Elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;i<n;i++)
			{	
				 sum1[i]=a[i]+a[j];
			}
		}
		System.out.println("Output Elements");
		for(i=0;i<n;i++)
		{
			for(j=i+1;i<n;i++)
			{
				if(sum==sum1[i])
				{
					System.out.printf("%d %d ",a[i],a[j]);
				}
			}
			
		}


	}

}
