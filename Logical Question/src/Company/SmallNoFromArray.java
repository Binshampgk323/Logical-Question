package Company;
import java.util.Arrays;
import java.util.Scanner;
public class SmallNoFromArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit of array");
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Small number is "+a[0]);
	}

}
