package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ConsignmentReport extends DriverFactory {
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Dashboard_name          = By.xpath("//section[@class='content-header']");
	By Collection_men          = By.xpath("//span[text()='Collection']");
	By Consignment_report      = By.xpath("//a[@href='#/consReport']");
	By Type_click              = By.xpath("//md-select[@ng-model='request.Type']");
	By Select_Status_type      = By.xpath("//md-select[@ng-model='request.StatusTypeId']");
	By Select_collection_cen   = By.xpath("//md-select[@ng-model='request.Code']");
	By Select_Collec_option    = By.xpath("(//div[text()='AGRI-CC-AP-WG-Ayyavaram - Ayyavaram'])[1]");
	By From_date_select        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_toasts        = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_button_click     = By.xpath("//button[@ng-click='getReport(request)']");
	By View_Receipt_button     = By.xpath("(//button[@ng-click='viewReceipt(row)'])[1]");

	public void User_is_on_login_page_navgati() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}

	public void User_enters_with_the_username_and_passwords_details() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}

	public void Clicks_on_the_logins_button_from_login_pag() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void Navigate_to_the_Dashboards_home_pag() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dashboard_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}

	public void click_on_the_Consignment_Report_screen() throws Throwable {
		utilities.webDriverWait(driver, Collection_men);
		driver.findElement(Collection_men).click();
		utilities.MaximumWait(driver);
		driver.findElement(Consignment_report).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_active_grid_Type_dropdown_selection() throws Throwable {
		utilities.webDriverWait(driver, Type_click);
		driver.findElement(Type_click).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
	    r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Select_Status_Type_from_the_Dropdown_selection_field() throws Throwable {
		utilities.webDriverWait(driver, Select_Status_type);
		driver.findElement(Select_Status_type).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Select_Collection_center_from_the_Dropdown_Field() throws Throwable {
		utilities.webDriverWait(driver, Select_collection_cen);
		driver.findElement(Select_collection_cen).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_Collec_option).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Validate_with_the_From_date_input_selection() throws Throwable {
		utilities.webDriverWait(driver, From_date_select);
		driver.findElement(From_date_select).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_select).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_toasts);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_select).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_select).sendKeys("01/01/2022");
		utilities.MaximumWait(driver);
	}

	public void verify_with_the_Clicking_on_the_Search_button_result_details() throws Throwable {
		utilities.webDriverWait(driver, Search_button_click);
		driver.findElement(Search_button_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_View_Receipt_button_click() throws Throwable {
		utilities.webDriverWait(driver, View_Receipt_button);
		driver.findElement(View_Receipt_button).click();
		utilities.MaximumWait(driver);
	}



}
