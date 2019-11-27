
/*
 Series 4
 
 0.5 1.5 4.5 13.5 40.5 121.5
 
 */
 package series;
 
import java.util.Scanner;
public class Series4 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=s.nextInt();
		float a=(float) 0.5;
		System.out.print(a+" ");
		for(int i=1;i<n;i++)
		{
			a=a*3;
			System.out.print(a+" ");
		}

	}

}
