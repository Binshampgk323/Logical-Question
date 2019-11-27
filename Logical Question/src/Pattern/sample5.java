/*
 
pattern 5

A
BB
CCC
DDDD
EEEEE

*/

package Pattern;
import java.util.Scanner;
public class sample5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c",i+65);
			}
			System.out.println();
		}

	}

}
