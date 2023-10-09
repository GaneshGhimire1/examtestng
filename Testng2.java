package testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestTestng3 {
	//write a test case with data provide for login 
	
	WebDriver driver;
	
	 @Test
	  public void test1() {
		 System.setProperty("webdriver.Chrome.driver",
					"C:\\Users\\sharm\\Downloads\\chromedriver\\chromedriver\\chromedriver.exe");

			driver = new ChromeDriver();
			// Selecting the element
	        driver.get("https://www.saucedemo.com/");
	        WebElement username = driver.findElement(By.cssSelector("#user-name"));
	        WebElement password = driver.findElement(By.cssSelector("#password"));
	        WebElement login = driver.findElement(By.cssSelector("#login-button"));
	        
	        // Dash board element
	        username.sendKeys("standard_user");
	        password.sendKeys("secret_sauce");
	        login.click();
			
			
	 }
	
}
