package Company;

import java.util.Scanner;

public class HeightFrequncyChar {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=s.next();
		int l=str.length();
		int count[]=new int[l];
		for(int i=0;i<l;i++)
		{
			char c=str.charAt(i);
			for(int j=i+1;j<l;j++)
			{
				char d=str.charAt(j);
				if(c==d)
				{
					count[i]++;
				}
				
			}
		}
				

	}

}
