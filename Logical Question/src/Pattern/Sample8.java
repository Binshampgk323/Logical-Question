/*
 pattern 8
 
A 
B C 
D E F 
G H I J

 */

package Pattern;
import java.util.Scanner;
public class Sample8 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int aph=65;
				for(int i=0;i<n;i++)
					{
						for(int j=0;j<=i;j++)
						{
							System.out.print((char)aph+" ");
							aph++;
						}
						System.out.println();
				
				}

	}	

}
