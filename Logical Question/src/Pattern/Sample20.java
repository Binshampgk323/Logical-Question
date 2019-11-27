/*
 Pattern 20
 
#####*#####
####*#*####
###*###*###
##*#####*##
#*#######*#

 */
package Pattern;
import java.util.Scanner;
public class Sample20 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if((i+j)==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("#");
				}
			}
			for(int j=1;j<=n;j++)
			{
				if(i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("#");
				}
			}

			System.out.println();
		}

	}

}
