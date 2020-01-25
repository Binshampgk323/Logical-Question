package exam;
import java.util.*;
public class PrintAlpha {

	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Alphanumeric number");
		String str=s.next();
		String num="";
		char alpha=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isDigit(c))  //check character is digit or not
			{
				num=num+c;
			}
			else
			{
				 alpha=c;
			}
			
		}
		

	}

}
