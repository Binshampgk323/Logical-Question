/*
 
 pattern 17
 
1    1
12   21
123  321
1234 4321
1234554321

 */

package Pattern;
import java.util.Scanner;
public class Sample17 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();

		for(int i=0;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j<=i)
				{	
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=n;j>=1;j--)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				
			}
			
			System.out.println();
		}
s.close();
	}

}
