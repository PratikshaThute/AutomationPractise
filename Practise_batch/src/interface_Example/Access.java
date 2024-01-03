package interface_Example;

public class Access extends Execute implements Interface, Interface_2 {

	public static void main(String[] args) {
		Access acs = new Access();
		System.out.println("In addition to manual testing i posses knowledge of " + acs.testing + " as well.");
		System.out.println("In java there are " + acs.methods + " methods");
		acs.datatype();
		acs.variables();
		acs.Specialization();
		acs.stream();
		
	}

	@Override
	public void variables() {
		System.out.println("There are 3 types of variables based on there declaration.");
	}

	@Override
	public void datatype() {
		System.out.println("The datatypes are classified as primitive and non-primitive datatypes.");
	}

}
