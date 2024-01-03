package state;

import country.India;

public class Vidarbha {
	
	int dist = 11;
	
	public static void main(String[] args) {
		Vidarbha vd =  new Vidarbha();
		System.out.println(vd.dist);
	
//		as this class is not the child class of india or state class from country package, we cannot use protected access specifier here
	}

}
