package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verification {
  @Test
  public void password() {
	  System.out.println("Password can be alphanumeric but must be min 6 char");
	  System.out.println("------------------------------------");

  }
  
  @BeforeSuite
  public void beforesuite() {
	  System.out.println("Beforesuite");
  }
  @BeforeTest
  public void BeforeTest() {
	  System.out.println("BeforeTest");
  }
  @BeforeClass
  public void BeforeClass() {
	  System.out.println("Beforeclass");
	  System.out.println("------------------------------------");

  }
  @Test
  public void username() {
	  System.out.println("Username can be email id or phone number");
	  System.out.println("------------------------------------");
	  
  }
  @BeforeMethod
  public void BeforeMethod() {
	  System.out.println("BeforeMethod");
  }
  
}
