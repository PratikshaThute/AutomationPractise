package polymorphism;

public class Testing {

	public void Manual_T() {
		System.out.println(" I started my career in Manual Testing");
	}

	public void Manual_T(int no) {
		System.out.println("there are 3 methods in manual testing");
	}

	public void Manual_T(String types) {
		System.out.println("Two types as Functional & Non Functional testing");
	}

	public void Manual_T(int x, String y) {
		System.out.println("Functional testing includes 6 different types and Non functional use to verify performance load");
	}

	public void Manual_T(double d) {
		System.out.println("We write testcases only for Functional Testing");
	}

	public static void main(String[] args) {
		Testing test = new Testing();
		test.Manual_T();
		test.Manual_T(4);
		test.Manual_T("name");
		test.Manual_T(6, "Non Functional");
		test.Manual_T(22.21);
	}

}
