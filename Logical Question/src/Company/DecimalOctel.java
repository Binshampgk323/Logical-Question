package Company;
import java.util.Scanner;
public class DecimalOctel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int dec=s.nextInt();
		String oct="";
		if(dec==0)
		{
			System.out.println("Octal number is 0");
		}
		else
		{
			while(dec!=0)
			{
				int a=dec%8;
				oct=a+oct;
				dec=dec/8;
			}
		System.out.println("Octal number is "+oct);
		}
	}

}
