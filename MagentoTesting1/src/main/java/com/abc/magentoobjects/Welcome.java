package com.abc.magentoobjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Welcome {
	WebDriver driver;

	public Welcome(WebDriver driver) {
		this.driver = driver;
	}
	By myAcct = By.linkText("My Account");//has
	
	public void clickOnMyAccount() {
		driver.findElement(myAcct).click();
	}
}
