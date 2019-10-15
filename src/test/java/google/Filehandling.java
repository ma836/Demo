package google;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Filehandling {
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\a08019dirp_c2c.04.02\\Documents\\madhan.kumar.gopal\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	  
	  
	  File src = new File("C:\\Users\\a08019dirp_c2c.04.02\\Documents\\madhan.kumar.gopal\\Filehandles.xlsx");
	  FileInputStream fis = new FileInputStream(src);
	  XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet1 = wb.getSheetAt(0);
	  
	  
	  for(int i=0;i<3;i++)
	  {
	  String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
	  System.out.println(data0);
	  
	  String data1 = sheet1.getRow(i).getCell(1).getStringCellValue();
	  System.out.println(data1);
	  
	  driver.findElement(By.name("userName")).sendKeys(data0);
	  driver.findElement(By.name("password")).sendKeys(data1);
	  driver.findElement(By.name("login")).click();
	  
	  String title = driver.getTitle();
	  System.out.println(title);
	  sheet1.getRow(i).createCell(2).setCellValue(title);
	  
	  driver.navigate().back();
	  }
//	  JavascriptExecutor js = (JavascriptExecutor) driver;
//	  js.executeScript("alert('Window is going to close!')");
	  
	  driver.close();
	  
	  FileOutputStream fo = new FileOutputStream(src);
	  wb.write(fo);
	  wb.close();
  }
}
