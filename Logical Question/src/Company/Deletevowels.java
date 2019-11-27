package Company;
import java.util.Scanner;
public class Deletevowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		System.out.println(str.replaceAll("[aeiou]",""));

	}

}
