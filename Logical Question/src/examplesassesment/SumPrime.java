package examplesassesment;

import java.util.Scanner;

public class SumPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int f,sum=0;
		for(int i=2;i<=n;i++)
		{
			f=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				sum=sum+i;
			}
		}System.out.println(sum);

	}

}
