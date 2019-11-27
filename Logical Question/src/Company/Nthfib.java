package Company;
import java.util.Scanner;
public class Nthfib {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=0,b=1,c=0;
		//System.out.println(a);
		//System.out.println(b);
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}

}
