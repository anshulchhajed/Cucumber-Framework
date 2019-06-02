package stepDefination;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Steps{

	static WebDriver driver=null;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\anshul_chhajed\\Desktop\\New folder\\chromedriver.exe");;
		DesiredCapabilities handlSSLErr = DesiredCapabilities.chrome();     
		handlSSLErr.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
		WebDriver driver = new ChromeDriver (handlSSLErr);
		driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.google.co.in");
		driver.findElement(By.xpath("//input[@name]"));
	}

}