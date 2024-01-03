package java_basic;

public class StringConcatination {
// for two seperate string
	String p = " Pratiksha";
	String t = " Thute";
	
/* to combine two above string
USING CONCAT METHOD*/
	String n = p.concat(t);
	
//	single string with two values
	String h = " ab " + " cd " ;
	
	public static void main(String[] args) {
		StringConcatination SC = new StringConcatination();
		System.out.println(SC.n);
		
//		Using + operator
		System.out.println(SC.p +" "+ SC.t);
//		to access single string with two values
		System.out.println(SC.h);
	}

}
