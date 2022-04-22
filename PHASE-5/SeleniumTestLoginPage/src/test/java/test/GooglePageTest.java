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

public class GooglePageTest {
  
  WebDriver driver;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	  driver = new ChromeDriver();
//	  System.setProperty("webdriver.chrome.driver", "D:\\Desktop\\Mphasis Client Session\\Feb 2022 Batch\\Repository\\Phase 5\\Testing\\chromedriver.exe");
//	  driver  = new ChromeDriver();
  }

  
  
  @Test
  public void googlePageTest() {
	  driver.navigate().to("https://www.google.com");
	  driver.manage().window().maximize();
//	 WebElement ele1  = driver.findElement(By.className("lnXdpd"));
//	 System.out.println(ele1.getTagName());
//	 //System.out.println(ele1.getText());
//	 WebElement ele3 = driver.findElement(By.name("q"));
//	 ele3.sendKeys("Testing framework");
//	  WebElement ele2 = driver.findElement(By.name("btnK"));
//	  ele2.click();
	  driver.findElement(By.name("q")).sendKeys("Testing framework");
	  driver.findElement(By.name("btnK")).click();
	 // driver.navigate().forward();
  }
 
  @Test
  public void loginTest() {
	  driver.navigate().to("file:///D:/selenium/login.html");
	  driver.manage().window().maximize();
	  try {
		Thread.sleep(5000);
	} catch (Exception e) {
		// TODO: handle exception
	}
	  driver.findElement(By.name("user")).sendKeys("Sarwar");
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
