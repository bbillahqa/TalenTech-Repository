package net.selenium.manuel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UPSCreateAccout {

	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver", "/Users/luxicate/Downloads/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.ups.com/us/en/Home.page");
		 Thread.sleep(2000);
	
		 WebElement submit = driver.findElement(By.xpath("//*[@id=\"ups-navItems\"]/ul[2]/li[2]/a"));
		 submit.click();
		 
		 WebElement submit5 = driver.findElement(By.cssSelector("#ups-checkbox_group > div > label"));
		 submit5.click();
		 
		 WebElement submit1 = driver.findElement(By.id("ups-full_name_input"));
		 submit1.sendKeys("Baki Billahhh");
		 
		 WebElement submit2 = driver.findElement(By.name("email_input"));
		 submit2.sendKeys("talentech@gmail.com");
		 
		 WebElement submit3 = driver.findElement(By.name("user_id_input"));
		 submit3.sendKeys("talentechhh");
		 
		 WebElement submit4 = driver.findElement(By.id("ups-user_password_input"));
		 submit4.sendKeys("Password@123");
		 
		 WebElement submit6 = driver.findElement(By.xpath("//*[@id=\"SignupDiv\"]/div[1]/div/div/div[2]/div[2]/form/div[4]/div/button/span[2]"));
		 submit6.click();
		

	}

}
