

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	WebDriver driver;
	//Step 1: Identify all the WebElements
	By username=By.id("txtUsername");
	By password=By.name("txtPassword");
	By login= By.id("btnLogin");
	
	
	public Welcome(WebDriver driver){
		this.driver=driver;
	}
	
	//Step 2: For every operation seperate seperate methods needs to be created
	public void typeUsername() {
		driver.findElement(username).sendKeys("Admin");
	}
	public void typePassword() {
		driver.findElement(password).sendKeys("admin123");
	}
	public void clickOnLogin() {
		driver.findElement(login).click();
	}

}
