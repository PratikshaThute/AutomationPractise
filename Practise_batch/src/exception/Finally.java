package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Finally {

	public static void main(String[] args) throws Exception {
		System.out.println("Start programme");
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		finally {
			System.out.println("Execute even if programme runs successfully and also execute if not");
		}

		
		System.out.println("hiii");
		try {
			FileInputStream fis = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("complete task");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread.sleep(3000);
		
	}

}
