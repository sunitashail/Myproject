package com.test.addressbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteAddress_Sunita 
{
	public  void deleteaddress(WebDriver driver)
	{
		driver.get("http://a.testaddressbook.com");
		//driver.get("http://a.testaddressbook.com/sign_in");
		
		//Sign_IN
		    driver.findElement(By.xpath("//*[@id='sign-in']")).click();
		    driver.findElement(By.xpath("//*[@id='session_email']")).sendKeys("yes@gmail.com");
		    driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("yes123");
		    driver.findElement(By.xpath("//html/body/div/div/div/div/form/div[3]/input")).click();
		
		
		
		   
		//sign_up
		   /*driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[4]/a")).click();
		    driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("akshayA@gmail.com");
		   driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("morning1");
		   driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[3]/input")).click();
		*/
		   
		    
		    driver.findElement(By.linkText("Addresses")).click();
		    driver.findElement(By.xpath("//html/body/div/table/tbody/tr[1]/td[7]/a")).click();
		    Alert alert = driver.switchTo().alert();	
		    alert.accept();
		    String s=driver.findElement(By.xpath("//html/body/div/div")).getText(); 
		System.out.println(s);
		
		
		
		//sign_out
		//driver.findElement(By.linkText("Sign out"));

	 }

}		   
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
		   
		   
		//Fill address information
		 /*  driver.findElement(By.linkText("Addresses")).click();
		   driver.findElement(By.linkText("New Address")).click(); 
		   driver.findElement(By.xpath("//*[@id='address_first_name']")).sendKeys("mini");
		   driver.findElement(By.xpath("//*[@id='address_last_name']")).sendKeys("alpha");
		   driver.findElement(By.xpath( "//*[@id='address_street_address'])")).sendKeys("alpha 546565");
		   driver.findElement(By.xpath( "//*[@id='address_secondary_address'])")).sendKeys("Beta 1235l");
		   driver.findElement(By.xpath( "//*[@id='address_city'])")).sendKeys("Beta ");
		   driver.findElement(By.xpath( " //select[@id='address_state']/option[@value='Minnesota']"));
		   driver.findElement(By.xpath( "//*[@id='address_zip_code']")).sendKeys("55082");
		  
		   driver.findElement(By.xpath( "/input[@id='address_country_true'][following-sibling::text()[position()=1]]"));
			driver.findElement(By.xpath("//*[@id='address_birthday']"));*/
		   
		  
		   
	
