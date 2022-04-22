package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;

public class RegistrationPage {
  
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver = new ChromeDriver();
//	  System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Mphasis Client Session\\Feb 2022 Batch\\Repository\\Phase 5\\Testing\\chromedriver.exe");
//	  driver  = new ChromeDriver();
  }

 
  @Test
  public void loginTest() {
	  driver.navigate().to("file:///D:/selenium/registration.html");
	  driver.manage().window().maximize();
	  try {
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	  driver.findElement(By.name("user")).sendKeys("Raj");
	  try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}  
	  driver.findElement(By.name("pass")).sendKeys("123");	
	  try {
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	  driver.findElement(By.name("b1")).click();
	  
  }
  
  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
