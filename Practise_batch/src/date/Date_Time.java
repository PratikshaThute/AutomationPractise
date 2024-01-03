package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Time {

	public static void main(String[] args) {

/*Date d = new Date();
		System.out.println(d.toString());

		System.out.println("------------------------------");

//	for customise date
		SimpleDateFormat s  = new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
		System.out.println(s.format(d));
	}*/
		
		Date  k = new Date();
		System.out.println(k.toString());
		SimpleDateFormat h = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(h.format(k));
		
	}

}
