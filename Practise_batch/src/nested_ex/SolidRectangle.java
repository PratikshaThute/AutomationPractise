package nested_ex;

public class SolidRectangle {
	
	public static void main(String[] args) {

	for(int a =1; a<6; a++) {
		for(int b = 1; b<8; b++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("----------------------------------------");
	
	for(int a = 1; a<6; a++) {
		for(int b = 1; b<8; b++) {
			System.out.print(a+""+b+" ");
		}
		System.out.println();
	}
	System.out.println("----------------------------------------");

	for(int x = 1; x<6; x++) {
		for(int y =1;y<=x;y++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("----------------------------------------");
	
	
	}

	
}
