package Company;
import java.util.Scanner;
public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a nubmer");
		int n=s.nextInt();int i=0;int b=0;
		String x="";
		while(n>0)
		{
			b=n%2;
			x=b+x;
		   n=n/2;
		}
			System.out.println(x);
		
	}

}
