package examplesassesment;
import java.util.Scanner;
public class Perfectnumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();int sum=0,m=n;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(m==sum)
		System.out.println("Perfect Number");
		else
			System.out.println("Not perfect number");

	}

}
