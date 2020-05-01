package com.abc.magentoobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;
	}
	By email = By.id("email");//has
	By pwd = By.id("pass");//has
	By login = By.id("send2");//has
	
	public void typeEmail(String un) {
		driver.findElement(email).sendKeys(un);
	}
	public void typePwd(String pw) {
		driver.findElement(pwd).sendKeys(pw);
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
}
