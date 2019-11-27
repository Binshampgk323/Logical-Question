package examplesassesment;
import java.util.Scanner;
public class Robery {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of house");
		int n=s.nextInt();
		int money[]=new int[n];int esum=0,osum=0,sum=0;
		System.out.println("Enter money in the house");
		int m[]=new int[n];
		for(int i=0;i<n;i++)
		{
			money[i]=s.nextInt();
		}
			if(n==1)
			{
				sum=money[0];
			    System.out.println("Sum : "+sum);
			}
			if(n==2)
			{
				sum=money[0]>money[1]?money[0]:money[1];
				System.out.println("Sum : "+sum);
				
			}
			else if(n>2)
			{
				m[0]=money[0];
				m[1]=Math.max(money[0], money[1]);
				for(int j=2;j<n;j++)
				{
					m[j]=Math.max(money[j]+m[j-2],m[j-1]);	
					sum=sum+m[j];
				}
				System.out.println("Sum : "+sum);
			}
			
			
			
			
		
		
		
		
			
		

	}

}
