package decision_making_statement;

public class If_Else {

	public static void main(String[] args) {
		float k = 10f;
		float l = 20f;
		
		if(k>l) {
			System.out.println("k is greater than l");	
		}else {
			System.out.println("k is smaller than l");
		}
		
		if(k==l) {
			System.out.println("k equals l");
		}else {
			System.out.println("k is not equals to l");
		}
		
		if (k<l && l>k) {
			System.out.println(" and_ true");
		}else {
		System.out.println("and _false");
		}
		
		if (k==l || l>k) {
			System.out.println("or_true");
		}else {
			System.out.println("or_false");
		}
	}

}
