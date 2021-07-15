

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class OrangeTest {
WebDriver driver;
	@Test
	public void testcase(){
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Welcome w=new Welcome(driver);
		w.typeUsername();
		w.typePassword();
		w.clickOnLogin();
		
		Login l=new Login(driver);
		l.clickOnMarketplace();
		
		Home h=new Home(driver);
		h.clickOnRequest();
	}

}
