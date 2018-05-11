//Uncomment each of the BLOCK COMMENT at a time and run the code to see the difference.
package net.selenium.manual;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTours3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		System.setProperty("webdriver.firefox.driver", "/Users/luxicate/Downloads/geckodriver");
		

		// Same page open by two different web browsers 
				
		 WebDriver driver1 = new ChromeDriver();
		 driver1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver1.get("https://www.ups.com/us/en/global.page");
		 driver1.manage().window().maximize(); Thread.sleep(2000);
		 driver1.close(); 
		 
		 WebDriver driver2 = new FirefoxDriver();
		 driver2.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver2.get("https://www.ups.com/us/en/global.page");
		 driver2.manage().window().maximize(); Thread.sleep(2000);
		 driver2.close();
		 

		//UPS Practice - UNBLOCK the below BLOCK COMMENT to use that code
		
     	WebDriver driver3 = new ChromeDriver();
		driver3.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver3.get("https://www.ups.com/us/en/global.page");
		driver3.manage().window().maximize();

		WebElement us = driver3.findElement(By.cssSelector("#ups-imagemap4_links > li:nth-child(6) > a"));
		us.click();
		String s = driver3.getCurrentUrl();
		System.out.println(s);

		WebElement ship = driver3.findElement(By.id("ups-quickStartShip"));
		ship.click();

		WebElement addDifferentReturnAddress = driver3.findElement(By.xpath("//*[@id='mainShipView']/div/div/form/div[3]/label/span/span[3]"));
		addDifferentReturnAddress.click();

		WebElement cancel = driver3.findElement(By.xpath("//*[@id='mainShipView']/div/div/form/app-wizard-nav/div/button[2]"));
		cancel.click();

		WebElement alertCancel = driver3.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/button[2]"));
		Thread.sleep(2000);
		alertCancel.click();
		
		driver3.close();

		
		 // Alert Message practice - UNBLOCK the below BLOCK COMMENT to use that code

		 WebDriver driver4 = new ChromeDriver();
		 driver4.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 driver4.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver4.manage().window().maximize(); 
		 WebElement signIn =driver4.findElement(By.name("proceed")); signIn.click();
		 Thread.sleep(2000); 
		 Alert alert = driver4.switchTo().alert();
		 //alert.accept(); 
		 alert.dismiss();
		 driver4.close();
		 
	}

}
