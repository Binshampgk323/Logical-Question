/*
 patter10
R 
R E 
R E A 
R E A D 
R E A D Y 
R E A D 
R E A 
R E 
R 
*/

package Pattern;

import java.util.Scanner;

public class Sample10 {

	public static void main(String[] args) {
		
		    Scanner s=new Scanner(System.in);
		    System.out.println("Enter string");
			  String string1=s.next();
			  System.out.println("size");
			  int n=s.nextInt();
			  int l=string1.length();
			  char c[]=new char[l];
			  for(int i=0;i<l;i++)
			  {
				   c[i]=string1.charAt(i);
			  }
			  for(int i=0;i<n;i++)
			  {
				  
				  for(int j=0;j<=i;j++)
				  {
					  System.out.print(c[j]+" ");
				  }
				  System.out.println();
				
			  }
			   for(int i=n-2;i>=0;i--)
			  {
			    for(int j=0;j<=i;j++)
				  {
					  System.out.print(c[j]+" ");
				  }
				   System.out.println();
			   }
		

	}

}


