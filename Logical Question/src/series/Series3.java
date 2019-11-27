/*
 Series 3
 
 1 2.0 3.0 6.0 9.0 18.0 27.0
  
 */
package series;
import java.util.Scanner;
public class Series3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		System.out.print("1 ");
		float a=2,c=0,b=3;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=3;i<n;i++)
		{
			if(i%2!=0)
			{
				c=a*3;
				System.out.print(c+" ");
				a=c;
			}
			else if(i%2==0)
			{
				c=b*3;
				System.out.print(c+" ");
				b=c;
			}
			
			
		}
		

	}

}
