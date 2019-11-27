package Company;
import java.util.Scanner;
public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter binary number");
		String str=s.next();
		int decimal=Integer.parseInt(str,2);
		System.out.println(decimal);
	}

}
