package Company;

import java.util.Scanner;

public class StringTransformation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		String str1=str.replaceAll("[aeiou]","");
		int l=str1.length();
		for(int i=0;i<l;i++)
		{
			char c=str1.charAt(i);
			System.out.print("*");
			System.out.print(c);
		}
	}

}
