package Company;

import java.util.Scanner;

public class ReplaceOccurrencesA$String {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int l=str.length();
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if(c=='a')
			{
				System.out.println(str.replace("a","$"));
				break;
			}
		}

	}

}
