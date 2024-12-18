package framework.prog.praksh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {
	
		WebDriver driver;
		
		@FindBy(id="username") 
		WebElement uname;
		
		@FindBy(id="password") 
		WebElement upass;
		
		@FindBy(id="Login") 
		WebElement log;
		
		public LoginPageObject(WebDriver driver) 
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}

		public void doLogin(String un,String pw)
		{
			uname.sendKeys(un);
			upass.sendKeys(pw);
			log.click();
	
		}
}
