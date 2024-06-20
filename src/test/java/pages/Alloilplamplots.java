package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Alloilplamplots extends DriverFactory{
	Utilities utilities        = new Utilities();
	By username                  = By.xpath("//input[@type='text']");
  	By password                  = By.xpath("//input[@type='password']");
  	By Login                     = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By sidebar_Navg              = By.xpath("//a[@class='sidebar-toggle']");
  	By AreaExtension_module_cl   = By.xpath("//span[text()='Area Extension/Conversion']");
  	By Alloilpalm_plots_nav      = By.xpath("//a[@href='#/statusAfterVerifi']");
  	By Select_location_Typ       = By.xpath("//md-select[@name='GeoLocations']");
	By State_select_fir          = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Sel_state_grid_one_ne     = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By Sel_state_sel_two_ne      = By.xpath("//div[text()='Arunachal Pradesh - AR']");
	By District_select_d         = By.xpath("//md-select[@name='DistrictIds']");
	By District_er_msg           = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Sel_District_one          = By.xpath("//div[text()='EAST GODAVARI - EG']");
	By Sel_district_two          = By.xpath("//div[text()='L/Dibang Valley - LD']");
	By Mandal_select_field       = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandals_tast_msg          = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mndal_selec_one           = By.xpath("//div[text()='Devarapalli-II - DA']");
	By Mndal_selec_two           = By.xpath("//div[text()='Roing - RN']");
	By Village_selec_field       = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Villages_tost_msg         = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By villages_sele_one         = By.xpath("//div[text()='Alumo - AL']");
	By villages_sele_two         = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
    By Plot_status               = By.xpath("//md-select[@ng-model='GeoLocation.StatusTypeIds']");
    By Status_select             = By.xpath("//div[text()='Current Crop Non - Yielding']");
    By Status_sel_two            = By.xpath("//div[text()='Current Crop Yielding']");
    By From_date_selc            = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_tst_msge        = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_btn_chec           = By.xpath("//button[@ng-click='initPlotStatus(request)']");
	By Ho_approved               = By.xpath("(//button[@aria-label='Approved'])[7]");
	By ho_confirmation_click     = By.xpath("//md-dialog-actions//span[text()='Approve']");
	By save_toast_msgs           = By.xpath("//div[text()='Plot Status Approved Successfully']");

	
	
	
  	
  	
  	
	public void signIn_with_the_Respective_user_roles_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}



	public void the_page_will_Navigate_to_the_Dashboard_menu_of_the_oilpalm_screens() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Navg);
		driver.findElement(sidebar_Navg).click();
		utilities.MinimumWait(driver);	
	}



	public void click_on_the_menu_as_a_Area_Extension_module() throws Throwable {
		utilities.webDriverWait(driver, AreaExtension_module_cl);
		driver.findElement(AreaExtension_module_cl).click();
		utilities.MinimumWait(driver);
	}



	public void Click_on_the_Alloilpalm_plots_screen() throws Throwable {
		utilities.webDriverWait(driver, Alloilpalm_plots_nav);
		driver.findElement(Alloilpalm_plots_nav).click();
		utilities.MinimumWait(driver);
	}



	public void check_with_location_type_selection_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, Select_location_Typ);
		driver.findElement(Select_location_Typ).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}



	public void select_State_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		utilities.webDriverWait(driver, State_select_fir);
		driver.findElement(State_select_fir).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_grid_one_ne).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_sel_two_ne).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}



	public void select_Distrtict_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		utilities.webDriverWait(driver, District_select_d);
		driver.findElement(District_select_d).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_er_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_select_d).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_District_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_district_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}



	public void select_Mandal_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_field);
		driver.findElement(Mandal_select_field).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Mandals_tast_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_select_field).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mndal_selec_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mndal_selec_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}



	public void select_villages_from_the_Alloilpalmplots_active_grid_screen() throws Throwable {
		utilities.webDriverWait(driver, Village_selec_field);
		driver.findElement(Village_selec_field).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Villages_tost_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_selec_field).click();
		utilities.MaximumWait(driver);
		driver.findElement(villages_sele_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(villages_sele_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}
    public void select_Ploststatus_from_the_Alloilplamplots_active_grid_screen() throws Throwable {
		utilities.webDriverWait(driver, Plot_status);
		driver.findElement(Plot_status).click();
		utilities.MaximumWait(driver);
		driver.findElement(Status_select).click();
		utilities.MaximumWait(driver);
		driver.findElement(Status_sel_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);


		
	}
	public void check_with_the_From_date_selection_from_the_Alloilplamplots_active_grid_screen() throws Throwable {
		utilities.webDriverWait(driver, From_date_selc);
		driver.findElement(From_date_selc).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selc).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_tst_msge);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selc).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_selc).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}

	public void check_with_search_button_click() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_chec);
		driver.findElement(Search_btn_chec).click();
		utilities.MinimumWait(driver);
	}



	public void check_with_actions_by_Ho_approvals() throws Throwable {
		utilities.webDriverWait(driver, Ho_approved);
		driver.findElement(Ho_approved).click();
		utilities.MinimumWait(driver);
		driver.findElement(ho_confirmation_click).click();
		utilities.MinimumWait(driver);
		WebElement toastmessage = driver.findElement(save_toast_msgs);
		String messageText = toastmessage.getText();
		System.out.println("Toast message: " + messageText);
		
	}
  	
  	
  	

}
