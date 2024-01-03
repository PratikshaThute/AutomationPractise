package return_statement;

public class Class_001 {

/*public void name() {
		 
	 }
	
	public void gh (int d) {
		System.out.println(d);
	}
	
	public void km(float n) {
		System.out.println(123f);
		 return;
	}*/
	
	public int add(int  x, int y) {
		return x+y;
	}
	
	public double subtract (double p, double q) {
		return p-q;
	}
	 
//	here we already have given the return result so will be taken into consideration
	
	 public String get(String a) {
		 return "multiple character";
	 }
	
	 public int addition(int z) {
			return 20;
		}
	 public Integer xy (Integer m) {
		 return m;
	 }
	 public int mg (Number kl) {
		 return 70;
	 }
	 public String hgt (String c) {
		 return c;
	 }
	 
	 public static int abc(int jk) {
		 return 56;
	 }
	
	public static void main(String[] args) {
		Class_001 a = new Class_001();
//		a.name();
//		a.gh(78);
//		a.km(2f);
		System.out.println(a.add(5, 7));
		System.out.println(a.subtract(96.20,196.20));
		System.out.println(a.get("result"));
		System.out.println(a.addition(56));
		System.out.println(a.xy(21));
		System.out.println(a.mg(23));
		System.out.println(a.hgt("Hinganghat"));
		System.out.println(a.abc(23));
	}

}
