package Company;

import java.util.Scanner;

public class CountVowelsConsonantsDigitsWhitespacesSymbols {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.nextLine();
		int l=str.length();int v=0,co=0,d=0,w=0,sy=0;
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			 if(c>=48&&c<=57)
				{
					d++;
				}
				else if(c==32)
				{
					w++;
				}
				else if(c>=33&&c<=47||c>=58&&c<=64||c>=123&&c<=126||c>=91&&c<=96)
				{
					sy++;
				}
				else if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
				{
					v++;
				}
				else 
				{
					co++;
				}
			
				
		}
		System.out.println("vowel count is "+v);
		System.out.println("Consonants count is "+co);
		System.out.println("Digit count is "+d);
		System.out.println("White space count is "+w);
		System.out.println("Symbols count is "+sy);
	}

}
