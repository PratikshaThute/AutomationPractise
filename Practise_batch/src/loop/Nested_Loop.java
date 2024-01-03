package loop;

public class Nested_Loop {

	public static void main(String[] args) {
		
		for (int z= 0; z<10; z++) {
			System.out.println("the outer loop value is " + z);
			for (int j = 0; j<5;j++) {
				System.out.println("inner loop value is "+ j);
			}
			System.out.println();
		}

		
	}

}
