package examplesassesment;

import java.util.Scanner;

public class ReversePrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int f=0,m,a=0,r=0;
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
			while(n!=0)
			{
				a=n%10;
				r=r*10+a;
				n=n/10;
			}
			
			for(int i=2;i<=r/2;i++)
			{
				if(r%i==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(r+" is a Prime number");
			}
			else
			{
				System.out.println(r+ " is Not a Prime number");
			}

			
		}
		else
		{
			System.out.println(n+" Not a prime number");
		}
			
	}	

}
