package scanner_class;

import java.util.Scanner;

public class Scanner_loop {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int x= sc.nextInt();

		System.out.println("the table is as follows : ");
		for(int y=1; y<=10; y++) {
		System.out.println(x*y);
	}
		
		System.out.println("--------------------------------------");
		
		System.out.println("enter the number to get table");
		int z= sc.nextInt();
		
		System.out.println("the table is as follows : ");
		for(int y=1; y<=10; y++) {
		System.out.println(z + "x" + y + "=" + z*y);
	}
	}

}
