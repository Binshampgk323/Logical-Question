package Company;

import java.util.Scanner;

public class SortStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter strings");
		String str=s.next();
		int n=str.length();
		for(int i=0;i<n-1;i++)
		{
			char c=str.charAt(i);
			char d=str.charAt(i+1);
			if(c<d)
			{
				System.out.println("c "+c);
			}else
			{
				System.out.println("d "+d);
			}
				
		}

	}

}
