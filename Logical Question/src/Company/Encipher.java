package Company;
import java.util.Scanner;
public class Encipher {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a character");
		char c=s.next().charAt(0);
		System.out.println("Shift");
		int b=s.nextInt();
		int a=(int)c;
		int d=a+b;
		System.out.println((char)d);
	}

}
