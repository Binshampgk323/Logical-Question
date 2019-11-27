/*
 
 pattern16
 
* 0 0 0 * 
0 * 0 * 0 
0 0 * 0 0 
0 * 0 * 0 
* 0 0 0 * 
 
 */
package Pattern;

import java.util.Scanner;

public class Sample16 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter odd number");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j||i+j==n-1)
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}

	}

}
