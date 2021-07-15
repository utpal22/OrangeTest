package com.bjs.orangeObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
WebDriver driver;
By request=By.id("buyBtn1");

public Home(WebDriver driver) {
	this.driver=driver;
}

public void clickOnRequest() {
	driver.findElement(request).click();
}

}
