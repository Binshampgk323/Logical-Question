/*
 
 pattern 13
 
h e l l o 
h e l l 
h e l 
h e 
h 

 */

package Pattern;

import java.util.Scanner;

public class Sample13 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String string1=s.next();
		int l=string1.length();
		for(int i=l-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(string1.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
