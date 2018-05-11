package net.selenium.manuel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MercuryTours {
	 

	public static void main(String[] args) {
		
	 System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
	 System.setProperty("webdriver.gecko.driver", "/Users/luxicate/Downloads");
	 WebDriver driver = new ChromeDriver();
	 //ChromeDriver driver = new ChromeDriver();
	 //driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("http://newtours.demoaut.com/mercurysignon.php");
	 driver.manage().window().maximize();
	 
	 WebElement userName = driver.findElement(By.name("userName"));
	 userName.sendKeys("talentech");
	 
	 WebElement passWord = driver.findElement(By.name("password"));
	 passWord.sendKeys("talentech123");
	 
	 WebElement submit = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
	 submit.click();
	 driver.quit();
	 
	 
	}

}
