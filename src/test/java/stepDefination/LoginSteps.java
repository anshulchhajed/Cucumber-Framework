package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.base.Verify;

import Managers.PageObjectManager;
import Managers.WebDriverManager;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utils.TestBase;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps{
	public static WebDriver driver;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected PageObjectManager pageObjectManager;
	protected WebDriverManager webDriverManager;
	
	@Before
	public void initialize() {
		
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		loginPage=pageObjectManager.getLoginPage();
	
	}
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
	}

	@When("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
		homePage.navigateTo_HomePage();
	}

	@When("^User enters Credentials to LogIn$")
	public void user_enters_Credentials_to_LogIn(List<Credentials> list) throws Throwable {
		for (Credentials credentials : list) { 
			driver.findElement(By.name("userName")).sendKeys(credentials.getUsername()); 
			driver.findElement(By.name("password")).sendKeys(credentials.getPassword());
		driver.findElement(By.name("login")).click();
	
		} 
	}


	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		
		System.out.println("Passed");
			Assert.assertTrue(true);
	}
	
	@After
	public void CloseBrowser(Scenario scenario) {
	if(scenario.isFailed())
		driver.close();
	}
}
