/*
 Series 2
 
 0 2 8 14 24 34
 
 */
package series;
import java.util.Scanner;
public class Series2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter limit");
	int n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
			
		{
			System.out.print(i*i-2+" ");
		}
		else
		{
			System.out.print(i*i-1+" ");
		}
	}
	
	
	
	}

}
