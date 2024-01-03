package scanner_class;

import java.util.Scanner;

public class Scanner_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your First name");
		String p = sc.nextLine();
		
		System.out.println("Enter your Last name");
		String t = sc.nextLine();
		
//		String pt = p.concat(t);
//		System.out.println("the full name of candidate is : "+ pt);
		
		String pt = p+t;
//		System.out.println("The full name is : "+ pt);
		System.out.println("The name is :" + " " + p +" "+t);
	}

	
}
