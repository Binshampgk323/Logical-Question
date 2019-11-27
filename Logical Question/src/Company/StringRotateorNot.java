package Company;

import java.util.Scanner;

public class StringRotateorNot {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String str=s.next();
		int l=str.length();
		int d=l/2;
		for(int i=d;i<l;i++)
		{
			char c=str.charAt(i);
			System.out.print(c);
		}
		for(int i=0;i<d;i++)
		{
			char c=str.charAt(i);
			System.out.print(c);
		}

	}

}
