package net.selenium.manuel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UPSPractice2 {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ups.com/us/en/global.page");
		 Thread.sleep(2000);
		 driver.quit();
		
	/*	 WebElement submit = driver.findElement(By.xpath("//*[@id=\"ups-imagemap4_links\"]/li[6]/a"));
			//WebElement submit = driver.findElement(By.cssSelector("#ups-imagemap4_links > li:nth-child(6) > a"));
			 submit.click();
		 
		 WebElement submit1 = driver.findElement(By.id("Shipping"));
		 submit1.click();
		 
		 WebElement submit2 = driver.findElement(By.xpath("//*[@id=\"mainShipView\"]/div/div/form/app-wizard-nav/div/button[2]"));
		 submit2.click();
		 
		 WebElement submit3 = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/button[1]"));
		 submit3.click();
		 
		 driver.quit();
		*/ 
		 System.setProperty("webdriver.gecko.driver", "/Users/luxicate/Downloads/geckodriver");
		 driver = new FirefoxDriver();
		 driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 Thread.sleep(20);
		 
		 WebElement submit4 = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input"));
		 submit4.click();
		 
		 Alert alert = driver.switchTo().alert();
		 //alert.accept();
		 alert.dismiss();
		 
		 

		 
	}

}
