package Company;

import java.util.Scanner;

public class MissingCharAlphebet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		int f=0;
		str=str.toLowerCase();
		System.out.println("missing charature is :");
		for(char ch='a';ch<='z';ch++)
		{
			f=0;
			for(int i=0;i<str.length();i++ )
			{
				if(str.charAt(i)==ch)
				{
					f=1;
					break;
				}
			}
		
			if(f==0)
			{
				System.out.print(ch+" ");
				
			}
		
		}

	}

}
