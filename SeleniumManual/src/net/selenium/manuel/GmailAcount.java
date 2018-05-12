package net.selenium.manuel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GmailAcount {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "ChromeDriver");
		
		 WebDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		 driver.manage().window().maximize(); 
		 WebElement userName = driver.findElement(By.name("//*[@id=\"identifierId\"]"));
		 userName.sendKeys("bbillah");
		 driver.get("http://newtours.demoaut.com/mercurysignon.php");
		 WebElement passWord = driver.findElement(By.name("//*[@id=\"view_container\"]/div"));
		 passWord.sendKeys("talentech123");
		 
		 WebElement submit = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td/input"));
		 submit.click();
		 driver.quit();
		}

	}


