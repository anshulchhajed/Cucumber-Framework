package Utils;

import org.openqa.selenium.WebDriver;

import Managers.PageObjectManager;
import Managers.WebDriverManager;
import PageObjects.HomePage;
import PageObjects.LoginPage;

public class TestBase {


	public static WebDriver driver;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;

	public WebDriver initialization() {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
	
		return driver;
	}

}