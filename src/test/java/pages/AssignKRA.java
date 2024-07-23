package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class AssignKRA extends DriverFactory {
	Utilities utilities    = new Utilities();
	By username            = By.xpath("//input[@type='text']");
	By password            = By.xpath("//input[@type='password']");
	By Login               = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By Dashboard           = By.xpath("//section[@class='content-header']");
	By sidebar_Navgat      = By.xpath("//a[@class='sidebar-toggle']");
	By settings_module     = By.xpath("//span[text()='Settings']");
	By KRA_menu_click      = By.xpath("(//i[@class='fa fa-user']/../span)[3]");
	By Assign_kra_menu     = By.xpath("//a[@href='#/assignkra']");
	By Assign_kra_btn      = By.xpath("//button[@ng-click='assignkra()']");
	By Financial_yr_sel    = By.xpath("//md-select[@ng-model='AssignKRA.FinancialYear']");
	By With_out_finan_sel  = By.xpath("//div[@ng-messages='rowForm.FinancialYear.$error']");
	By Select_Finan_yr_opt = By.xpath("(//md-option[@value='2024-2025'])[2]");
    By Select_office_type  = By.xpath("//md-select[@name='OfficeTypeId']");
    By Side_click          = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
    By Without_sel_off_ip  = By.xpath("//div[@ng-messages='rowForm.OfficeTypeId.$error']");
    By Select_off_opt      = By.xpath("//md-option[text()='Head Office']");
    By Select_role         = By.xpath("//md-select[@ng-model='AssignKRA.RoleIds']");
    By Without_sel_role    = By.xpath("//div[@ng-messages='rowForm.RoleIds.$error']");
    By Sel_role_option     = By.xpath("(//md-option[@value='22'])[2]");
    By Select_Kra_field    = By.xpath("//md-select[@name='KraId']");
    By Without_kra_field   = By.xpath("//div[@ng-messages='rowForm.KraId.$error']");
    By Select_kra_opt      = By.xpath("//div[text()='Area Expansion- Palm Area']");
    By Select_department   = By.xpath("//md-select[@ng-model='AssignKRA.DepartmentTypeId']");
    By Without_sel_depart  = By.xpath("//div[@ng-messages='rowForm.DepartmentTypeId.$error']");
    By Select_department_f = By.xpath("//div[text()='Admin ']");
    By Select_department_s = By.xpath("//div[text()='Agriculture ']");
    By Select_department_t = By.xpath("//div[text()='Finance&accounts ']");
    By Weightage_click     = By.xpath("//input[@ng-model='row.Weightage']");
    By Save_click          = By.xpath("//button[@ng-click='assignkraByGeoLocation(AssignKRA,tempdata)']");
    By Capture_toast       = By.xpath("//div[text()='Weightage should be greater than  0 and Sum of Weightage should be 100%']");
    By Edit_kra_click      = By.xpath("//button[@ng-click='updateassignkra()']");
    By Update_save         = By.xpath("//button[@ng-click='UpdateassignKRA(AssignKRA,tempdata)']");
    
    
	
	public void User_is_on_oilpalm_project_page_login_screen() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.MaximumWait(driver);
	}

	public void The_Users_enters_with_the_valid_inputs_for_username_and_password_details() throws Throwable {
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_be_Navigated_to_the_Dashboards_menu_details_screen() throws Throwable {
		utilities.webDriverWait(driver, Dashboard);
		WebElement message = driver.findElement(Dashboard);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);
	}

	public void verify_with_the_click_on_the_Settings_module_navgation_menu() throws Throwable {
		utilities.webDriverWait(driver, settings_module);
		driver.findElement(settings_module).click();
		utilities.MaximumWait(driver);
		driver.findElement(KRA_menu_click).click();
		utilities.MaximumWait(driver);
	}

	public void Then_check_with_the_clicking_on_the_Assign_KRA_navigation_menu() throws Throwable {
		utilities.webDriverWait(driver, Assign_kra_menu);
		driver.findElement(Assign_kra_menu).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_Assign_KRA_action_button() throws Throwable {
		utilities.webDriverWait(driver, Assign_kra_btn);
		driver.findElement(Assign_kra_btn).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_financial_year_drodpown_field() throws Throwable {
		utilities.webDriverWait(driver, Financial_yr_sel);
		driver.findElement(Financial_yr_sel).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_finan_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Financial_yr_sel).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_Finan_yr_opt).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_select_office_type_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Select_office_type);
		driver.findElement(Select_office_type).click();
		utilities.MaximumWait(driver);
		driver.findElement(Side_click).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_sel_off_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Select_office_type).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_off_opt).click();
		utilities.MinimumWait(driver);

	}

	public void check_with_the_Select_role_type_from_the_dropdowm_field() throws Throwable {
		utilities.webDriverWait(driver, Select_role);
		driver.findElement(Select_role).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
		WebElement message = driver.findElement(Without_sel_role);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Select_role).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_role_option).click();
		Robot q = new Robot();
		q.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Select_KRA_type_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Select_Kra_field);
		driver.findElement(Select_Kra_field).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
		WebElement message = driver.findElement(Without_kra_field);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Select_Kra_field).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_kra_opt).click();
		utilities.MaximumWait(driver);
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Department_type_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Select_department);
		driver.findElement(Select_department).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
		WebElement message = driver.findElement(Without_sel_depart);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Select_department).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_department_f).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_department_s).click();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void Validate_with_the_Weightage_input_details() throws Throwable {
		utilities.webDriverWait(driver, Weightage_click);
		driver.findElement(Weightage_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Weightage_click).sendKeys("101");
		utilities.MaximumWait(driver);
		driver.findElement(Save_click).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Capture_toast);
		String actualMessage = message.getText();
		System.out.println("Toast message: " + actualMessage);
		utilities.MaximumLongWait(driver);
		driver.findElement(Weightage_click).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Weightage_click).sendKeys("100");
		utilities.MaximumWait(driver);
		driver.findElement(Save_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_active_grid_by_Clicking_on_the_Edit_KRA_button() throws Throwable {
		utilities.webDriverWait(driver, Edit_kra_click);
		driver.findElement(Edit_kra_click).click();
		utilities.MaximumWait(driver);
		
	}

	public void check_with_the_Update_assign_KRA_details() throws Throwable {
		utilities.webDriverWait(driver, Financial_yr_sel);
		driver.findElement(Financial_yr_sel).click();
		utilities.MaximumWait(driver);
		Robot i = new Robot();
		i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_finan_sel);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Financial_yr_sel).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_Finan_yr_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_office_type).click();
		utilities.MaximumWait(driver);
		driver.findElement(Side_click).click();
		utilities.MaximumWait(driver);
		WebElement message1 = driver.findElement(Without_sel_off_ip);
		String actualMessage1 = message1.getText();
		System.out.println("Validation message: " + actualMessage1);
		utilities.MaximumWait(driver);
		driver.findElement(Select_office_type).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_off_opt).click();
		utilities.MinimumWait(driver);	
		driver.findElement(Select_role).click();
		utilities.MaximumWait(driver);
		Robot i1 = new Robot();
		i1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
		WebElement message2 = driver.findElement(Without_sel_role);
		String actualMessage2 = message2.getText();
		System.out.println("Validation message: " + actualMessage2);
		utilities.MaximumWait(driver);
		driver.findElement(Select_role).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_role_option).click();
		Robot q = new Robot();
		q.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void update_with_the_Department_input_details() throws Throwable {
		utilities.webDriverWait(driver, Select_department);
		driver.findElement(Select_department).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_department_t).click();
		Robot i = new Robot();
        i.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_click_on_the_save_button_from_the_Update_assign_kra_screen() throws Throwable {
		utilities.webDriverWait(driver, Update_save);
		driver.findElement(Update_save).click();
		utilities.MinimumWait(driver);
	}
   
}
