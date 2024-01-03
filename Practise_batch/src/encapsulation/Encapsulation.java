package encapsulation;

public class Encapsulation {
	
	private String nick_name = "prati";
	
	private void name(String real) {
		nick_name = real;
		System.out.println(nick_name);
	}
	
	private int a  = 20;
	private void num(int h) {
		a = h;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Encapsulation enc =  new Encapsulation();
		
//		as variable was taken first will give nick_name
		System.out.println(enc.nick_name);
		
//		now the name pratiksha is being assigned to nick_name arti hence will show pratiksha and hide nick_name
		enc.name("Pratiksha");
		
//		as the name is assigned once will not change back to arti, will result pratiksha

		enc.num(56);
		System.out.println(enc.a);
	}

}
