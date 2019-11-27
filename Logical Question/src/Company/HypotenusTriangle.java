package Company;

import java.util.Scanner;

public class HypotenusTriangle {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Base");
		int base=s.nextInt();
		System.out.println("Enter height");
		int height=s.nextInt();
		int b=base*base;
		int h=height*height;
		double hy=Math.sqrt(b+h);
		System.out.println("Hypotenus of Triangle is "+hy);

	}

}
