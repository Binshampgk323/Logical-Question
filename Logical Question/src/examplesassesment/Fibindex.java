package examplesassesment;
import java.util.Scanner;
public class Fibindex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter index");
		int n=s.nextInt();int i=0;
		int a=0,b=1,c=0,d=0;
		for(i=0;i<n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		
	}

}
