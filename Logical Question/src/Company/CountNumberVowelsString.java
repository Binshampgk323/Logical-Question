package Company;

import java.util.Scanner;

public class CountNumberVowelsString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int l=str.length();int d=0;
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				d++;
			}
		}
		System.out.println("vowel count is "+d);
	}

}
