package Company;

import java.util.Scanner;

public class PalString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		String r="";
		 int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			r=r+str.charAt(i);
		}
		if(str.equals(r))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}

	}

}
