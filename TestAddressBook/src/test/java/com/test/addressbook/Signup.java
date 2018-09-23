package com.test.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Signup {
	WebDriver driver;

	@BeforeClass
	public void doBefore() {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://a.testaddressbook.com/sign_up");

	}

	@Test
	public void validatesignup() {

		driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("she3za@g0a53.com");
		driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("sharma");
		driver.findElement(By.xpath("//*[@id=\"new_user\"]/div[3]/input")).click();

	}

	@AfterClass
	public void aftersignup() {
		driver.quit();

	}
}
