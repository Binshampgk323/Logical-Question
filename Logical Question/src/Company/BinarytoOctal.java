package Company;

import java.util.Scanner;

public class BinarytoOctal {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter binary number");
		String binary=s.next();
		String oct="";
		int dec=Integer.parseInt(binary,2);
		while(dec!=0)
		{
			int a=dec%8;
			oct=a+oct;
			dec=dec/8;
		}
		System.out.println("Octal number is "+oct);
	}

}
