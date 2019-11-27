package Company;
import java.util.Scanner;
public class Casechange {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		int n=str.length();
		String b="";
		for(int i=0;i<n;i++)
		{
			char c=str.charAt(i);
			if(c>=65&&c<=90)
			{
				c=(char)(c+32);
			}
			else if(c>=97&&c<=122)
			{
				c=(char)(c-32);
			}
			b=b+c;
		}
		System.out.println(b);
	}

}
