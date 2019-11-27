package Company;

import java.util.Scanner;

public class VowelsConsonantsUppercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter character");
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("Vowel");
		}
		else if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("Vowel and Uppercase");
		}
		else if ((c!='a'||c!='e'||c!='i'||c!='o'||c!='u'||c!='A'||c!='E'||c!='I'||c!='O'||c!='U')&&(c>='A'&&c<='Z'))
		{
			System.out.println("Consonant and Upper case");
		}
		else
		{
			System.out.println("Consonant and Lowercase");
		}

	}

}
