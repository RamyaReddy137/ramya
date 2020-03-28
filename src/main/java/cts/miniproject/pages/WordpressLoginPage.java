package cts.miniproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WordpressLoginPage {
	WebDriver driver;
	By username=By.id("user_login");
	By password=By.xpath("//input[@id='user_pass']");
	By loginButton=By.xpath("//input[@id='wp-submit']");
	By checkbox=By.id("rememberme");

	public WordpressLoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void typeUserNameAndPassword(String userid,String pass) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
	}
	/*public void typeUserName() {
		driver.findElement(username).sendKeys("admin");
	}
	public void typePassword() {
		driver.findElement(password).sendKeys("demo123");
	}*/
	public void ClickOnLoginButton() {
		driver.findElement(loginButton).click();
	}
}