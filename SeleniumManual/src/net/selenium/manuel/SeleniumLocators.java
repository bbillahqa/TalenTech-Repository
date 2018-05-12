package net.selenium.manuel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chromedriver.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.seleniumpoint.com/testwebsite.php");
		driver.findElement(By.name("uname")).sendKeys("Bbillah");
		//driver.findElement(By.linkText("terms")).click();
		driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("3474451021");
		
	
		
		

	}

}
