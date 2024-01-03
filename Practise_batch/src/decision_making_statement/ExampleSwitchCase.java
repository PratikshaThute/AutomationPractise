package decision_making_statement;

public class ExampleSwitchCase {

	public static void main(String[] args) {
		int month_no = 3;
		String month;
		
		switch (month_no) {
		case 1 :
			month = "jan";
			break;
		case 2 :
			month = "feb";
			break;
		case 3 :
			month = "march";
			break;
		case 4 :
			month = "april";
			break;
		case 5:
			month = "may";
			break;
			default :
				month = "none of the above";
		}
		System.out.println("the month is : "+ month);
	}

}
