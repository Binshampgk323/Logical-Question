package Company;
import java.util.Scanner;
public class DegreetoFarentheet {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter tem in Centigrade ");
		int c=s.nextInt();
		double f=(c*1.8)+32;
		System.out.println("Fahrenheit "+f);
	}

}
