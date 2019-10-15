package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartBrowser {
	WebDriver driver;
	
	public static StartBrowser_Chrome(String url) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2c.04.02\\Documents\\madhan.kumar.gopal\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
}

