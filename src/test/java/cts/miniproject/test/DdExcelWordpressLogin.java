package cts.miniproject.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cts.miniproject.utility.ExcelDataConfig;


public class DdExcelWordpressLogin {
WebDriver driver;
@Test(dataProvider="wordpress")
public void loginToWordpress(String username,String password) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ramya\\Binaries\\chromedriver.exe");
driver=new ChromeDriver();

driver.get("http://demosite.center/wordpress/wp-login.php");
driver.manage().window().maximize();
driver.findElement(By.id("user_login")).sendKeys(username);
driver.findElement(By.id("user_pass")).sendKeys(password);
driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
Assert.assertEquals("http://demosite.center/wordpress/wp-admin/",driver.getCurrentUrl());

System.out.println(driver.getCurrentUrl());
System.out.println("user is able to login sucessfuly");
}
@AfterMethod
public void tearDown() {
driver.quit();
}

@DataProvider(name="wordpress")
public Object[][] passData() {
	
	ExcelDataConfig configExcel=new ExcelDataConfig("C:\\Users\\user\\eclipse-workspace\\ramya\\src\\test\\resources\\XLSX\\TextData.xlsm");
int noofrows=configExcel.getRowCount(0);
	Object[][] data=new Object[noofrows][2];

for(int i=0;i<noofrows;i++) {
	data[i][0]=configExcel.getData(0,i,0);
	data[i][1]=configExcel.getData(0,i,1);
	}
return data;
}
}