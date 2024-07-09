package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ConsignmentTomill extends DriverFactory {
	Utilities utilities        =   new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Dashboard_name          = By.xpath("//section[@class='content-header']");
	By Collection_men          = By.xpath("//span[text()='Collection']");
	By Consignment_to_mill     = By.xpath("//a[@href='#/conToMill']");
	By Select_collection_cen   = By.xpath("//md-select[@ng-model='request.Code']");
	By Select_coll_option      = By.xpath("//div[text()='AGRI-CC-AP-WG-Ayyavaram - Ayyavaram']");
	By Fromdate_sel            = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By Fromdate_toasts         = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_button_result    = By.xpath("//button[@ng-click='getReport(request)']");
	By Total_details_input     = By.xpath("//div[@ng-show='reportTableParams.data.length>0']");
	By View_receipt            = By.xpath("(//button[@ng-click='viewReceipt(row)'])[1]");
	

	public void User_is_on_login_page_screen_of_oilpalm() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}

	public void The_User_enters_with_the_username_and_passwords_ip_details() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}

	public void Clicks_on_the_logins_button_from_the_login_details_screen() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_page() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dashboard_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	}

	public void Dashboard_menu_click_on_the_Consignment_to_mill_screen() throws Throwable {
		utilities.webDriverWait(driver, Collection_men);
		driver.findElement(Collection_men).click();
		utilities.MaximumWait(driver);
		driver.findElement(Consignment_to_mill).click();
		utilities.MaximumWait(driver);
	}

	public void Verify_with_the_Select_Collection_center_from_the_Drop_down_field() throws Throwable {
		utilities.webDriverWait(driver, Select_collection_cen);
		driver.findElement(Select_collection_cen).click();
		utilities.MaximumWait(driver);
        driver.findElement(Select_coll_option).click();
		utilities.MaximumWait(driver);

	}

	public void Verify_with_the_Select_From_date_input_details() throws Throwable {
		utilities.webDriverWait(driver, Fromdate_sel);
		driver.findElement(Fromdate_sel).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Fromdate_sel).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Fromdate_toasts);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(Fromdate_sel).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Fromdate_sel).sendKeys("01/01/2022");
		utilities.MaximumWait(driver);		
	}

	public void Verify_with_the_Search_button_criteria_results() throws Throwable {
		utilities.webDriverWait(driver, Search_button_result);
		driver.findElement(Search_button_result).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_All_details_input_count_details() throws Throwable {
		utilities.webDriverWait(driver, Total_details_input);
		driver.findElement(Total_details_input).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Total_details_input);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
	}

	public void check_with_the_clicking_on_the_View_Receipt_details() throws Throwable {
		utilities.webDriverWait(driver, View_receipt);
		driver.findElement(View_receipt).click();
		utilities.MaximumWait(driver);
	}

}
