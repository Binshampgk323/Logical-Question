package Company;

import java.util.Arrays;
import java.util.Scanner;

public class GCDarray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array size");
		int n=s.nextInt();
		int a[]=new int[n];int gcd=0;
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=1;i<n;i++)
		{
			if(a[i]%a[0]==0)
			{
				gcd=a[0];
			}
		}
		System.out.println(gcd);

	}

}
