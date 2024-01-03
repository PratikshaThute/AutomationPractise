package scanner_class;

import java.util.Scanner;

public class String_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of String Array");
		int ab = sc.nextInt();

		String cd [] = new String [ab] ;
		
		System.out.println("Enter the values for String");
		
		for(int i = 0; i<ab ; i++) {
		cd[i]= sc.next();
		}
		
		System.out.println("The values for string are as follows : ");
		
		for(int i=0; i<ab; i++) {
			System.out.println(cd[i]);
		}
	}

}
