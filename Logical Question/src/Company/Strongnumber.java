package Company;
import java.util.Scanner;
public class Strongnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int m=n;
		int f,sum=0;
		while(n!=0)
		{
			f=1;
			int a=n%10;
			for(int i=1;i<=a;i++)
			{
				f=f*i;	
			}
			sum=sum+f;
			n=n/10;
		}
		
		if(sum==m)
		{
			System.out.println("Strong number");
		}
		else
			System.out.println("Not Strong number");

	}

}
