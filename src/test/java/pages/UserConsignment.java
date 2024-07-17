package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	By Role_dropdown_click = By.xpath("//md-select[@ng-model='objconsignment.RoleId']");
	By Role_toast          = By.xpath("//div[@ng-messages='addForm.RoleId.$error']");
	By Role_select         = By.xpath("(//div[@class='md-text ng-binding'])[19]");
	By User_drop_down      = By.xpath("//md-select[@ng-model='objconsignment.EmployeeId']");
	By User_toast          = By.xpath("//div[@ng-messages='addForm.userId.$error']");
	By Nursery_code        = By.xpath("//md-select[@name='nurserys']");
	By Nursery_toast       = By.xpath("//div[@ng-messages='addForm.nurserys.$error']");
	By Nursery_option_sel  = By.xpath("//div[text()='NurAPDub']");
	By Nursery_option_two  = By.xpath("//div[text()='NurCKBag']");
	By Consignment_click   = By.xpath("//md-select[@ng-model='objconsignment.consignmentsIds']");
	By Consignment_toast   = By.xpath("//div[@ng-messages='addForm.consignments.$error']");
	By Consignment_option  = By.xpath("(//span[text()='Select All'])[2]");
	By Save_click          = By.xpath("//button[@ng-click='addconsignment()']");
	By edit_button_click   = By.xpath("(//button[@ng-click='editConsignments(row)'])[1]");
	By Consignment_edit    = By.xpath("//md-select[@ng-model='consignment.consignmentsByUserId']");
    By Consignment_update  = By.xpath("(//div[text()='AP/DUB/IMP/ASD-Spring-Themba/Jan-21/C-09'])[2]");	
    By Click_update_btn    = By.xpath("//button[@ng-click='updateconsignment()']");        
	
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

	public void check_with_the_Role_selection_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Role_dropdown_click);
		driver.findElement(Role_dropdown_click).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Role_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Role_dropdown_click).click();
		utilities.MaximumWait(driver);
		Robot k = new Robot();
	    k.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);


	}

	public void check_with_the_user_selection_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, User_drop_down);
		driver.findElement(User_drop_down).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(User_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(User_drop_down).click();
		utilities.MaximumWait(driver);
		Robot k = new Robot();
	    k.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Nursery_code_selection_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Nursery_code);
		driver.findElement(Nursery_code).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Nursery_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Nursery_code).click();
		utilities.MaximumWait(driver);
		driver.findElement(Nursery_option_sel).click();
		utilities.MinimumWait(driver);
        driver.findElement(Nursery_option_two).click();
		utilities.MaximumWait(driver);
		Robot j = new Robot();
	    j.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Consignment_code_from_the_Dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Consignment_click);
		driver.findElement(Consignment_click).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
	    i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Consignment_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
        driver.findElement(Consignment_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Consignment_option).click();
		Robot j = new Robot();
	    j.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);     
	}

	public void the_popup_screen_clicking_on_the_Save_action_button() throws Throwable {
		utilities.webDriverWait(driver, Save_click);
		driver.findElement(Save_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Active_grid_by_clicking_on_the_edit_button() throws Throwable {
		utilities.webDriverWait(driver, edit_button_click);
		driver.findElement(edit_button_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Consignment_edit).click();
		utilities.MaximumWait(driver);
		driver.findElement(Consignment_update).click();
		Robot j = new Robot();
	    j.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		driver.findElement(Click_update_btn).click();
		utilities.MaximumWait(driver);


	}

}
