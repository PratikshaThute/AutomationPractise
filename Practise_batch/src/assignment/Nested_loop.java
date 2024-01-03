package assignment;

public class Nested_loop {

	public static void main(String[] args) {
	
		
		for(int a=0; a<=10; a++) {
			System.out.println("the value of a is "+ a);
			for (int b = 1; b<=5;b++) {
				System.out.println(b*5);
			}
			System.out.println();
		}

		System.out.println("------------------------------------------------------------");
		
//		only inner loop execute
		for(int i = 0; i<5;i++) {
			for(int j = 0; j <4;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");
		
//		for matrix values
		for(int i = 0; i<5;i++) {
			for(int j = 0; j <5;j++) {
				System.out.print(i+""+j + " ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");

//		solid rectangle ...here x=row and y= column
		int row=4; int column = 5;
		for(int x= 1 ; x<=4; x++){
			for (int y = 1; y<=5; y++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------------------------------------------");
		
//		
		for(int m= 1 ; m<=4; m++){
			for (int n=1; n<=m; n++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------------------");
	}
}
	

