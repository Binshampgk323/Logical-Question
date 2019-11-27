package examplesassesment;

import java.util.Scanner;

public class Nprime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int f;
		for(int j=2;j<=n;j++)
		{
			f=0;
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				System.out.println(j);
			}
		}	
	}

}
