package stepdefinition;
import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import util.DriverFactory;
import util.Utilities;



public class Hooks extends DriverFactory{
	
	@Before
	public void setUp(Scenario scenario) throws Throwable {
		//Driver initialization
		initialization();
		Utilities.scenario = scenario;
	}
	@AfterStep
	public void as(Scenario scenario) throws IOException {
		scenario.attach(Utilities.getByteScreenshot(driver), "image/png", "");
	}
	
	@After
	public void CloseBrowser() throws Throwable {
		Thread.sleep(1000);
//		driver.close();
		driver.quit();
	}
	
}