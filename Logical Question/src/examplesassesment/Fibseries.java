package examplesassesment;
import java.util.Scanner;
public class Fibseries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int a=0,b=1,c=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<n-2;i++)
		{
			c=a+b;	
			System.out.println(c);
			a=b;b=c;
		}

	}

}
