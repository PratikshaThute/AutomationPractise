package nested_loop;

public class Inverted_Half_Pyramid_Rotateby_180 {

	public static void main(String[] args) {
		
		for(int a = 1; a<=5; a++ ) {
// To print space
			for(int b=1; b<=5-a; b++) {
				System.out.print(" ");
			}
//			To print star
			for(int c=1; c<=a; c++) {
				System.out.print("*");
			}
			System.out.println();
	}

}
}