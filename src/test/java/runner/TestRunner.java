package runner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features",	
		glue="stepDefination",
		//plugin= {"pretty","html:target/cucumber-html-report"},
		//plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		plugin= {"pretty","html:target/cucumber-reports","json:target/cucumber-reports/cucumber.json"},

		monochrome=true,  //Display the console output in proper readable format.
		//strict=false,     //It will check if any step is not  defined in step defination file
		//dryRun=false  ,  // To check the mapping is proper between feature file and step defination file
		tags={"@LoginCheck"}
		)
public class TestRunner {
	/*@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("configs/report.xml"));
		

	}*/
}
