package google;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Resize {
	WebDriver driver;
	String ExpectedResult = "selenium - Google Search";
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2c.04.02\\Documents\\madhan.kumar.gopal\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
	  WebElement e = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	  Actions action = new Actions(driver);
	  action.dragAndDropBy(e, 400, 300).perform();
	  driver.close();
  }
}
