package net.selenium.manuel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTours2 {
	 

	public static void main(String[] args) throws InterruptedException {
		
	 System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
	 System.setProperty("webdriver.gecko.driver", "/Users/luxicate/Downloads/geckodriver");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/mercurysignon.php");
	 Thread.sleep(2000);
	 
	 WebElement userName = driver.findElement(By.name("userName"));
	 userName.sendKeys("talentech");
	 
	 WebElement passWord = driver.findElement(By.name("password"));
	 passWord.sendKeys("talentech123");
	 
	 WebElement submit = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
	 submit.click();
	 driver.quit();
	 
	 driver = new FirefoxDriver();
	 driver.get("http://newtours.demoaut.com/mercurysignon.php");
	 Thread.sleep(2000);
	 
	 WebElement userName1 = driver.findElement(By.name("userName"));
	 userName1.sendKeys("talentech");
	 
	 WebElement passWord1 = driver.findElement(By.name("password"));
	 passWord1.sendKeys("talentech123");
	 
	 WebElement submit1 = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
	 submit1.click();
	 driver.quit();
	}

}
