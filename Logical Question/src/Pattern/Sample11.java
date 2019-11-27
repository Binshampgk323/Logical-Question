/*
 
 pattern 11
 
h 
h e 
h e l 
h e l l 
h e l l o
 
 */


package Pattern;
import java.util.Scanner;
public class Sample11 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String string1=s.next();
		int l=string1.length();
		for(int i=0;i<l;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(string1.charAt(j)+" ");
			}
			System.out.println();
		}

	}

}
