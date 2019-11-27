package Company;

import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Size of array");
		int size=s.nextInt();
		int a[]=new int[size];
		int max=0;
		
		System.out.println("Array element");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		

		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		
		System.out.println("Max element is "+max);


	}

}
