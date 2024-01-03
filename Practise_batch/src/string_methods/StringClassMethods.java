package string_methods;

public class StringClassMethods {
	
	String k = "STP infotech";

	public static void main(String[] args) {
		
		String a = "Pratiksha";
		String b = "Thute";
		String c = "THUTE";
		String d = "       prati                 ";
		
		System.out.println("length " + a.length());
		System.out.println("is empty "+ a.isEmpty());
		System.out.println("index of i "+a.indexOf("i"));
		System.out.println("character at 6 is "+ a.charAt(6));
		System.out.println("ends with gya " + a.endsWith("gya"));
		System.out.println("uppercase "+ a.toUpperCase());
		System.out.println("lowercase " + a.toLowerCase());
		System.out.println("concat " + a.concat(b));
		System.out.println("equals " +a.equals("Thute"));
		System.out.println("ignorecase " + b.equalsIgnoreCase(c));
		System.out.println("lastindex of " + a.lastIndexOf(a));
		System.out.println("compare to " + b.compareTo(c));
		System.out.println("replace " + a.replace("ksha", "gya"));
		System.out.println("using trim method");
		System.out.print(d.trim());
		System.out.print(" thute");
		
		System.out.println("---------------------------------------------------------");
		StringClassMethods h = new StringClassMethods();
		System.out.println(h.k);
		System.out.println(h.k.length());
		System.out.println(h.k.indexOf("i"));
		System.out.println(h.k.isEmpty());
		System.out.println(h.k.charAt(6));
		System.out.println(h.k.substring(4));
		System.out.println(h.k.substring(0, 3));
	}

}
