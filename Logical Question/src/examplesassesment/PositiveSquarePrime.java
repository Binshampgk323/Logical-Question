package examplesassesment;
import java.util.Scanner;
public class PositiveSquarePrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int f=0;double m=0,su=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				f=1;
				break;
			}
				
		}
		if(f==0)
		{
			m=Math.sqrt(n);
			su=m*m;
			for(int i=2;i<=su/2;i++)
			{
				if(su%i==0)
				{
					f=1;
					break;
				}
					
			}
			if(f==0)
			{
				System.out.println("positive square of "+n+" is prime number");
			}
			else
			{
				System.out.println("positive square "+n+" is not a prime number");
			}
		}
		else
		{
			System.out.println(n+" Not a prime number");
		}
	}

}
