package decision_making_statement;

public class NestedIf {

	public static void main(String[] args) {
		
		float g = 45.23f;
		
		if(g>50) {
			System.out.println("g is greater than 50");
			if(g<20) {
				System.out.println("g is less than 20");
				if (g>50 && g<10) {
					System.out.println("and_true");
					if(g>60 || g<40) {
						System.out.println("or true");
					}
				}
			}
		}else {
			System.out.println("all statement are false");
		}
		
		System.out.println("-------------------------------------");
		
		
		String s = "STP Infotech";
		if (s=="STP Infotech") {
			System.out.println("STP Infotech");
			if (s=="Stp") {
				System.out.println("Stp");
				if(s=="infotech") {
					System.out.println("infotech");
				}
			}
				
		}else {
			System.out.println("all conditions are false");
		}
		
		System.out.println("-------------------------------------");
		
		int i = 30;
		if(i<40) {
			System.out.println("less than 40");
			if (i>20) {
				System.out.println("greater than 20");
				if(i==30) {
					System.out.println("equals 30");
					if(!(i==40)) {
						System.out.println("not equal to 40");
						if(!(i==30 && i>25)) {
							System.out.println("not equal to 30 and not greater than 25");
							if(i<60 || i>50) {
								System.out.println("less than 60 or greater than 50");
							}
						}
					}
				}
			}
		}else {
			System.out.println("none of the above");
		}
	}

}
