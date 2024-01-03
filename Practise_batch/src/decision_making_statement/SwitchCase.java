package decision_making_statement;

public class SwitchCase {


	public static void main(String[] args) {
		
		 int a = 12;
		switch(a) {
		case 2:
			System.out.println("case-2");
			break;
		case 4:
			System.out.println("case-4");
			break;
		case 6:
		System.out.println("case-6");
		break;
		case 8:
			System.out.println("case-8");
			break;
		case 10:
			System.out.println("case-10");
			break;
		case 12:
			System.out.println("case-12");
			break;
			default:
				System.out.println("none of the above case");
		}
		
		System.out.println("------------------------------------------");
		
		
		String k = "Automation Testing";
		switch(k) {
		case "STP" :
			System.out.println("stp");
			break;
		case "infotech" :
			System.out.println("infotech");
			break;
		case "selenium" :
			System.out.println("selenium");
			break;
			default:
				System.out.println("Manual Testing");
			
		}
	}

}
