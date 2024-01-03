package decision_making_statement;

public class If_Statement {

	public static void main(String[] args) {

		int a = 25;
		
		if(a>20) {
			System.out.println("a is greater than 20");
		}
		
		if(a<20) {
			System.out.println("a is less than 20");
		}
		
		if (a==20) {
			System.out.println("a is equal to 20");
		}
		
		System.out.println("for false statement");
		System.out.println("--------------------------------------");
		
		double b = 25.3652;
		
		if (b == 45) {
			System.out.println("b equals 45");
		}
		if (!(b==25.3652)) {
			System.out.println("b is not equal to  25.3652");
		}
		System.out.println("above statement are false");
	}
	

}
