/*
 
cse
ccssee
cccssseee
ccccsssseeee

 */
package Pattern;
import java.util.Scanner;
public class Sample21 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String ");
		String str=s.next();
		System.out.println("Enter size");
		
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<str.length();j++)
			{
				char c=str.charAt(j);
				for(int k=0;k<n;k++)
				{
					if(k<=i)
					System.out.print(c+" ");
				}
			}
			System.out.println();
		}
	}

}
