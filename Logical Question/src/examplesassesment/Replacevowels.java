package examplesassesment;
import java.util.Scanner;
public class Replacevowels {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the string");
		 String str=s.nextLine();
	      int n=str.length();
	      str = str.replaceAll("[aeiou]", "&");
	      System.out.println(str);  
	}

}
