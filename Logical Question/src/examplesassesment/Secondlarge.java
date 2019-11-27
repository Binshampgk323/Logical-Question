package examplesassesment;
import java.util.Scanner;
public class Secondlarge {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the limit");
	int n=s.nextInt();
	int l=0,se=0;
	int a[]=new int[n];
	System.out.println("Enter numbers");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]>l)
		{
			se=l;
			l=a[i];
		}
		else if(a[i]>se)
		{
			se=a[i];
		}
	}
	
	System.out.println("Second large number is : "+se);

	}

}
