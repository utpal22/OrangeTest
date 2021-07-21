package com.bjs.orangeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome {
	WebDriver driver;
	//Annotations are used here(@FindBy). Others Same as PageObjModel
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(name="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	
	public Welcome(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	public void typeUsername() {
		username.sendKeys("Admin");
	}
	public void typePassword() {
		password.sendKeys("admin123");
	}
	public void clickOnLogin() {
		login.click();
	}
}
