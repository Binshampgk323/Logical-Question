package Pattern;
import java.util.Scanner;
public class Sample12 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int num=s.nextInt();
		int space=1,i,j;
		space=num;
		for(i=0;i<num;i++)
		{
			for(j=0;j<space;j++)
			{
				System.out.print(" ");
			}
			space--;
			for(j=1;j<2*i-2;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
		space=num-1;
		for(i=num;i>0;i--)
		{
			for(j=0;j<space;j--)
			{
				System.out.print(" ");
			}
			space--;
			for(j=1;j<2*i-2;j++)
			{
				System.out.print("*");
			}
		System.out.println();
		}
	}

}
