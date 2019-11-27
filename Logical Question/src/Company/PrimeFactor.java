
package Company;
import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		int m=n;
		int f=0;int sum=0;
		System.out.println("Prime factors are ");
		for(int j=2;j<=n;j++)
		{
			f=0;
			for(int i=2;i<=j/2;i++)
			{
				if(j%i==0)
				{
					f=1;
					break;
				}
			}
			if(f==0)
			{
				if(m%j==0)
				{
					System.out.println(j);
				}
			}
			
		}

	}

}
