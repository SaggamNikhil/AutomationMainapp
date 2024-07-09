package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class LiveCollection extends DriverFactory {
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Dashboard_name          = By.xpath("//section[@class='content-header']");
	By Collection_men          = By.xpath("//span[text()='Collection']");
	By Live_collection         = By.xpath("//a[@href='#/liveCollection']");
	By State_selection         = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By State_sel_one           = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By State_sel_two           = By.xpath("//div[text()='Arunachal Pradesh - AR']");
	By Select_collection_cen   = By.xpath("//md-select[@ng-model='request.Codes']");
	By Select_coll_option_one  = By.xpath("//div[text()='AGRI-CC-AP-WG-Ayyavaram - CCAPAYV']");
	By Select_coll_option_two  = By.xpath("//div[text()='AGRI-CC-AR-LDV-Iduli - CCARIDU']");
	By From_Date_sel           = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By From_date_toast         = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_click            = By.xpath("//button[@ng-click='getReport(request)']");
	By total_collection_ip     = By.xpath("//div[@ng-show='liveCollData.length>0']");
	
   
	public void User_is_on_login_page_of_oilpalm_screens() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}

	public void The_User_enters_with_the_username_and_passwords_ipt_data_details() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}

	public void Clicks_on_the_logins_button_from_the_login_details_pag() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_pag() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dashboard_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Click_on_the_Live_Collection_details_screen() throws Throwable {
		utilities.webDriverWait(driver, Collection_men);
		driver.findElement(Collection_men).click();
		utilities.MaximumWait(driver);
		driver.findElement(Live_collection).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Click_on_the_State_selection_details() throws Throwable {
		utilities.webDriverWait(driver, State_selection);
		driver.findElement(State_selection).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_sel_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_sel_two).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);


	}

	public void check_with_the_Click_on_the_Select_collection_center_details() throws Throwable {
		utilities.webDriverWait(driver, Select_collection_cen);
		driver.findElement(Select_collection_cen).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_coll_option_one).click();
		utilities.MaximumWait(driver);
        driver.findElement(Select_coll_option_two).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_From_date_input_selection_input_details() throws Throwable {
		utilities.webDriverWait(driver, From_Date_sel);
		driver.findElement(From_Date_sel).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_Date_sel).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(From_date_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_Date_sel).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_Date_sel).sendKeys("01/01/2022");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Search_button_resutls() throws Throwable {
		utilities.webDriverWait(driver, Search_click);
		driver.findElement(Search_click).click();
		utilities.MinimumWait(driver);
	}
	public void check_with_the_Total_Collection_details() throws Throwable {
		utilities.webDriverWait(driver, total_collection_ip);
		driver.findElement(total_collection_ip).click();
		utilities.MinimumWait(driver);
		WebElement message = driver.findElement(total_collection_ip);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	}



}
