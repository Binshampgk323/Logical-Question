package series;
import java.util.Scanner;
public class Series6 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter index");
		int n=s.nextInt();int num=0;
		for(int i=0;i<n;i++)
		{
			if(i%2!=0)
			{
				num=(n/2)-1;
			}
			else
			{
				num=n-1;
			}
			
		}
		System.out.println(num);
	}

}
