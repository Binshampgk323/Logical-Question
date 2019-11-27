package Pattern;
import java.util.Scanner;
public class Sample26 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter one char");
		char c=s.next().charAt(0);
		int n=c-84;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				if(i==n||i==n-(n-1))
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
