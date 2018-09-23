package com.test.addressbook;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Validate_Navigation_sunita{
	public void navigation(WebDriver driver)
	{
		driver.get("http://a.testaddressbook.com");
		
		//Sign_IN
		    driver.findElement(By.xpath("//*[@id='sign-in']")).click();
		    driver.findElement(By.xpath("//*[@id='session_email']")).sendKeys("yes@gmail.com");
		    driver.findElement(By.xpath("//input[@id='session_password']")).sendKeys("yes123");
		    driver.findElement(By.xpath("//html/body/div/div/div/div/form/div[3]/input")).click();
		
		
           //validate navigation
		   driver.findElement(By.linkText("Addresses")).click();
                   driver.findElement(By.linkText("New Address")).click();
		   driver.findElement(By.xpath("//*[@id='address_first_name']")).sendKeys("mini");
 		   driver.findElement(By.xpath("//*[@id='address_last_name']")).sendKeys("alpha");
 		   
 		   driver.findElement(By.xpath( "//*[@id='address_street_address']")).sendKeys("alpha 546565");
 		   driver.findElement(By.xpath( "//*[@id='address_secondary_address']")).sendKeys("Beta 1235l");
 		   driver.findElement(By.xpath( "//*[@id='address_city']")).sendKeys("Beta ");
 		   //driver.findElement(By.xpath( " //select[@id='address_state']/option[@value='Minnesota']"));
 		   
 		  
 		   WebElement dropdown=driver.findElement(By.xpath("//*[@id='address_state']"));// state
 		   Select state=new Select(dropdown);
 		   state.selectByIndex(2);
 		   state.selectByVisibleText("Minnesota");
 		  driver.findElement(By.xpath( "//*[@id='address_zip_code']")).sendKeys("55082");//Zipcode
 		   
 		   //to print element of select
 		   List<WebElement> options=state.getOptions();
 		   for(int i=0;i<options.size();i++){
 			  System.out.println(options.get(i).getText());
 		   }
 		   
 		  List<WebElement> radios=driver.findElements(By.name("address[country]")); //country
 		  System.out.println(radios.size());
 		  radios.get(0).click();
 		  System.out.println(radios.get(0).getText());
 		  
 		  //********************************8
 		  
 		  
 		  
 		  //Add birthdate in Address
 		/* driver.findElement(By.xpath("//*[@id='address_birthday']")).click();;
 		List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
 		
 		for(WebElement W:allDates)
 		{
 		   String text = W.getText();
 		   if(text.equalsIgnoreCase("6"))
 		   {
 		     W.click();
 		     break;
 		   } 
 		   else
 		   {
 		           //System.out.println("Couldnt find the text");
 		   }
 		} 
 		//driver.quit();*/
 		  
 		  //Add colour in Address
 		 // driver.findElement(By.xpath("//*[@id='address_color']")).click();
 		/*  driver.findElement(By.xpath("//*[@id='address_picture']")).click();
 		 try {
			Runtime.getRuntime().exec("C:\\Sep2018\\FileUpload.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
 		
 		  
 		  
 		
 		
 		
 		
 		
 		
 		
 		//*****************************************
 		  
 		   
 		  driver.findElement(By.xpath("/html/body/div/div/div/form/div[17]/input")).click();//to click on create button
 		  String s=driver.findElement(By.xpath("//div[@class='container']/div")).getText(); //to print address added
 		  System.out.println(s);
		  driver.findElement(By.linkText("List")).click();
 		  
 		
		    //sign_out
			driver.findElement(By.linkText("Sign out")).click();;
		    
		    
		    
		//sign_up
		   /*driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[4]/a")).click();
		    driver.findElement(By.xpath("//*[@id='user_email']")).sendKeys("akshayA@gmail.com");
		   driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("morning1");
		   driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[3]/input")).click();
		*/
		 

	 }

}
