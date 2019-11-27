package Company;
import java.util.Scanner;
public class Perfectsquare {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=s.nextInt();
		float sq= (float) Math.sqrt(n);
		int m=(int) sq;
		System.out.println(sq);
		if(m==sq)
		{
			System.out.println("Perfect square");
		}
		else
			
		{
			System.out.println("Not Perfect square");
		}

	}

}
