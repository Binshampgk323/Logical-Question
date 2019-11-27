/*
 
 Series1
 
 121 225 361 529 
 
 */
package series;
import java.util.Scanner;
public class Series1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		int a=11;
		for(int i=0;i<n;i++)
		{
			System.out.print(a*a+" ");
			a=a+4;
		}

	}

}

