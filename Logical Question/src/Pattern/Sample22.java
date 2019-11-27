/*
 
 Pattern 22
 
c c c c c c 
c c s s c c 
s s s s s s 
s s s s s s 
k k s s k k 
k k k k k k 

 */
package Pattern;
import java.util.Scanner;
public class Sample22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=6;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print("c ");
				}
				else if((i==1&&(i+j)<n/2)||(i==1)&&(i+j)>=n-1)
				{
					System.out.print("c ");
				}
				else if((i==1&&j==2)||(i==1&&j==3))
				{
					System.out.print("s ");
				}
				else if(i==2||i==3)
				{
					System.out.print("s ");
				}
				else if((i==4&&(i+j)<=5)||(i==4&&(i+j)>=8))
				{
					System.out.print("k ");
				}
				else if((i==4&&j==2)||(i==4&&j==3))
				{
					System.out.print("s ");
				}
				else if(i==5)
				{
					System.out.print("k ");
				}
			}
			System.out.println();
		}

	}

}
