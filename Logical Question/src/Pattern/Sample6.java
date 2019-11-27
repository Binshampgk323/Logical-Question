
/*
pattern 6
A
AB
ABC
ABCD
ABCDE

*/
package Pattern;
import java.util.Scanner;
public class Sample6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.printf("%c",j+65);
			}
			System.out.println();
			
		}

	}

}
