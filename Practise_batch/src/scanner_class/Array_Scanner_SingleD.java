package scanner_class;

import java.util.Scanner;

public class Array_Scanner_SingleD {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Define size of array");
		int a = sc.nextInt();
		int [] ij = new int [a];
		System.out.println("enter values");
		
		for(int k = 0; k<a;k++) {
			ij[k] = sc.nextInt();
		}
//		output
		
		for(int l = 0; l<a;l++) {
			System.out.println(ij[l]);
		}
	}

}
