package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class CollectionReport extends DriverFactory{
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
	By password                = By.xpath("//input[@type='password']");
	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                 = By.xpath("//a[@class='sidebar-toggle']");
	By Collection_menu         = By.xpath("//span[text()='Collection']");
	By Collection_report_m 	   = By.xpath("//a[@href='#/collReport']");
	By Select_loca_grid        = By.xpath("(//md-select[@name='GeoLocations'])[1]");
	By Select_verify_sel       = By.xpath("(//md-select[@name='GeoLocations'])[2]");
	By State_sel               = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By State_opt_sel_one       = By.xpath("//div[text()='AP - Andhra Pradesh']");
	By State_opt_sel_two       = By.xpath("//div[text()='AR - Arunachal Pradesh']");
	By District_sel            = By.xpath("//md-select[@ng-change='onDistrictChange(GeoLocation.DistrictIds)']");
	By District_toast          = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Select_District_one     = By.xpath("//div[text()='EG - EAST GODAVARI']");
	By Select_ditrict_two      = By.xpath("//div[text()='EU - Eluru']");
	By Mandal_sel_grid        = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandal_toast           = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mandal_sel_one         = By.xpath("(//div[text()='DA - Devarapalli-II'])[1]");
	By Mandal_sel_two         = By.xpath("//div[text()='BD - Bhimadole']");  
	By Village_sel_grid       = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_toast          = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By village_sel_one        = By.xpath("//div[text()='AB - Amberpeta']");
	By village_sel_two        = By.xpath("//div[text()='YG - Yernagudem']");
	By Select_collection_cen  = By.xpath("(//div[@class='md-container md-ink-ripple'])[8]");
	By From_date_selec        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_toasts       = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_bt_click        = By.xpath("//button[@ng-click='getReport(request)']");
	By Select_all_checkbox    = By.xpath("//md-checkbox[@ng-model='selectall']");
	By Scroll_right_click     = By.xpath("//button[@onclick='scrollRight()']");
	By verify_checkbox_sel    = By.xpath("(//md-checkbox[@id='selectcol'])[1]");
	By Edit_action_click      = By.xpath("(//button[@ng-click='EditCollection(row)'])[2]");	
	By Confirm_update         = By.xpath("//span[text()='Update']");
	By Cancel_click           = By.xpath("//button[@aria-label='Cancelled']");
	
	
	public void User_is_on_login_page_navga() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}

	public void User_enters_with_the_username_and_password() throws Throwable {
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.MinimumWait(driver);
	}

	public void Clicks_on_the_login_button_from_login_screen() throws Throwable {
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void Navigate_to_the_Dashboard_home_screens() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Collection_report_navigation_menu() throws Throwable {
		utilities.webDriverWait(driver, Collection_menu);
		driver.findElement(Collection_menu).click();
		utilities.MaximumWait(driver);
		driver.findElement(Collection_report_m).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Select_Location_type_input_details() throws Throwable {
		utilities.webDriverWait(driver, Select_loca_grid);
		driver.findElement(Select_loca_grid).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Verification_type_input_details() throws Throwable {
		utilities.webDriverWait(driver, Select_verify_sel);
		driver.findElement(Select_verify_sel).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_DOWN);
		utilities.MaximumWait(driver);
		r.keyPress(KeyEvent.VK_ENTER);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_State_selection_fron_the_Active_grid_details() throws Throwable {
		utilities.webDriverWait(driver, State_sel);
		driver.findElement(State_sel).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_opt_sel_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_opt_sel_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_District_selection_from_the_Active_grid_details() throws Throwable {
		utilities.webDriverWait(driver, District_sel);
		driver.findElement(District_sel).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(District_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(District_sel).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_District_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_ditrict_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Mandal_selection_from_the_Active_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Mandal_sel_grid);
		driver.findElement(Mandal_sel_grid).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Mandal_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_sel_grid).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_sel_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mandal_sel_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Villages_selection_from_the_Active_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Village_sel_grid);
		driver.findElement(Village_sel_grid).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Village_toast);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Village_sel_grid).click();
		utilities.MaximumWait(driver);
		driver.findElement(village_sel_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(village_sel_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}



//	public void check_with_the_Select_Collection_center_from_the_Dropdown_field() throws Throwable {
//		utilities.webDriverWait(driver, Select_collection_cen);
//		driver.findElement(Select_collection_cen).click();
//		utilities.MaximumWait(driver);
//	}
	public void check_with_the_From_date_input_selection_validation() throws Throwable {
		utilities.webDriverWait(driver, From_date_selec);
		driver.findElement(From_date_selec).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selec).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_toasts);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selec).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_selec).sendKeys("01/01/2022");
		utilities.MaximumWait(driver);
	}

	public void check_with_the_click_on_the_Search_button_details() throws Throwable {
		utilities.webDriverWait(driver, Search_bt_click);
		driver.findElement(Search_bt_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_all_checkbox_input_selection() throws Throwable {
		 utilities.webDriverWait(driver, Select_all_checkbox);
		    WebElement checkbox = driver.findElement(Select_all_checkbox);
           // Check if the checkbox is selected
		    if (checkbox.getAttribute("aria-checked").equals("true")) {
		        // Uncheck the checkbox
		        checkbox.click();
		        utilities.MinimumWait(driver);
		    }
		    driver.findElement(Scroll_right_click).click();
			utilities.MaximumWait(driver);
           }

	public void check_with_the_selected_Collection_details_verification_details() throws Throwable {
		utilities.webDriverWait(driver, verify_checkbox_sel);
		driver.findElement(verify_checkbox_sel).click();
		utilities.MaximumWait(driver);
	}

	public void click_on_the_Edit_action_button_details() throws Throwable {
		utilities.webDriverWait(driver, Edit_action_click);
		driver.findElement(Edit_action_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Confirm_update).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_clicking_on_the_Cancelled_action_button() throws Throwable {
		utilities.webDriverWait(driver, Cancel_click);
		driver.findElement(Cancel_click).click();
		utilities.MaximumWait(driver);
	}
	
   }
