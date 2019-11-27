package Company;
import java.util.Scanner;
public class Arclength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter radius of circle");
		int r=s.nextInt();
		System.out.println("Enter angle ");
		int ang=s.nextInt();
		double l=0;
		l=(2*3.14*r*ang)/360;
		System.out.println("Arc length is "+l);

	}

}
