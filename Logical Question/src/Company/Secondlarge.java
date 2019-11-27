package Company;

import java.util.Scanner;

public class Secondlarge {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter three number");
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		if((n1<n2&&n2<n3)||(n1>n2&&n2>n3))
		{
			System.out.println("Second large "+n2);
		}
		else if((n2<n1&&n1<n3)||(n2>n1&&n1>n3))
		{
			System.out.println("Second large "+n1);
		}
		else if((n1<n3&&n3<n2)||(n1>n3&&n3>n2))
		{
			System.out.println("Second large "+n2);
		}
	}

}
