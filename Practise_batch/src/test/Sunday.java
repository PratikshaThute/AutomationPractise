package test;

public class Sunday {
	
	public int k(int x) {
		return 20;
	}
	
	public static void main(String[] args) {
		
		Sunday sun= new Sunday();
		System.out.println(sun.k(85));
		String a = "Mahesh Gyanpeeth";
		String c = "mahesh gyanpeeth";

		String b = "Madhav Dnyanpeeth";
		System.out.println(a.length());
		System.out.println(a.endsWith("th"));
		System.out.println(a.contains("p"));
		System.out.println(a.concat(" Hinganghat"));
		System.out.println(a.isEmpty());
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(c.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.indexOf("G"));
		System.out.println(a.charAt(8));
		System.out.println(a.replace("G", "Dn"));
		System.out.println("-----------------------");
		int z= 70;
		System.out.println(z<50);
			
		System.out.println("-----------------------");
		
		
		
	}

}
