package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Weighbridgedetails extends DriverFactory {
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Dashboard_name          = By.xpath("//section[@class='content-header']");
	By Collection_men          = By.xpath("//span[text()='Collection']");
	By Weighbridge_details     = By.xpath("//a[@href='#/wbDetails']");
	By Select_mill             = By.xpath("//md-select[@ng-model='request.CCCode']");
	By Select_mill_opt         = By.xpath("(//div[text()='MILL-AP-Yernagudem01 - Yernagudem'])[1]");
	By Select_Status           = By.xpath("//md-select[@ng-model='request.IsAllToken']");
	By From_Date_sel           = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By From_date_toast         = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_Action_button    = By.xpath("//button[@ng-click='getReport(request)']"); 
	By Weight_count_details    = By.xpath("//div[@ng-show='reportData.length>0']");
	By Print_token             = By.xpath("(//button[@ng-click='printToken(row)'])[1]");
	
	
	public void User_is_on_login_page_of_oilpalm_screen() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}


	public void The_User_enters_with_the_username_and_passwords_ip_data_details() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}


	public void Clicks_on_the_logins_button_from_the_login_details_screens() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}


	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_pages() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dashboard_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}


	public void Check_with_the_Clicking_on_the_Weighbridge_details_screen() throws Throwable {
		utilities.webDriverWait(driver, Collection_men);
		driver.findElement(Collection_men).click();
		utilities.MaximumWait(driver);
		driver.findElement(Weighbridge_details).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_Mill_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, Select_mill);
		driver.findElement(Select_mill).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_mill_opt).click();
		utilities.MaximumWait(driver);

	}


	public void check_with_the_Select_Status_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, Select_Status);
		driver.findElement(Select_Status).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_UP);
		utilities.MaximumWait(driver);
	    r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_From_Date_selection_ip_details() throws Throwable {
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


	public void Click_on_the_Search_actions_button_input_details() throws Throwable {
		utilities.webDriverWait(driver, Search_Action_button);
		driver.findElement(Search_Action_button).click();
		utilities.MaximumLongWait(driver);
	}


	public void check_with_the_In_progress_and_processed_weight_bridge_details_count() throws Throwable {
		utilities.webDriverWait(driver, Weight_count_details);
		driver.findElement(Weight_count_details).click();
		utilities.MaximumLongWait(driver);
		WebElement message = driver.findElement(Weight_count_details);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
	}


	public void check_with_the_click_on_the_Print_Token_details() throws Throwable {
		utilities.webDriverWait(driver, Print_token);
		driver.findElement(Print_token).click();
		utilities.MaximumLongWait(driver);
	}

}
