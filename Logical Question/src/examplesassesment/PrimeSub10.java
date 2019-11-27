package examplesassesment;

import java.util.Scanner;

public class PrimeSub10 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a number");
		  int n=s.nextInt();int f;
		  for(int i=0;i<n;i++)
		  {
			  for(int j=i;j<n;j++)
			  {
				  if(i+j==n)
				  {  
					  f=0;
					  for(int k=2;k<=j/2;k++)
					  {
						  if(j%k==0)
						  {
							  f=1;
							  break;
						  }
					  }
					  
					  if(f==0)
					  {
						  
						  System.out.println("->("+i+","+j+")= 10");
					  }

				  }
			  }
		  }
		 

	}

}
