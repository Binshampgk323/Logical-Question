package Company;

import java.util.Scanner;

public class FrequencyAlphebet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		int l=str.length();
		int index[]=new int[26];
		int co=0;
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			if(c>=65&&c<=90||c>=97&&c<=127)
			{
				index[c]++;
			}
			for(int j=0;j<25;j++)
			{
				System.out.printf("%d,%d",c,index[i]);
			}
		}

	}

}
