package Company;

import java.util.Scanner;

public class PrintIndex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Array size");
		int size=s.nextInt();
		int a[]=new int[size];
		System.out.println("Array element");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
		}
		
		System.out.println("Enter value");
		int v=s.nextInt();
		
			for(int i=0;i<size;i++)
			{
				if(a[i] == v)
				{
					System.out.println("Index is "+i);
				}
			}
			for(int i=0;i<size;i++)
			{
				if(a[i] != v)
				{
					System.out.println("-1");
					break;
				}
			}
			
		
		
		
		
		
	}

}
