package Company;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Array size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Sorted array is ");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("After remove duplicates");
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(a[i]==a[j])
				{
					for(int k=j; k<size-1; k++)
	                {
	                    a[k] = a[k+1];
	                }
	                	size--;
	                	j--;
				}		
			}	
		}
		
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}

	}

}
