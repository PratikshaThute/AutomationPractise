package assignment;

public class While_Loop {

	public static void main(String[] args) {
		
//		print even number from 200 to 0
		
		int a = 200;
		while(a>=0) {
			if(a%2==0) {
				System.out.println(a);
			}
			a--;
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
//		print odd number from 200 to 0
		
		int b = 200;
		while(b>=0) {
			if(b%2!=0) {
				System.out.println(b);
			}
			b--;
		}
	}

}
