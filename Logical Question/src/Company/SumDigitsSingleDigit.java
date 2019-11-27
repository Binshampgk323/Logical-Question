package Company;

import java.util.Scanner;

public class SumDigitsSingleDigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		if(n==0)
		{
			System.out.println("sum is "+n);
		}
		else if(n%9==0)
		{
			System.out.println("sum is "+9);
		}
		else
		{
			System.out.println("sum is "+n%9);
		}

	}

}
