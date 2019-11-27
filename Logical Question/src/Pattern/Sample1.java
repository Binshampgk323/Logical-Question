/*
 pattern 1
* * * * 
* * * 
* * 
* 
 
 */



package Pattern;
import java.util.Scanner;
public class Sample1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
