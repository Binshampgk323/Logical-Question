package Company;
import java.util.Scanner;
public class GreatestThree {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		int l=0;
		if(n1>n2)
		{
			l=n1;
		}
		else
		{
			l=n2;
		}
		if(l<n3)
		{
			System.out.println("Large no is "+n3);
		}
		else
		{
			System.out.println("Large no is "+l);
		}

	}

}
