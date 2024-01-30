package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;

import SeleniumMavenProject.SeleniumMaven.base_class;

public class Database_testing extends base_class {

	public static void main(String[] args) throws Throwable{
		
	String host = "localhost";
	String Portnumber = "3306";
	
		launch_browser("chrome");
		navigate("https://www.facebook.com/");
		
//		establish connection between eclipse and workbench
		Connection connect = DriverManager.getConnection("jdbc:mysql://" + host+ ":"+ Portnumber +"/automation","root", "Mysql1998");
		
		//create statement
		Statement s = connect.createStatement();
		
//		store the result of query in ref variable. it acts as array so index is zero but in mysql we have index
//		1 and hence we need to shift the index from 0 to 1  hence we use next method.
		
		ResultSet result = s.executeQuery("select * from employee where password = 45656;");
		result.next();
		
//		getstring() method is used if coloumn name is specified with varchar datatype
//		getint() method is used when coloumn has datatype int
		System.out.println("The username is :- " + result.getString("username"));
		System.out.println("The password is :- " + result.getString("e_id"));
		
//		to enter the data fetch from database into application
		driver.findElement(By.cssSelector("input#email")).sendKeys(result.getString("username"));
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys(result.getString("e_id"));
	}

}
