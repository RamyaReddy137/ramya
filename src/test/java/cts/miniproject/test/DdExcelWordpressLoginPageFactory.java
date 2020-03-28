package cts.miniproject.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import cts.miniproject.pages.LoginPageWithPageFactory;
import cts.miniproject.utility.BrowserFactory;

public class DdExcelWordpressLoginPageFactory {
	public void checkValidUser() {
		//This will Launch browser and specific url
		BrowserFactory browserfactory=new BrowserFactory();
		WebDriver driver=browserfactory.startBrowser("chrome", "http://demosite.center/wordpress/wp-login.php");

		//Create pageObject using PageFactory
		LoginPageWithPageFactory loginpage=PageFactory.initElements(driver, LoginPageWithPageFactory.class);
		loginpage.typeUserNameAndPassword("admin", "demo123");
		loginpage.clickOnLoginButton();

		String url=driver.getCurrentUrl();
		Assert.assertEquals("http://demosite.center/wordpress/wp-admin/", url);

		}
		}


