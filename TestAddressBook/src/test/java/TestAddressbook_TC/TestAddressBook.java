package TestAddressbook_TC;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestAddressBook {

		WebDriver driver;
		
		@BeforeClass
		public void beforeLogIn() {
			
			System.setProperty("webdriver.gecko.driver","C:\\softwareforselenium\\geckodriver.exe");
			  driver = new FirefoxDriver();
			  driver.get("http://a.testaddressbook.com/sign_in"); 
			
		}
		
		@Test
		public void logIn(){
			
			driver.findElement(By.xpath(".//*[@id='session_email']")).sendKeys("archis@gmail.com");
			driver.findElement(By.xpath(".//*[@id='session_password']")).sendKeys("testtest2018");
			driver.findElement(By.xpath(".//*[@id='clearance']/div/div/form/div[3]/input")).click();
			
		}
		
		@AfterClass
		public void afterLogIn(){
			driver.quit();
		}

	}

	
