package ramya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScript {
	@Test
public void LoginToAapplication() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\ramya\\Binaries\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.name("txtUsername")).sendKeys("admin");
driver.findElement(By.id("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
driver.quit();


}
}
