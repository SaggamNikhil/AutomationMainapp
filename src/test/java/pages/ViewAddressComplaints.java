package pages;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class ViewAddressComplaints extends DriverFactory {
	Utilities utilities        = new Utilities();
	
	By username                = By.xpath("//input[@type='text']");
 	By password                = By.xpath("//input[@type='password']");
 	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
 	By sidebar_Navgat          = By.xpath("//a[@class='sidebar-toggle']");
 	By Crop_maintenance_click  = By.xpath("//span[text()='Crop Maintenance']");
 	By View_add_complaints     = By.xpath("//a[@href='#/viewComplaints']");
 	By Status_select_click     = By.xpath("//md-select[@ng-model='request.StatusTypeId']");
 	By Status_select_opt       = By.xpath("//div[text()='Close']");
 	By From_date_select        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
 	By From_date_toast_m       = By.xpath("//div[text()='The entered value is not a date!']");
 	By Search_btn_click        = By.xpath("//button[@ng-click='getReport(request)']"); 
 	By Complaint_type          = By.xpath("//md-select[@ng-model='request.ComplaintTypeId']");
 	By Complaint_type_option   = By.xpath("//div[text()='Fertilizer Related']");
 	By View_image_click        = By.xpath("(//button[@ng-click='GetImages(row);'])[1]");
 	By View_img_window_close   = By.xpath("//md-icon[@aria-label='Close dialog']");
 	By View_record_click       = By.xpath("(//button[@ng-click='GetAudio(row);'])[1]");

	public void user_signin_with_the_Respective_users_roles_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_menu_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Navgat);
		driver.findElement(sidebar_Navgat).click();
		utilities.MinimumWait(driver);		
	}

	public void Side_navgation_click_on_the_Crop_Maintenances_screen() throws Throwable {
		utilities.webDriverWait(driver, Crop_maintenance_click);
		driver.findElement(Crop_maintenance_click).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_View_Address_Complaints_screen_name() throws Throwable {
		utilities.webDriverWait(driver, View_add_complaints);
		driver.findElement(View_add_complaints).click();
		utilities.MinimumWait(driver);
	}

	public void check_with_the_Status_wise_details() throws Throwable {
		utilities.webDriverWait(driver, Status_select_click);
		driver.findElement(Status_select_click).click();
		utilities.MinimumWait(driver);
		driver.findElement(Status_select_opt).click();
		utilities.MinimumWait(driver);

	}

	public void check_with_the_From_date_selection() throws Throwable {
		utilities.webDriverWait(driver, From_date_select);
		driver.findElement(From_date_select).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_select).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(From_date_toast_m);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_select).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_select).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}

	public void click_on_the_Search_action_button() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MaximumWait(driver);		
	}

	public void check_with_the_Complaint_type_details_wise() throws Throwable {
		utilities.webDriverWait(driver, Complaint_type);
		driver.findElement(Complaint_type).click();
		utilities.MaximumWait(driver);		
		driver.findElement(Complaint_type_option).click();
		utilities.MaximumWait(driver);		

	}

	public void check_with_the_View_Image_action_button() throws Throwable {
		utilities.webDriverWait(driver, View_image_click);
		driver.findElement(View_image_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(View_img_window_close).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_View_recording_action_button() throws Throwable {
		utilities.webDriverWait(driver, View_record_click);
		driver.findElement(View_record_click).click();
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		
	}
}
