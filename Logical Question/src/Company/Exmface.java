package Company;
import java.util.Scanner;
public class Exmface {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str="FACE";
		int n=str.length();
		int c=n;int r=n;
		for(int i=0;i<n;i++)
		{
				for(int j=i;j<n;j++)
				{	
					if(i==i&&j==j)
					{
						System.out.printf("%c ",str.charAt(j));
						if(i==(i+1)&&j==(j+1))
						{
							System.out.printf(" ");
						}
						
					}
					
				}
				
								
			System.out.println();
		}

	}

}
