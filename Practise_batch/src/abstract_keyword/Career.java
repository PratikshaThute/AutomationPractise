package abstract_keyword;

public class Career extends Education {

	public static void main(String[] args) {
		Career details = new Career();
		details.qualification();
		details.college();
		details.CGPA();
		details.passout_year();
		details.Experience_year();
	}

	@Override
	public void qualification() {
		System.out.println("I have completed my graduation in B.Sc");
		
	}

	@Override
	public void CGPA() {
		System.out.println("I secure 8.65 CGPA");
		
	}
	
	public void college() {
		System.out.println("I have completed my graduation from RBCA, Pipri Meghe, Wardha");
	}

	@Override
	public void Experience_year() {
		System.out.println("I have 2.8 years of an Experience");
		
	}

}
