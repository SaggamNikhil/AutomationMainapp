package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class UserConsignment extends DriverFactory{
	Utilities utilities        =   new Utilities();
	By username            = By.xpath("//input[@type='text']");
	By password            = By.xpath("//input[@type='password']");
	By Login               = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard           = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat      = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module     = By.xpath("//span[text()='Settings']");
	By User_menu           = By.xpath("//span[text()='User']");
	By User_consignment    = By.xpath("//a[@href='#/userConsignments']");
	By Assign_cons_click   = By.xpath("//button[@ng-click='addconsignments()']");
	
	
	public void User_is_on_login_page_of_oilpalm_project_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		utilities.MaximumWait(driver);
	}

	public void The_Users_enters_with_the_valid_username_and_password_inputs_data_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);	
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_home_main_menu_pages_screens() throws Throwable {
	utilities.webDriverWait(driver, Dashboard);
	WebElement message = driver.findElement(Dashboard);
	String actualMessage = message.getText();
	System.out.println("Validation message: " + actualMessage);
	utilities.MaximumWait(driver);
	utilities.webDriverWait(driver, sidebar_Navgat);
	driver.findElement(sidebar_Navgat).click();
	utilities.MinimumWait(driver);
	}

	public void verify_with_the_click_on_the_Settings_module() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(User_menu).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_User_consignment_screen() throws Throwable {
		utilities.webDriverWait(driver, User_consignment);
		driver.findElement(User_consignment).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Click_on_the_Assign_user_consignment_action_button() throws Throwable {
		utilities.webDriverWait(driver, Assign_cons_click);
		driver.findElement(Assign_cons_click).click();
		utilities.MaximumWait(driver);
	}

}
