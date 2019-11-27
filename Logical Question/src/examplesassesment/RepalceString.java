package examplesassesment;
import java.util.Scanner;
public class RepalceString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=s.nextLine();
		String t=str.replace("l", "*");
		System.out.println(t);
	}

}
