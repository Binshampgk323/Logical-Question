package Company;

import java.util.Scanner;

public class DuplicateElementsArray {

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
		for(int i=0;i<size;i++)
		{
			
			for(int j=i+1;j<size;j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.println("Duplicate number is "+a[j]);
				}		
			}	
		}

		
	}

}
