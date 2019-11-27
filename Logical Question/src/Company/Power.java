package Company;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter base");
		int b=s.nextInt();
		System.out.println("Enter power");
		int p=s.nextInt();
		System.out.println(Math.pow(b, p));

	}

}
