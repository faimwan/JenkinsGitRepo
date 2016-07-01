package myPackage;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SmokeTest {

	WebDriver driver;
	
	@Test
	public void loginTest() throws InterruptedException{
		/*final String chromeDriver = "\\drivers\\chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + chromeDriver);
		WebDriver driver = new ChromeDriver(); */
		//WebDriver driver = new ChromeDriver();
		driver = new FirefoxDriver();
		driver.get("http://www.rediff.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='signin_info']/a[text()='Sign in']")).click();
		
		Thread.sleep(3000);
		
		//closing and destroying web driver
		driver.quit();
		
		
		
	}
}
