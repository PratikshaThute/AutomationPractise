package java_operators;

public class LogicalOperator {

	public static void main(String[] args) {

//		logical and (condition 1 && condition 2)
//		both condition must be satisfied to get result as true
		
		int p = 1000;
		int q = 500;
		System.out.println(p>800 && q<800);
		
		System.out.println(p<700 && q>500);
		
		System.out.println(p==1000 && q!=400);
		
		System.out.println(p>=1000 && q<=500);
		
		System.out.println(p!=1000 && q!=500);
		System.out.println("------------------------------------------------------");
		
//		----------------------------------------------------------------------
		
//		Logical or (condition 1 || condition 2)
//		any of the one condition must be satisfied to get result as true
		
		double a = 50.20;
		double b = 20.23;
		System.out.println(a>70.00 || b==20.23);
		
//		none of the condition is satisfied hence will result false
		System.out.println(a!=50.20 || b>=50.23);
		
		System.out.println("------------------------------------------------------");

//		--------------------------------------------------------------------------------------
		
//		Logical not (!condition)
		
		float s = 10.12f;
		float t = 45.65f;
		boolean r = s>t;
//		the answer is false but as we use logical not it will reverse the answer and result will be false
		System.out.println(!r);
		System.out.println(!(s==t));
		System.out.println(!(s!=t));
	}

}
