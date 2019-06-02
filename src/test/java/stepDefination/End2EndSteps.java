package stepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import Managers.PageObjectManager;
import Managers.WebDriverManager;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utils.TestBase;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Managers.*;
public class End2EndSteps extends TestBase{

	

	public  WebDriver driver;
	protected HomePage homePage;
	protected LoginPage loginPage;
	protected PageObjectManager pageObjectManager;
	public WebDriverManager webDriverManager;
	
	@Given("^Open Browser and start application$")
	public void open_Browser_and_start_application() throws Throwable {
		
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		homePage.navigateTo_HomePage(); 
		loginPage=pageObjectManager.getLoginPage();
	}

	@When("^I enter valid username and password$")
	public void i_enter_valid_username_and_password(DataTable data) throws Throwable {
		List<Map<String,String>> list=data.asMaps(String.class,String.class);
	
		loginPage.enterUserName(list.get(0).get("Username"));
		loginPage.enterPassword(list.get(0).get("Password"));
	}

	@When("^Click on Login Button$")
	public void click_on_Login_Button() throws Throwable {
		loginPage.clickSignIn();
	}

	@Then("^User should be able to login successfuly$")
	public void user_should_be_able_to_login_successfuly() throws Throwable {

	}
}
