/*
 pattern 18
 
     1 
    2 1 
   3 2 1 
  4 3 2 1 
 5 4 3 2 1 

 */
package Pattern;
import java.util.Scanner;
public class Sample18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		 for(int i=0;i<n;i++)
		    {
			    for(int j=n;j>i;j--)
			    {
				    System.out.print(" ");
			    }
			    for(int j=i;j>=0;j--)
			    {
				    System.out.print((j+1)+" ");
			    }
				
			    System.out.println();	
		    }
	}

}
