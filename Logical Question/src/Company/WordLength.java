package Company;

import java.util.Scanner;

public class WordLength {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the word");
		String word=s.nextLine();
		String word1=word.replaceAll(" ","");
		int l=word1.length();
		System.out.println("Word length "+l);

	}

}
