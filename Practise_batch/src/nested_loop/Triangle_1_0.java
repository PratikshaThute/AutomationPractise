package nested_loop;

public class Triangle_1_0 {

	public static void main(String[] args) {
		
		for(int a = 1; a<=5; a++) {
			for (int b = 1; b<=a; b++) {
				int d=a+b;
				if((d % 2 == 0)) {				
					System.out.print("1 ");
					
			}else {
			System.out.print("0 ");
		}
			
		}
			System.out.println();
		}

		
}}