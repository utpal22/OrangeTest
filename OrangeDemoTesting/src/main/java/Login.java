

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login{
	WebDriver driver;
	By marketplace= By.id("MP_link");
	
	public Login(WebDriver driver) {
		this.driver=driver;
	}
	public void clickOnMarketplace() {
		driver.findElement(marketplace).click();
	}
}