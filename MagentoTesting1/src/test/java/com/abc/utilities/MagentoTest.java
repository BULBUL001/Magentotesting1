package com.abc.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.abc.magentoobjects.Home;
import com.abc.magentoobjects.Login;
import com.abc.magentoobjects.Welcome;

public class MagentoTest {
	@Test
	public void positiveCredential() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();
		
		Login l = new Login(driver);
		l.typeEmail("ihassan395@gmail.com");
		l.typePwd("Welcome@123");
		l.clickLogin();
		
		Home h = new Home(driver);
		h.clickOnLogout();
		Thread.sleep(5000);
		driver.close();
	}
}