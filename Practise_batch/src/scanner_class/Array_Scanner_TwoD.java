package scanner_class;

import java.util.Scanner;

public class Array_Scanner_TwoD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		to enter size of row
		System.out.println("Enter the size of row");
		int row = sc.nextInt();
		
//		to enter size of column
		System.out.println("Enter size of col");
		int col = sc.nextInt();
		
//		define multidimensional array
		int [][] ab = new int [row][col];
		
//		to give input
		System.out.println("Enter the input values");
		for(int m = 0; m< row; m++) {
			for (int n = 0; n<col; n++) {
			ab [m][n] = sc.nextInt();
		}
	}
		
//		to get output
		System.out.println("The output in the form for multidimensional array is as under");
		for(int k =0; k<row; k++) {
			for(int l = 0; l < col; l++) {
				System.out.print(ab[k][l] + " ");
			}
			System.out.println();
		}
	}
}
