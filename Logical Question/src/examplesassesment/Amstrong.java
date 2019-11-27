package examplesassesment;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int m=n,d=0,r=n;;
		double as=0;
		while(n!=0)
		{
			n=n/10;
			d++;
		}
		while(m!=0)
		{
			int a=m%10;
			as=as+Math.pow(a,d);
			m=m/10;
		}
		if(as==r)
			System.out.println("Amstrong");
		else
			System.out.println("Not amstrong");
	}
}
