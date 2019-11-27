/*
patter 4
 	*
   **
  ***
 ****
*****

*/

package Pattern;
import java.util.Scanner;
public class Sample4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int num=s.nextInt();  //pattern size
	  
		 for (int i=0;i<=num;i++)  //row printing
	        {
	            for (int j=1;j<=num-i;j++) //space
	            {
	              System.out.print(" ");
	     
	            }
	            for (int k=0;k<=i;k++) //column 
	            {
	                System.out.print("*");
	            } 
	                System.out.println(); //next row
	        }
	}

}
