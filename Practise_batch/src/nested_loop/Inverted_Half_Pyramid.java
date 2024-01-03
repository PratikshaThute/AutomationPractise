package nested_loop;

public class Inverted_Half_Pyramid {

	public static void main(String[] args) {
		
//		inverted half pyramid stars with same number of row and column
		for (int x = 6; x>=1; x--) {
			for(int y = 1; y<=x; y++) {
				System.out.print("* " );
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------");
		
		for (int u=8; u>=1;u--) {
			for(int v = 1; v<=u;v++) {
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		
		for (int u1=8; u1>=1;u1--) {
			for(int v1 = 1; v1<=u1; v1++) {
				System.out.print(u1+ ""+ v1+" ");
			}
			System.out.println();
		}
	}

}
