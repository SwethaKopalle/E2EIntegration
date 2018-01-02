package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_005 {

	@Test
	public void testcase1()
	{
		System.setProperty("webdriver.gecko.driver"	,"./Drivers/geckodriver.exe" );
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("kopella.swetha");
		driver.findElement(By.id("pass")).sendKeys("swetha853044");
		driver.quit();
	}
}
