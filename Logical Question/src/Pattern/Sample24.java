/*
 
 Pattern 24
 
c c c c c c 
* s * * s * 
* * s s * * 
* * s s * * 
* s * * s * 
k k k k k k 

 */
package Pattern;
import java.util.Scanner;
public class Sample24 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print("c ");
				}
				else if(i==n-1)
				{
					System.out.print("k ");
				}
				else if(j==0)
				{
					System.out.print("* ");
				}
				else
				{
					if(i==j||(i+j)==n-1)
					{
						System.out.print("s ");
					}
					else
					{
						System.out.print("* ");
					}
				}
					
			}
			System.out.println();
		}

	}

}
