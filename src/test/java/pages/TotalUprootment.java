package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import util.DriverFactory;
import util.Utilities;

public class TotalUprootment extends DriverFactory {
	Utilities utilities        = new Utilities();
	By username                = By.xpath("//input[@type='text']");
 	By password                = By.xpath("//input[@type='password']");
 	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
 	By sidebar_Navga           = By.xpath("//a[@class='sidebar-toggle']");
 	By Crop_maintenance_click  = By.xpath("//span[text()='Crop Maintenance']");
 	By Total_uprootment_click  = By.xpath("//a[@href='#/uprootment']");
 	By Select_location_typ     = By.xpath("//md-select[@name='GeoLocations']");
 	By State_selction          = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
 	By Select_state_first_one  = By.xpath("//div[text()='Andhra Pradesh - AP']");
 	By Select_state_sec_one    = By.xpath("//div[text()='Arunachal Pradesh - AR']");
 	
 	By District_selction       = By.xpath("//md-select[@ng-model='GeoLocation.DistrictIds']");
 	By With_out_dist           = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
 	By Select_District_f_one   = By.xpath("//div[text()='L/Dibang Valley - LD']");
 	By Select_District_s_two   = By.xpath("//div[text()='Vizianagaram - VN']");
 	By Mandal_selction         = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
 	By With_out_Mndl           = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
 	By Select_mandal_f_one     = By.xpath("//div[text()='Roing - RN']");
 	By Select_mandal_s_sec     = By.xpath("//div[text()='S.Kota - SK']");
 	By Village_selction        = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
 	By With_out_Vill           = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
 	By Select_village_f_one    = By.xpath("(//div[text()='S.Kota - SK'])[3]");
 	By Select_village_s_two    = By.xpath("//div[text()='Old Abali - AB']");
 	By Search_btn_clic         = By.xpath("//button[@ng-click='initUprootment(GeoLocation.VillageIds)']");
 	By Cluster_man_approve     = By.xpath("(//button[@aria-label='Cluster Manager Approval'])[1]");
 	By Enter_comments          = By.xpath("//textarea[@name='Comments']");
 	By Click_on_uproot_action  = By.xpath("//button[@ng-click='uprootPlot()']");
 	By State_mang_approve      = By.xpath("//button[@aria-label='State Head Approval']");
 	By Agri_uproot_plot        = By.xpath("//button[@aria-label='Uprootment']");
 	
 	

	public void user_signin_with_the_Respective_user_roles_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}

	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_oilpalm_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Navga);
		driver.findElement(sidebar_Navga).click();
		utilities.MinimumWait(driver);
	}

	public void Side_navgation_click_on_the_Crop_Maintenance_screen() throws Throwable {
		utilities.webDriverWait(driver, Crop_maintenance_click);
		driver.findElement(Crop_maintenance_click).click();
		utilities.MinimumWait(driver);
	}

	public void Click_on_the_menu_as_a_Total_Uprootment_screen() throws Throwable {
		utilities.webDriverWait(driver, Total_uprootment_click);
		driver.findElement(Total_uprootment_click).click();
		utilities.MinimumWait(driver);
		
	}

	public void check_with_the_select_location_type() throws Throwable {
		utilities.webDriverWait(driver, Select_location_typ);
		driver.findElement(Select_location_typ).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void select_States_from_the_Dropdown_list_data() throws Throwable {
		utilities.webDriverWait(driver, State_selction);
		driver.findElement(State_selction).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_state_first_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_state_sec_one).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void select_Districts_from_the_Dropdown_list_data() throws Throwable {
		utilities.webDriverWait(driver, District_selction);
		driver.findElement(District_selction).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(With_out_dist);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_selction).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_District_f_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_District_s_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void select_Mandals_from_the_Dropdown_list_data() throws Throwable {
		utilities.webDriverWait(driver, Mandal_selction);
		driver.findElement(Mandal_selction).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(With_out_Mndl);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_selction).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_mandal_f_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_mandal_s_sec).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void select_villages_from_the_Dropdown_list_data() throws Throwable {
		utilities.webDriverWait(driver, Village_selction);
		driver.findElement(Village_selction).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(With_out_Vill);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_selction).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_village_f_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_village_s_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void click_on_the_Search_button_from_the_Total_uprootment_active_grid() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_clic);
		driver.findElement(Search_btn_clic).click();
		utilities.MaximumWait(driver);
	}

	public void Verify_with_Click_on_the_Cluster_manager_Approvals() throws Throwable {
		utilities.webDriverWait(driver, Cluster_man_approve);
		driver.findElement(Cluster_man_approve).click();
		utilities.MaximumWait(driver);
		driver.findElement(Enter_comments).sendKeys("Cluster manager approval");
		utilities.MaximumWait(driver);

	}
	public void verify_with_Uprootment_save_button() throws Throwable {
		utilities.webDriverWait(driver, Click_on_uproot_action);
		driver.findElement(Click_on_uproot_action).click();
		utilities.MaximumWait(driver);
	}

	public void Verify_with_Click_on_the_State_Head_approvals() throws Throwable {
		utilities.webDriverWait(driver, State_mang_approve);
		driver.findElement(State_mang_approve).click();
		utilities.MaximumWait(driver);
		driver.findElement(Enter_comments).sendKeys("Statehead manager approval");
		utilities.MaximumWait(driver);
		driver.findElement(Click_on_uproot_action).click();
		utilities.MaximumWait(driver);
	}

	public void Verify_with_click_on_the_Agrihead_approval_action() throws Throwable {
		utilities.webDriverWait(driver, Agri_uproot_plot);
		driver.findElement(Agri_uproot_plot).click();
		utilities.MaximumWait(driver);
		driver.findElement(Enter_comments).sendKeys("Uproot plot");
		utilities.MaximumWait(driver);
		driver.findElement(Click_on_uproot_action).click();
		utilities.MaximumWait(driver);
	}

}
