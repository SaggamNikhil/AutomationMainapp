package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class MillCollectionDetails extends DriverFactory {
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Dashboard_name          = By.xpath("//section[@class='content-header']");
	By Collection_men          = By.xpath("//span[text()='Collection']");
	By Mill_collection_menu    = By.xpath("//a[@href='#/millCollDetails']");
	By Select_mill_Dropdown    = By.xpath("//md-select[@ng-model='request.Code']");
	By Select_mill_option      = By.xpath("(//div[text()='MILL-AP-Yernagudem01 - Yernagudem'])[1]");  
	By From_date_select        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_toasts        = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_button_clk       = By.xpath("//button[@ng-click='getReport(request)']");
	By Total_collection_count  = By.xpath("//div[@ng-show='millCollData.length>0']");
	By View_print_button       = By.xpath("(//button[@ng-click='viewReceipt(row)'])[1]");

	public void User_is_on_login_page_screen() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}


	public void The_User_enters_with_the_username_and_passwords_input_details() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}


	public void Clicks_on_the_logins_button_from_the_login_details_page() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}


	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dashboard_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}


	public void Dashboard_menu_click_on_the_Mill_Collection_Details_screen() throws Throwable {
		utilities.webDriverWait(driver, Collection_men);
		driver.findElement(Collection_men).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mill_collection_menu).click();
		utilities.MaximumWait(driver);

	}


	public void verify_with_the_Active_grid_Select_mill_details() throws Throwable {
		utilities.webDriverWait(driver, Select_mill_Dropdown);
		driver.findElement(Select_mill_Dropdown).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_mill_option).click();
		utilities.MaximumWait(driver);

	}


	public void check_with_the_From_date_selection_input_details() throws Throwable {
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
		driver.findElement(From_date_select).sendKeys("01/02/2024");
		utilities.MaximumWait(driver);
	}


	public void verify_with_the_click_on_the_Search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_button_clk);
		driver.findElement(Search_button_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_collection_count).click();
		   WebElement message = driver.findElement(Total_collection_count);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			utilities.MaximumWait(driver);

	}


	public void check_with_the_View_Print_details() throws Throwable {
		utilities.webDriverWait(driver, View_print_button);
		driver.findElement(View_print_button).click();
		utilities.MaximumWait(driver);
	}
}


