/*
pattern 7
 
EDCBA
DCBA
CBA
BA
A
 */

package Pattern;
import java.util.Scanner;
public class Sample7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=n-1;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.printf("%c",j+65);
				
			}
		
			System.out.println();
			
		}
	}

}
