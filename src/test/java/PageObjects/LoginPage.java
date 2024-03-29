package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);  
	}

	@FindBy(name="q")
	private WebElement usame;

	@FindBy(name="q")
	private WebElement pswd;

	@FindBy(name="btnK")
	private WebElement login;



	public void enterUserName(String user) {
		usame.sendKeys(user);
	}

	public  void enterPassword(String pass) {
		pswd.sendKeys(pass);

	}

	public  void clickSignIn() {
		login.click();
	}
	
	//Binding- Methods
	public void loginApplication(String user,String pass) {
		enterUserName(user);
		enterPassword(pass);
		clickSignIn();
	}

}
