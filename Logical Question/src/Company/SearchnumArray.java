package Company;
import java.util.Scanner;
public class SearchnumArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		 int n=sc.nextInt();
	      int a[]=new int[n];
	      int i,f=0;
	      for(i=0;i<n;i++)
	      {
	        a[i]=sc.nextInt();
	      }
	      System.out.println("Enter search no");
	      int b=sc.nextInt();
	      for(i=0;i<n;i++)
	      {
	        if(b==a[i])
	        {
	         	f=1;
	        }
	      }
	      if(f==1)
	      {
	        System.out.printf("%d is present in the array",b);
	      }
	      else
	      {
	        System.out.printf("%d is not present in the array",b);
	      }

	}

}
