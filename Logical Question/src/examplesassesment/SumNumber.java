package exam;
import java.util.*;
public class SumNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String temp="";  
        int sum=0,val;  
        for(int i=0;i<str.length();i++)  
        {  
            char ch=str.charAt(i);
            if (Character.isDigit(ch))  //check the character is digit or number
            {
                temp=temp+ch;  
            }
            else
            {  
                sum=sum+Integer.parseInt(temp);
                temp="0";  
            }  
        }  
        val=sum+Integer.parseInt(temp);  
        System.out.println(val);
    }  
}
