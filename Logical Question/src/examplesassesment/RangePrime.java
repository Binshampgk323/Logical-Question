package examplesassesment;

import java.util.Scanner;

public class RangePrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Starting");
		int n1=s.nextInt();
		System.out.println("Ending");
		int n2=s.nextInt();
		int f;
		while(n1<=n2)
		{
			f=0;
			for(int i=2;i<n1/2;i++)
			{
				if(n1%i==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(n1);
				
			}
			n1++;
		}
	}

}
