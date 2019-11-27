/*
 
 Series 5
 
 4 5 9 18 34 59 
 
 */

package series;
import java.util.Scanner;
public class Series5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();int a=4;
		for(int i=0;i<n;i++)
		{
			a=a+(i*i);
			System.out.print(a+" ");
		}

	}

}
