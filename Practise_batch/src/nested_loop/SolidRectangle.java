package nested_loop;

public class SolidRectangle {

	public static void main(String[] args) {
	
//		Solid rectangle stars....row=5 and column=8
		for(int a = 1; a<=5; a++) {
			for (int b = 1; b<=8; b++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-------------------------------------------");
		
//		solid rectangle with numbers
		for(int c = 1; c<=5; c++) {
			for (int d = 1; d<=8; d++) {
				System.out.print(d+ " ");
			}
			System.out.println();
		}
		
		System.out.println("-------------------------------------------");
		
//		solid rectangle with two digit number
		for(int c1 = 1; c1<=5; c1++) {
			for (int d1 = 1; d1<=8; d1++) {
				System.out.print(c1 +""+ d1 + " ");
			}
			System.out.println();
		}
	}

}
