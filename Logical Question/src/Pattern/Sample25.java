/*
 
 Pattern 25
 
c c s s k k 
c c s s k k 
s s . . s s 
s s . . s s 
k k . . c c 
k k . . c c 


 */
package Pattern;
import java.util.Scanner;
public class Sample25 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||i==1)
				{
					if(j==0||j==1)
					{
						System.out.print("c ");
					}
					else if(j==2||j==3)
					{
						System.out.print("s ");
					}
					else
					{
						System.out.print("k ");
					}
				}
				
				if(i==2||i==3)
				{
					if(j==2||j==3)
					{
						System.out.print(". ");
					}
					else
					{
						System.out.print("s ");
					}
				}
				
				if(i==4||i==5)
				{
					if(j==0||j==1)
					{
						System.out.print("k ");
					}
					else if(j==2||j==3)
					{
						System.out.print(". ");
					}else
					{
						System.out.print("c ");
					}
				}
				
			}
			System.out.println();
		}

	}

}
