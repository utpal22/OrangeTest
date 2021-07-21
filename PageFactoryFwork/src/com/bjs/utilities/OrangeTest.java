package com.bjs.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bjs.orangeObject.Home;
import com.bjs.orangeObject.Login;
import com.bjs.orangeObject.Welcome;

public class OrangeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
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
		h.clickonRequest();
	}

}
