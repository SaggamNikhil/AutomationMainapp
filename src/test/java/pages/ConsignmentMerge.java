package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ConsignmentMerge extends DriverFactory {
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Dashboard_name          = By.xpath("//section[@class='content-header']");
	By Collection_men          = By.xpath("//span[text()='Collection']");
	By Consignment_merge_page  = By.xpath("//a[@href='#/consMerge']");
	By Status_type_selection   = By.xpath("//md-select[@ng-model='request.StatusTypeId']");
	By Select_collection_cen   = By.xpath("//md-select[@ng-model='request.Code']");
	By Select_Collec_option    = By.xpath("(//div[text()='AGRI-CC-AP-WG-Ayyavaram - Ayyavaram'])[1]");
	By From_date_select        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_toasts        = By.xpath("//div[text()='The entered value is not a date!']");
	By Vehicle_number_input    = By.xpath("(//input[@name='VehicleNumber'])[1]");
	By Vehicle_toast           = By.xpath("//div[@ng-messages='rowForm.VehicleNumber.$error']");
	By Search_button_click     = By.xpath("//button[@ng-click='getReport(request)']");
	By Select_Checkbox_sel     = By.xpath("(//md-checkbox[@id='selectcol'])[1]");
	By Select_Checkbox_sel_t   = By.xpath("(//md-checkbox[@id='selectcol'])[2]");
	By total_value             = By.xpath("//div[@ng-show='reportTableParams.data.length>0']");
	By Merge_button            = By.xpath("//button[@ng-click='onSelectmerged(row)']");
    

	

	public void User_is_on_login_page_navgations() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
		
	}

	public void The_User_enters_with_the_username_and_passwords_details() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}

	public void Clicks_on_the_logins_button_from_login_details_page() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigate_to_the_Dashboards_home_menu() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dashboard_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}

	public void Dashboard_menu_click_on_the_Consignment_Merge_screen() throws Throwable {
		utilities.webDriverWait(driver, Collection_men);
		driver.findElement(Collection_men).click();
		utilities.MaximumWait(driver);
		driver.findElement(Consignment_merge_page).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Active_grid_Status_type_Dropdown_selection_field() throws Throwable {
		utilities.webDriverWait(driver, Status_type_selection);
		driver.findElement(Status_type_selection).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Active_grid_Select_collection_center_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Select_collection_cen);
		driver.findElement(Select_collection_cen).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_Collec_option).click();
		utilities.MaximumWait(driver);
	}

	public void verify_with_the_From_date_input_selection_details() throws Throwable {
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

	public void check_with_the_Vehicle_number_input_details_validation() throws Throwable {
		utilities.webDriverWait(driver, Vehicle_number_input);
		driver.findElement(Vehicle_number_input).click();
		utilities.MaximumWait(driver);
		driver.findElement(Vehicle_number_input).sendKeys("AP07Z3456");
		utilities.MaximumWait(driver);
		driver.findElement(Vehicle_number_input).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Vehicle_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Vehicle_number_input).sendKeys("AP07Z3456");
		utilities.MaximumWait(driver);


	}

	public void click_on_the_search_details_button() throws Throwable {
		utilities.webDriverWait(driver, Search_button_click);
		driver.findElement(Search_button_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Checkbox_selection_from_the_Active_grid() throws Throwable {
		utilities.webDriverWait(driver, Select_Checkbox_sel);
		driver.findElement(Select_Checkbox_sel).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_Checkbox_sel_t).click();
		utilities.MaximumWait(driver);
		driver.findElement(total_value).click();
		WebElement message = driver.findElement(total_value);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.MaximumWait(driver);


	}

	public void Click_on_the_Merge_action_button() throws Throwable {
		utilities.webDriverWait(driver, Merge_button);
		driver.findElement(Merge_button).click();
		utilities.MaximumWait(driver);
	}

}
