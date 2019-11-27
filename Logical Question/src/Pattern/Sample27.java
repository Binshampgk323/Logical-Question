/*
 Pattern 27
 
     1 
    1 1 
   1 2 1 
  1 3 3 1 
 1 4 6 4 1 
 
 */

package Pattern;
import java.util.Scanner;
public class Sample27 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int num;
		for(int i=0;i<n;i++) 
		{
			num=1;
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(num+" ");
				num=num*(i-j)/(1+j);
			}
			System.out.println();
			
		}

	}

}
