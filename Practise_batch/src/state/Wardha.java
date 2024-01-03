package state;

public class Wardha extends Vidarbha {

	public static void main(String[] args) {
		Wardha wd= new Wardha();
		System.out.println(wd.dist);
		
		
//		here also we cannot use protected method and variable as this class is a child class of vidarbha as a parent 
//		class from state package and not of india or state from country package, hence to use protected access speciifer 
//		in other package there should be the child class
	}

}

