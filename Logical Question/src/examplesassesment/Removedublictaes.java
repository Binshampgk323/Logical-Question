package examplesassesment;
import java.util.Scanner;
public class Removedublictaes {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the limit");
		int n=s.nextInt();
		int a[]=new int[n];int i,j;
		System.out.println("Enter the numbers");
		 for(i=0;i<n;i++)
		    {
		      a[i]=s.nextInt();
		    }
		    for(i=0;i<n;i++)
		    {
		    	for(j=i+1;j<n-1;j++)
		    	{
		    		if(a[i]!=a[j])
		    		{
		    			System.out.println(a[i]);
		    		}
		    	}
		    }
		
	}

}
