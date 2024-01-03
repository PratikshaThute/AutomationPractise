package array;

public class SingleDimensionArray {

	public static void main(String[] args) {
		int [] ab = new int [5];
		ab[0]= 5;
		ab[1]= 15;
		ab[2]= 25;
		ab[3]= 35;
		ab[4]= 45;
		
		System.out.println(ab[2]);
		System.out.println(ab.length);
		for(int i=0; i<ab.length;i++) {
			System.out.println(ab[i]);
		}
		System.out.println("-------------------");
		for(int j:ab) {
			System.out.println(j);
		}
	}

}
