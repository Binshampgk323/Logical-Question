package Company;
import java.util.Scanner;
public class Simpleinterest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principle");
		int p=s.nextInt();
		System.out.println("Enter Number of Periods");
		int n=s.nextInt();
		System.out.println("Enter Rate Per Period");
		int r=s.nextInt();
		double i=(p*n*r)/100;
		System.out.println("Simple interest is "+i);

	}

}
