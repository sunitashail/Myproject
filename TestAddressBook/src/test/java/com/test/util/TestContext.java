package com.test.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 *  this is prg to fetch properties file detail
 * @author Sathish
 *
 */
public class TestContext {
	
	public static void main(String[] args) {
		
		System.out.println(TestContext.getInstance().getUserName());
	}

	Properties prop = new Properties();

	private TestContext() {

		try {
			FileInputStream file = new FileInputStream("src\\test\\resources\\testaddress.properties");
			prop.load(file);
			file.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static TestContext testContext = new TestContext();

	public static TestContext getInstance() {

		return testContext;
	}

	public String getUserName() {
		return prop.getProperty("userName");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}

}
