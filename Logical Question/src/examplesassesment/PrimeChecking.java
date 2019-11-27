package examplesassesment;

import java.util.Scanner;

public class PrimeChecking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int f=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime number");
		}
				

	}

}
