package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ManageRole extends DriverFactory {
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
 	By password                = By.xpath("//input[@type='password']");
 	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
 	By Dashboard               = By.xpath("//section[@class='content-header']");
 	By sidebar_Navgat          = By.xpath("//a[@class='sidebar-toggle']");
 	By settings_module         = By.xpath("//span[text()='Settings']");
 	By Role_menu_click         = By.xpath("//span[text()='User']");
 	By Manage_role             = By.xpath("//a[@href='#/role']");
 	By Add_new_role            = By.xpath("//button[@ng-click='addNewRole()']");
 	By Name_input              = By.xpath("//input[@ng-model='addForm.Name']");
 	By Name_toast_msg          = By.xpath("//div[@ng-messages='rowForm.Name.$error']");
 	By Select_report_type      = By.xpath("//md-select[@ng-model='addForm.ParentRoleId']");
 	By Report_role_type        = By.xpath("//div[text()='Admin(AN)Select']");
 	By Code_input              = By.xpath("//input[@ng-model='addForm.Code']");
 	By Code_ip_toast           = By.xpath("//div[@ng-messages='rowForm.Code.$error']");
 	By Description_ip          = By.xpath("//input[@ng-model='addForm.Desc']");
 	By Description_toasts      = By.xpath("//div[@ng-messages='rowForm.Desc.$error']");
 	By Select_activity         = By.xpath("//md-select[@name='activityrightIds']");
 	By select_activity_option  = By.xpath("//span[text()='Select All']");
 	By save_click              = By.xpath("//button[@ng-click='addNewRole(addForm)']");
 	By View_role_hierarchy     = By.xpath("//button[@ng-click='viewRoleHierachy()']");
 	By Role_list_details       = By.xpath("//li[@data-ng-repeat='node in roleList']");
 	By hierarchy_pop_close     = By.xpath("(//button[@ng-click='cancel()'])[2]");
 	By Enable_filter           = By.xpath("(//button[@ng-click='toggleFilter()'])[2]");
 	By Filter_by_name          = By.xpath("(//input[@ng-model='params.filter()[name]'])[2]");
 	By Edit_action             = By.xpath("(//button[@ng-click='editRole(row)'])[1]");
 	By Check_box_selection     = By.xpath("(//span[text()='Active'])[2]");
 	By Update_details          = By.xpath("//button[@ng-click='updateRole(role)']");
 	
	

	public void User_is_on_login_page_screen_of_oilpalm_project() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		utilities.MaximumWait(driver);

	}


	public void The_User_enter_with_the_valid_username_and_password_input_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
		
	}


	public void the_page_will_be_Navigated_to_the_Dashboards_home_menu_page_details() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);	
	}


	public void check_with_the_click_on_the_Settings_module() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);	
	}


	public void check_with_click_on_the_Role_screen_module_name() throws Throwable {
		utilities.webDriverWait(driver, Role_menu_click);
		driver.findElement(Role_menu_click).click();
		utilities.MinimumWait(driver);	
		driver.findElement(Manage_role).click();
		utilities.MaximumWait(driver);	

	}


	public void check_with_Click_on_the_Add_Role_action_button() throws Throwable {
		utilities.webDriverWait(driver, Add_new_role);
		driver.findElement(Add_new_role).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_click_on_the_Name_input_field() throws Throwable {
		utilities.webDriverWait(driver, Name_input);
		driver.findElement(Name_input).sendKeys("Admin ceo");
		utilities.MaximumWait(driver);
		driver.findElement(Name_input).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Name_toast_msg);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Name_input).sendKeys("Admin Management");
		utilities.MaximumWait(driver);
		

	}


	public void check_with_the_Select_Reported_role_from_the_Add_new_role_popup_screen() throws Throwable {
		utilities.webDriverWait(driver, Select_report_type);
		driver.findElement(Select_report_type).click();
		utilities.MaximumWait(driver);
		driver.findElement(Report_role_type).click();
		utilities.MaximumWait(driver);

	}


	public void check_with_the_code_input_details() throws Throwable {
		utilities.webDriverWait(driver, Code_input);
		driver.findElement(Code_input).sendKeys("Emp1");
		utilities.MaximumWait(driver);
		driver.findElement(Code_input).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Code_ip_toast);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
        driver.findElement(Code_input).sendKeys("Employee1");
		utilities.MaximumWait(driver);

        
		
	}


	public void check_with_the_Description_input_details() throws Throwable {
		utilities.webDriverWait(driver, Description_ip);
		driver.findElement(Description_ip).sendKeys("added");
		utilities.MaximumWait(driver);
		driver.findElement(Description_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Description_toasts);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Description_ip).sendKeys("admin added new");
		utilities.MaximumWait(driver);


	}


	public void check_with_the_Select_activity_right_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Select_activity);
		driver.findElement(Select_activity).click();
		utilities.MaximumWait(driver);
		driver.findElement(select_activity_option).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
		
	}


	public void check_with_the_Clicking_on_the_save_action_button() throws Throwable {
		utilities.webDriverWait(driver, save_click);
		driver.findElement(save_click).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_View_role_Hierarchy_details() throws Throwable {
		utilities.webDriverWait(driver, View_role_hierarchy);
		driver.findElement(View_role_hierarchy).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Role_list_details);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(hierarchy_pop_close).click();
		utilities.MaximumWait(driver);
		
	}


	public void check_with_the_Enable_filter_button() throws Throwable {
		utilities.webDriverWait(driver, Enable_filter);
		driver.findElement(Enable_filter).click();
		utilities.MaximumWait(driver);
		driver.findElement(Filter_by_name).sendKeys("Admin new");
		utilities.MaximumWait(driver);
		

	}


	public void check_with_the_Edit_action_details() throws Throwable {
		utilities.webDriverWait(driver, Edit_action);
		driver.findElement(Edit_action).click();
		utilities.MaximumWait(driver);
		driver.findElement(Check_box_selection).click();
		utilities.MaximumWait(driver);
		driver.findElement(Update_details).click();
		utilities.MaximumWait(driver);


	}

}
