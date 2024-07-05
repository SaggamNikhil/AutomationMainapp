package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class CcfarmerCollectionReport extends DriverFactory{
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Dashboard_name          = By.xpath("//section[@class='content-header']");
	By Collection_men          = By.xpath("//span[text()='Collection']");
	By Cc_farmer_coll_click    = By.xpath("//a[@href='#/ccCollReport']");
	By Select_loca_grid        = By.xpath("(//md-select[@name='GeoLocations'])[1]");
	By Select_verification     = By.xpath("(//md-select[@name='GeoLocations'])[2]");
	By State_sel_c             = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By State_opt_sel_one       = By.xpath("//div[text()='AP - Andhra Pradesh']");
	By State_opt_sel_two       = By.xpath("//div[text()='AR - Arunachal Pradesh']");
	By District_sel_c          = By.xpath("//md-select[@ng-change='onDistrictChange(GeoLocation.DistrictIds)']");
	By District_toast          = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Select_District_one     = By.xpath("//div[text()='EG - EAST GODAVARI']");
	By Select_ditrict_two      = By.xpath("//div[text()='EU - Eluru']");
	By Mandal_sel_grid_c       = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandal_toast            = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mandal_sel_one          = By.xpath("(//div[text()='DA - Devarapalli-II'])[1]");
	By Mandal_sel_two          = By.xpath("//div[text()='BD - Bhimadole']");  
	By Village_sel_grid_c      = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_toast           = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By village_sel_one         = By.xpath("//div[text()='AB - Amberpeta']");
	By village_sel_two         = By.xpath("//div[text()='YG - Yernagudem']");
	By From_date_sele          = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_toasts        = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_bt_click         = By.xpath("//button[@ng-click='getReport(request)']");
	By Select_all_checkbox     = By.xpath("//md-checkbox[@ng-model='selectall']");
	By Scroll_right_click      = By.xpath("//button[@onclick='scrollRight()']");
	By verify_checkbox_sel     = By.xpath("(//md-checkbox[@id='selectcol'])[1]");
	By Edit_action_click       = By.xpath("(//button[@ng-click='EditCollection(row)'])[2]");	
	By Confirm_update          = By.xpath("//span[text()='Update']");
	By Cancel_click            = By.xpath("//button[@aria-label='Cancelled']");
	By View_receipt            = By.xpath("(//button[@aria-label='View Receipt'])[5]");

	
	
	
	
	
	public void User_is_on_login_page_navgat() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}


	public void User_enters_with_the_username_and_password_details() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}


	public void Clicks_on_the_login_button_from_login_pag() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
		
	}


	public void Navigate_to_the_Dashboard_home_pag() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Dashboard_name);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);

	}


	public void check_with_the_CC_Farmer_Collection_report_navigation_menu() throws Throwable {
		utilities.webDriverWait(driver, Collection_men);
		driver.findElement(Collection_men).click();
		utilities.MaximumWait(driver);
		driver.findElement(Cc_farmer_coll_click).click();
		utilities.MaximumWait(driver);

		
	}


	public void check_with_the_Select_Location_type_From_the_active_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Select_loca_grid);
		driver.findElement(Select_loca_grid).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}


	public void Verify_with_the_Select_Verification_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, Select_verification);
		driver.findElement(Select_verification).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_States_From_the_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, State_sel_c);
		driver.findElement(State_sel_c).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_opt_sel_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_opt_sel_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_Districts_from_the_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, District_sel_c);
		driver.findElement(District_sel_c).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(District_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(District_sel_c).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_District_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_ditrict_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);		
	}


	public void check_with_the_Select_Mandals_from_the_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_grid_c);
		driver.findElement(Mandal_sel_grid_c).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Mandal_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_sel_grid_c).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_sel_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_sel_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_Villages_from_the_Dropdown_input_field() throws Throwable {
		utilities.webDriverWait(driver, Village_sel_grid_c);
		driver.findElement(Village_sel_grid_c).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Village_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Village_sel_grid_c).click();
		utilities.MaximumWait(driver);
		driver.findElement(village_sel_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(village_sel_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_From_date_input_details() throws Throwable {
		utilities.webDriverWait(driver, From_date_sele);
		driver.findElement(From_date_sele).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_sele).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_toasts);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_sele).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_sele).sendKeys("01/01/2022");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Click_on_the_Search_action_button() throws Throwable {
		utilities.webDriverWait(driver, Search_bt_click);
		driver.findElement(Search_bt_click).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_All_checkbox_selection_input() throws Throwable {
		 utilities.webDriverWait(driver, Select_all_checkbox);
		    WebElement checkbox = driver.findElement(Select_all_checkbox);
		    if (checkbox.getAttribute("aria-checked").equals("true")) {
		        checkbox.click();
		        utilities.MinimumWait(driver);
		    }
		    driver.findElement(Scroll_right_click).click();
			utilities.MaximumWait(driver);
        }


	public void check_with_the_Select_Collection_verification_details() throws Throwable {
		utilities.webDriverWait(driver, verify_checkbox_sel);
		driver.findElement(verify_checkbox_sel).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_click_on_the_Edit_action_button() throws Throwable {
		utilities.webDriverWait(driver, Edit_action_click);
		driver.findElement(Edit_action_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Confirm_update).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_clicking_on_the_cancel_action_buttons() throws Throwable {
		utilities.webDriverWait(driver, Cancel_click);
		driver.findElement(Cancel_click).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_click_on_the_View_Receipt_action_details() throws Throwable {
		utilities.webDriverWait(driver, View_receipt);
		driver.findElement(View_receipt).click();
		utilities.MaximumWait(driver);
	}
	}

