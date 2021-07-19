package com.TestNG_Programs;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testng_ParallelTest {
	
	@Test
	private void facebook() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri Harish D\\eclipse-workspace\\TestNG_Programs\\Driver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
	}
	
	@Test
	private void instagram() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sri Harish D\\eclipse-workspace\\TestNG_Programs\\Driver91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}

}
