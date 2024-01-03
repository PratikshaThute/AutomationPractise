package nested_loop;

public class HollowRectangle {

	public static void main(String[] args) {
		
		int row = 4; int col =5; int row1=1 ; int col1=1;
		for(int a = 1; a<=4; a++) {
			for (int b = 1; b<=5; b++) {
				if(a==4 || b==5 || a==1 || b==1) {
				System.out.print("*");	
			}else {
			System.out.print(" ");
		}
			
	}
			System.out.println();
	}
		
System.out.println("-----------------------------------------------");

for (int c=1; c<=6; c++) {
	for(int d =1; d<=7; d++) {
		if(c==1 || d==1|| c==6|| d==7) {
			System.out.print("*");
		}else {
			System.out.print(" ");
		}
	}
	System.out.println();
}

}
	}