package this_keyword;

public class Child extends Parent  {

	double f = 88.18;

	public void set() {
		System.out.println("Child class method");
	}
	
	public void data() {
		System.out.println("data method");
		System.out.println(this.f);
		System.out.println(this.a);
		System.out.println(this.h);
		this.get();
	
	}
	
	public static void main(String[] args) {
		Child k = new Child();
		
	k.data();
	k.set();
	}

}
