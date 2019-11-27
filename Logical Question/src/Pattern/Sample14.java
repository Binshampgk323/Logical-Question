/*
 pattern 14
 
01111
20222
33033
44404
55550

 */
package Pattern;
import java.util.Scanner;
public class Sample14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print(i+1);
				}
			}
			System.out.println();
		}

	}

}
