package scanner_class;

import java.util.Scanner;

public class Scanner_Switchblock {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		
		System.out.println("Enter second number");
		int b = sc.nextInt();
		
		System.out.println("choose any one operators like +, - , *, / ");
		char c= sc.next().charAt(0);
		
		switch(c) {
		case '+':
			System.out.println("Addition of two numbers is :- " + (a+b));
			break;
		case '-' :
			System.out.println("Subtraction of two numbers is :- " +(a-b));
			break;
		case '*' :
			System.out.println("Multiplication of two numbers is :- "+(a*b));
			break;
		case '/' :
			System.out.println("Division of two numbers is :- " + (a/b));
			break;
			default :
				System.out.println("none");
		}
	}


}
