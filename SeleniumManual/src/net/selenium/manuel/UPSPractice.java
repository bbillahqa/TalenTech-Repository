package net.selenium.manuel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UPSPractice {

	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ups.com/us/en/global.page");
		 Thread.sleep(2000);
		 
		WebElement submit = driver.findElement(By.xpath("//*[@id=\"ups-imagemap4_links\"]/li[6]/a"));
		//WebElement submit = driver.findElement(By.cssSelector("#ups-imagemap4_links > li:nth-child(6) > a"));
		 submit.click();
		 String s= driver.getCurrentUrl();
		 driver.quit();
		 System.out.println(s);
	
		 
		 

	}

}
