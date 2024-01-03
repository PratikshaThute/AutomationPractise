
public class Split_Method {

	public static void main(String[] args) {

		String h = "Automation";
		for (int i = 0; i < h.length(); i++) {
			System.out.print(h.charAt(i) + " ");
		}

		System.out.println();

		for (int j = h.length() - 1; j >= 0; j--) {
			System.out.print(h.charAt(j) + " ");
		}
		System.out.println("-------------------------------");

		String a = "Automation Testing is faster in execution than Manual Testing";
		String[] q = a.split(" ");
		System.out.println(q[0]);
		System.out.println(q[1]);
		System.out.println(q[2]);
		System.out.println(q[3]);
		System.out.println(q[4]);
		System.out.println(q[5]);
		System.out.println(q[6]);
		System.out.println(q[7]);
		System.out.println(q[8]);

		System.out.println("-------------------------------");

		String b = "Pratiksha Thute";
		String[] o = b.split("h");
		System.out.println(o[0]);
		System.out.println(o[1]);
		System.out.println(o[2]);
		
		System.out.println("-------------------------------");
		
		String p = "My email id is pthute29@gmail.com";
		String[] t = p.split(" ");
		System.out.println(t[4]);


		System.out.println("-------------------------------");

	}

}
