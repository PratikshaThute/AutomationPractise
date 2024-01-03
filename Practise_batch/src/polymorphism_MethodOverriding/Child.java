package polymorphism_MethodOverriding;

public class Child extends Parent {
	
	public String name(String a) {
		System.out.println("My name is Prati");
		return a;
	}
	
	public void age (int i) {
		System.out.println("i am 20 yrs old");
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.name("kl");
		c.age(6);
		
		System.out.println("-------------------------------");
		
//		during compile time shows access to parent class but gives output as child class when parent 
//		class object hold child class object
		Parent p = new Child();
		p.name("lm");
		p.age(8);
		
		System.out.println("-------------------------------");

//		during compile time shows access to parent class and gives output of parent class in has a relationship

		Parent p1 = new Parent();
		p1.name("jk");
		p1.age(2);
	}

	
}
