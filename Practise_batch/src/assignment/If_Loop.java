package assignment;

public class If_Loop {

	public static void main(String[] args) {
//		print even number from 200 to 0
		
		for(int a = 200; a>=0; a--) {
			if(a%2==0) {
				System.out.println(a);
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------------");
		System.out.println();
		
//		print odd number from 200 to 0
		for (int b = 200; b>=0; b--) {
			if(b%2!=0) {
				System.out.println(b);
			}
		}
	}

}
