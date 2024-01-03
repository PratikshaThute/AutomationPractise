package scanner_class;

import java.util.Scanner;

public class Scanner_Switchblock_String {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		String p = sc.nextLine();
		
		System.out.println("Enter last Name");
		String q = sc.nextLine();
		
		System.out.println("Select the first name among Renuka, Akshay, Pooja, Pratiksha, Prasad");
		String r = sc.nextLine();
		
		switch(r) {
		
		case "Renuka" :
				p="Renuka";
				break;
				
		case "Akshay" :
			p="Akshay";
			break;
			
		case "Pooja" :
			p="Pooja";
			break;
			
		case "Pratiksha" :
			p="Pratiksha";
			break;
			
		case "Prasad" :
			p="Prasad";
			break;
			
		default :
			p= "none of the above";
			break;
		}
		System.out.println("My name is :" + p + " "+ q);
	}

}
