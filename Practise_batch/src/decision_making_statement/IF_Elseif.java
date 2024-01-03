package decision_making_statement;

public class IF_Elseif {

	public static void main(String[] args) {

		int a = 500;
		int b = 1000;
		
		if(a > b) {
			System.out.println(" a is greater than b");
		}else if(a==b) {
			System.out.println("a equals b");
		}else if(!(a<b)) {
			System.out.println("a is not less than b");
		}else if(a>b || a==b) {
			System.out.println("or _ true");	
		}else if(a<b && a>b) {
			System.out.println("and_true");
		}else {
			System.out.println("above statement are false");
		}
			
		System.out.println("-------------------------------------");
			
		double d = 12.36;
		if(d==12.36) {
			System.out.println("equals");
		}else if (d>10) {
			System.out.println("greater than 10");
		}else if ( d<15) {
			System.out.println("less than 15");
		}else {
			System.out.println("false");
		}
		
		System.out.println("-------------------------------------");
		
		String p ="pratiksha";
		if(p=="Pratiksha") {
			System.out.println("false");
		}else if (p=="PRATIKSHA") {
			System.out.println("again_false");
		}else if (p =="pratiksha") {
			System.out.println("validate");
		}else {
			System.out.println("denied");
		}
			
			
	}

}
