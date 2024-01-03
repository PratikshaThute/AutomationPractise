package jump_statement;

public class Break_ {

	public static void main(String[] args) {
		
		for (int a =1; a<=15; a++) {
			System.out.println(a);
			if(a==10) {
				break;
			}
		}
		
		System.out.println("--------------------------------------------------");
		
		int b = 50;
		while(b>=1) {
			if(b==21) {
				break;
			}
			System.out.println(b);
			b--;
		}
		
		System.out.println("--------------------------------------------------");

		
		int c =1;
		do {
			if(c==6) {
				break;
			}
			System.out.println(c);
			c++;
		}while(c<=10);
	}
}
