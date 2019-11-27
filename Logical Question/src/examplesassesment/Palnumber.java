package examplesassesment;
import java.util.Scanner;
public class Palnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int m=n;int r=0;
		while(n!=0)
		{
			int a=n%10;
			r=(r*10)+a;
			n=n/10;
		}
		if(r==m)
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not palindrome");

	}

}
