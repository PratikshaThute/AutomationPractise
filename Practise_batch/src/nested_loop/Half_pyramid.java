package nested_loop;

public class Half_pyramid {

	public static void main(String[] args) {
	
//		half pyramid stars with same number of row and column
		for(int i=1; i<=5; i++) {
			for (int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("---------------------------------------------");
		
//		half pyramid with number
		for (int k=1; k<=9; k++) {
			for(int l = 1; l<=k;l++) {
				System.out.print(l+" ");
			}
			System.out.println();	
		} 
		
		System.out.println("---------------------------------------------");
		
//		half pyramid with two digit
		for (int k1=1; k1<=9; k1++) {
			for(int l1 = 1; l1<=k1;l1++) {
				System.out.print(k1+""+ l1+" ");
			}
			System.out.println();	
		} 
	}

}
