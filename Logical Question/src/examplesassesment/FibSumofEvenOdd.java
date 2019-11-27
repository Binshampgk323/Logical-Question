package examplesassesment;

import java.util.Scanner;

public class FibSumofEvenOdd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();int i=0;
		int a=0,b=1,c=0,esum=0,osum=0;
		for(i=0;i<n-2;i++)
		{
			c=a+b;
			if(i%2==0)
			{
				esum=esum+c;
			}
			else
			{
				osum=osum+c;
			}
			a=b;
			b=c;
		}
		System.out.println("Even sum: "+(esum+0));
		System.out.println("Odd Sum: "+(osum+1));

	}

}
