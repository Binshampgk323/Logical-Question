/*
 
 pattern 23
 
c c c c c 
s * * * s 
s * * * s 
s * * * s 
s * * * s 
k k k k k
 
 */
package Pattern;
import java.util.Scanner;
public class Sample23 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n)
				{
					System.out.print("k ");
				}
				else if(i==0)
				{
					System.out.print("c ");
				}
				else if(j==0||j==n-1)
				{
					System.out.print("s ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}

	}

}
