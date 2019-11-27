package Company;
import java.util.Scanner;
public class WordReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter sentance");
		String str=s.nextLine();
		String word[]=str.split(" ");
		String a[]=new String[23];
		int l=word.length;
		for(int i=0;i<l;i++)
		{
			
			if(i%2==0)
			{
				int l1=a.length;
				for(int j=0;j<l1-1;j++)
				{
					//System.out.print(word[i]+" ");
					break;
				}
			}
			else if(i%2!=0)
			{
				String name=word[i];
				//System.out.print("name "+name);
				int lg=name.length();
				String c="";
				for(int j=lg-1;j>=0;j--)
				{
					c=c+name.charAt(j);
					System.out.print(c+" ");
					break;
				}
			}
				
		}

		
	}

}
