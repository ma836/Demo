package google;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class NewTest {
	WebDriver driver;
	String ExpectedResult = "selenium - Google Search";

  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2c.04.02\\Documents\\madhan.kumar.gopal\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  driver.findElement(By.name("q")).submit();
	  WebDriverWait wait = new WebDriverWait(driver,30);
	  wait.until(ExpectedConditions.titleContains(ExpectedResult));
	  Assert.assertEquals(ExpectedResult, driver.getTitle());
	  driver.close();
  }
}
