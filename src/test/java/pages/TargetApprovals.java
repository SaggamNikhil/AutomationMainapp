package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class TargetApprovals extends DriverFactory{
	Utilities utilities                 = new Utilities();
	By username                         = By.xpath("//input[@type='text']");
	By password                         = By.xpath("//input[@type='password']");
	By Login                            = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard                        = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat                   = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module                  = By.xpath("//span[text()='Settings']");
	By KRA_menu_click                   = By.xpath("(//i[@class='fa fa-user']/../span)[3]");
	By Target_approval_nav              = By.xpath("//a[@href='#/approval']");
	By manager_selection_click          = By.xpath("//md-select[@data-ng-model='SetTarget.Geo']");
	By Select_manager_opt_one           = By.xpath("//div[text()='L1 Manager']");
	By Select_Employee_user             = By.xpath("//md-select[@data-ng-model='SetTarget.empid']");
	By Select_user_option               = By.xpath("//div[text()='Supraja Y']");
	By Search_action_click              = By.xpath("//button[@ng-click='itemSelectedChange(SetTarget)']");
	By Clear_action_click               = By.xpath("//button[@ng-click='clear()']");
	By without_manager_sel              = By.xpath("//div[@ng-messages='rowForm.Geo.$error']");
	By Select_manager_opt_two           = By.xpath("//div[text()='L2 Manager']");
	
 
	public void User_is_login_page_of_the_oilpalm_project_screens() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.MaximumWait(driver);
	}

	public void The_Users_enters_with_the_a_username_and_password_inputs_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigate_to_the_Dashboards_Main_menu_details_screens() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void verify_with_the_click_on_the_Settings_modules_nav_menu() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(KRA_menu_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_navigated_to_the_target_Approvals_screen() throws Throwable {
		utilities.webDriverWait(driver, Target_approval_nav);
		driver.findElement(Target_approval_nav).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Manager_selection_Dropdown_input_details() throws Throwable {
		utilities.webDriverWait(driver, manager_selection_click);
		driver.findElement(manager_selection_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_manager_opt_one).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_user_Drodown_field_details() throws Throwable {
		utilities.webDriverWait(driver, Select_Employee_user);
		driver.findElement(Select_Employee_user).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_user_option).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_clicking_on_the_Search_action_button_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, Search_action_click);
		driver.findElement(Search_action_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Clicking_on_the_clear_action_button_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, Clear_action_click);
		driver.findElement(Clear_action_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_select_Manager_as_L2_manager_details() throws Throwable {
		utilities.webDriverWait(driver, without_manager_sel);
		WebElement message = driver.findElement(without_manager_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(manager_selection_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_manager_opt_two).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_select_user_for_L2_manager_details() throws Throwable {
		utilities.webDriverWait(driver, Select_Employee_user);
		driver.findElement(Select_Employee_user).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_user_option).click();
		utilities.MaximumWait(driver);
		driver.findElement(Search_action_click).click();
		utilities.MaximumWait(driver);
	}

}
