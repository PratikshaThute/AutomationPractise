package super_keyword;

public class Child_01 extends Parent{
	
	float f = 88.18f;
	
	public void methods() {
		System.out.println("i consist of different variable AND methods");
		System.out.println(super.a);
		System.out.println(super.name);
		super.methods();
	}
	
	public Child_01() {
		super();
	}
	
	public static void main(String[] args) {
		Child_01 cv = new Child_01();
		System.out.println("i am instance variable from child_01 class : "+ cv.f);
		cv.methods();
		
	}

}
