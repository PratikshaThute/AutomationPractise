package loop;

public class WhileLoop {

	public static void main(String[] args) {
		
//		from 0 to 10;
		int  a = 0;
		while(a<11){
			System.out.println(a);
			a++;
		}
		System.out.println("------------------------------");
		
//		even numbers from 0 to 100
		int v = 0;
		while(v<=100) {
			if(v%2==0) {
				System.out.println(v);
			}
			v++;
		}
		
		System.out.println("------------------------------");
//		odd nos. from 0 to 100
		int u = 0;
		while(u<=100) {
			if(u%2!= 0) {
				System.out.println(u);
			}
			u++;
		}
		System.out.println("------------------------------");
		
//		even numbers from 100 to 0 
//		int b = 100;
//		while(b>=0) {
//			if(b%2==0) {
//				System.out.println(b);
//			}
//			b--;
//		}
		System.out.println("------------------------------");
		
//		odd numbers from 100 to 0
//		int c = 100;
//		while(c>=0) {
//			if(c%2!=0) {
//				System.out.println(c);
//			}
//			c--;
//		}

		
		
	}

}
