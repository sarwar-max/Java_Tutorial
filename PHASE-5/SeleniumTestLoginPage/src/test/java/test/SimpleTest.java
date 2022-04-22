package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SimpleTest {
	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() {
	      System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	      driver = new ChromeDriver();
	      driver.get("file:///D:/selenium/index.html");
	  }	
	
  @Test
  public void testTitle() {
	  String title = driver.getTitle();
	  assertEquals(title,"MyTestingApp");
	  System.out.println(title);
  }

  @Test
  public void testH1Value() {
	  WebElement ele1 	= driver.findElement(By.tagName("h1"));
	  assertEquals(ele1.getText(),"Html Testing Through driver");
  }
  

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
