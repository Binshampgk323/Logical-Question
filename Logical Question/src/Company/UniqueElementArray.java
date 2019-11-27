package Company;

import java.util.Scanner;

public class UniqueElementArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Array size");
		int size=s.nextInt();
		int a[]=new int[size];
		int ctr;
		System.out.println("Array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=s.nextInt();
			
		}
		 System.out.println("Unique element");
		for(int i=0; i<size; i++)
	    {
	        ctr=0;
	        for(int j=0; j<i-1; j++)
	        {
	           
	            if(a[i]==a[j])
	            {
	                ctr++;
	            }
	        }
	      
	       for(int k=i+1; k<size; k++)
	        {
	            if(a[i]==a[k])
	            {
	                ctr++;
	            }
	        }
			
	       if(ctr==0)
	        {
	          System.out.printf("%d\n",a[i]);
	        }

	 
			
		}
		
			
			
	}

}
