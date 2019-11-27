package Company;

import java.util.Scanner;

public class CircleArea2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=s.nextInt();
		double area=3.14*r*r;
		System.out.println("Area of a circle "+area);


	}

}
