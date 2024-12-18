package test_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import framework.prog.praksh.LoginPageObject;

public class Basic_Test {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		
		LoginPageObject lpo=new LoginPageObject(driver);
		lpo.doLogin("renu@123", "123455");
		

	}

}
