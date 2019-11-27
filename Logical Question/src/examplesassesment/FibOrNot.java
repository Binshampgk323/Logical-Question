package examplesassesment;

import java.util.Scanner;

public class FibOrNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=0,b=1,c=0,d=0;
		for(int i=0;i<n;i++)
		{
			c=a+b;
			if(c==n)
			{
				d++;
			}
			a=b;b=c;
		}
		if(d!=0)
		{
			System.out.println("The Number is in fibnocci");
		}
		else
		{
			System.out.println("The Number is not in fibnocci");
		}

	}

}
