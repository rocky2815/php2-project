package php.runner;

import java.io.File;

import org.junit.AfterClass;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/FeatureFiles" }, glue = { "php.stepdef", "php.utilities" }, plugin = { "pretty",
		"html:target/cucumber-htmlreport", "json:target/cucumber-report.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" }, monochrome = true)


public class PhpRunner extends AbstractTestNGCucumberTests {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File("config/config.xml"));

	}

}
