package nested_ex;

public class Triangle {
	public static void main(String[] args) {
		
		for(int i = 7; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		
		for(int g=1; g<=5;g++) {
			for(int h=1; h<=5-g; h++) {
				System.out.print(" ");
			}
			for(int f = 1; f<=g; f++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");

		for(int m = 1; m<=4; m++) {
			for(int n =1; n<=6; n++) {
				if(m==1 || n==1 || m==4 || n==6) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		System.out.println("----------------------------------------");
		
		int o = 1;
		for(int q =1;q<6;q++) {
			for(int u =1;u<=q;u++) {
				System.out.print(o+" ");
				o++;
			}
			System.out.println();
		}
		System.out.println("----------------------------------------");
		for(int p =1; p<=6;p++) {
			for(int w =1;w<=p;w++) {
			int sum =p+w;
			if(sum%2==0) {
				System.out.print("1 ");
			}else {
				System.out.print("0 ");
			}
		}
			System.out.println();

		}
	}
}
