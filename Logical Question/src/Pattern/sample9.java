/*
 pattern9
 
   	 * 
    * * 
   * * * 
  * * * * 
 * * * * * 
 
 */


package Pattern;
import java.util.Scanner;
public class sample9 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int num=s.nextInt();    //pattern size
		for(int i=num;i>=0;i--)   //row 
		{
			for(int j=0;j<=num;j++)  //column
			{
				if(j<=i)
				{
					System.out.print(""+" ");
				}
				else
				{
					System.out.print("*"+" ");
				}
				
				 
			}
			System.out.println();   //getting next row
		}


	}

}
