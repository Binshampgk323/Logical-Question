package Pattern;

import java.util.Scanner;

public class Sample19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int space = n - 1; 
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < space; j++) 
                System.out.print("*"); 
      
             
            for (int j = 0; j <= i; j++) 
                System.out.print(" "); 
      
            System.out.print("\n"); 
            space--; 
        } 
      
        space = 0; 
      
        // run loop (parent loop)  
        // till number of rows 
        for (int i = n; i > 0; i--) 
        { 
            // loop for initially space,  
            // before star printing 
            for (int j = 0; j < space; j++) 
                System.out.print("*"); 
      
            // Print i stars 
            for (int j = 0; j < i; j++) 
                System.out.print(" "); 
      
           System.out.print("\n"); 
            space++; 
        } 
    

	}

}
