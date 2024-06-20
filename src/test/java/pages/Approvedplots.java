package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class Approvedplots extends DriverFactory{
	Utilities utilities       = new Utilities();
	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar_nav_menu       = By.xpath("//a[@class='sidebar-toggle']");
	By Areaextension_click    = By.xpath("//span[text()='Area Extension/Conversion']");
	By Approved_plots_click   = By.xpath("//a[@href='#/appOrDecPlots']");
	By Select_location_form   = By.xpath("//md-select[@name='GeoLocations']");
	By State_select_form      = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Sel_state_grid_dropd   = By.xpath("//div[text()='Andhra Pradesh - AP']");
	By Sel_state_sel_two_dr   = By.xpath("//div[text()='Arunachal Pradesh - AR']");
	By District_select_drop   = By.xpath("//md-select[@name='DistrictIds']");
	By District_aler_msg      = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Sele_District_one      = By.xpath("//div[text()='EAST GODAVARI - EG']");
	By Sele_district_two      = By.xpath("//div[text()='L/Dibang Valley - LD']");
	By Mandal_select_drop     = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandals_toast_msg      = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mandal_selec_one       = By.xpath("//div[text()='Devarapalli-II - DA']");
	By Mandal_selec_two       = By.xpath("//div[text()='Roing - RN']");
	By Village_select_drop    = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Village_tst_msg        = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By village_selec_one      = By.xpath("//div[text()='Alumo - AL']");
	By village_selec_two      = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
	By From_date_selec        = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_tst_msg      = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_btn_click       = By.xpath("//button[@ng-click='initAppOrDecPlots(request)']");
	By Update_advance_details = By.xpath("(//button[@ng-click='editAdvanceDetails(row)'])[2]");  
	By close_window_update_ad = By.xpath("//md-icon[@aria-label='Close dialog']");
	By Add_saplings_details   = By.xpath("(//button[@ng-click='addSaplingDetails(row)'])[2]");
	By select_nursery_click   = By.xpath("//md-select[@ng-model='nursery']");
	By Select_nursery_opt_ap  = By.xpath("//md-option[text()='Agri - Nursery-AP - WG - Dubacherla']");
	By Add_select_nursery     = By.xpath("//md-option[text()='Agri - Nursery - AR - Roing']");
	By Select_batch_click     = By.xpath("//md-select[@ng-model='Batch']");
	By Select_batch_option    = By.xpath("//md-option[text()='AP/DUB/IMP/ASD-SPRING/AUG-21/C-11']");
	By Select_batch_indi      = By.xpath("//md-option[text()='AR/ROI/OPIL/IND/19-20/Jun&Jul-19/03']");
	By Select_advance_receipt = By.xpath("//md-select[@ng-model='AdvanceDetails']");
	By select_advance_rec_opt = By.xpath("(//md-option[@ng-value='b'])[1]");
	By Variety_selec_click    = By.xpath("//md-select[@ng-model='nurseryCross']");
	By Variety_opt_sel        = By.xpath("//md-option[text()='DELI X NIGERIA']");
	By Vendor_selec_click     = By.xpath("//md-select[@ng-model='nurseryVendor']");
	By Vendor_opt_sel         = By.xpath("//md-option[text()='Local']");
	By No_of_Imp_saplings     = By.xpath("//input[@ng-model='Request.NoOfImportedSaplingsDispatched']");
	By Import_comments	      = By.xpath("//input[@ng-model='Request.Comments']");
	By No_of_Ind_saplings     = By.xpath("//input[@ng-model='Request.NoOfIndigenousSaplingsDispatched']");
	By Save_and_print_click   = By.xpath("//button[@ng-click='addnurserySaplings($event)']");
	By View_saplings_button   = By.xpath("(//button[@ng-click='viewSaplingDetails(row)'])[2]");
	By View_saplings_close    = By.xpath("(//button[@ng-click='cancel()'])[2]");
	
	public void First_signin_with_the_Respective_user_role_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);	
		
	}


	public void the_page_is_Navigate_to_the_Dashboard_menu_of_the_oilpalm_screen() throws Throwable {
		utilities.webDriverWait(driver, sidebar_nav_menu);
		driver.findElement(sidebar_nav_menu).click();
		utilities.MinimumWait(driver);			
	}


	public void Click_on_the_Areaextensions_module_screen_name() throws Throwable {
		utilities.webDriverWait(driver, Areaextension_click);
		driver.findElement(Areaextension_click).click();
		utilities.MaximumWait(driver);	
	}


	public void click_on_the_Approvedplots_screen() throws Throwable {
		utilities.webDriverWait(driver, Approved_plots_click);
		driver.findElement(Approved_plots_click).click();
		utilities.MaximumWait(driver);	
	}


	public void Select_Location_type_from_the_Approvedplots_screen_grids() throws Throwable {
		utilities.webDriverWait(driver, Select_location_form);
		driver.findElement(Select_location_form).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
		
	}


	public void select_state_from_the_Approvedplots_screen_grid_details() throws Throwable {
		utilities.webDriverWait(driver, State_select_form);
		driver.findElement(State_select_form).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_grid_dropd).click();
		utilities.MaximumWait(driver);
		driver.findElement(Sel_state_sel_two_dr).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}


	public void select_District_from_Approvedplots_screen_grid_details() throws Throwable {
		utilities.webDriverWait(driver, District_select_drop);
		driver.findElement(District_select_drop).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_aler_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_select_drop).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sele_District_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sele_district_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}


	public void select_mandals_from_the_Approvedplots_screen_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_drop);
		driver.findElement(Mandal_select_drop).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Mandals_toast_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_select_drop).click();
		utilities.MinimumWait(driver);
		driver.findElement(Mandal_selec_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Mandal_selec_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}


	public void select_villages_from_the_Approvedplots_screen_grid_details() throws Throwable {
		utilities.webDriverWait(driver, Village_select_drop);
		driver.findElement(Village_select_drop).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Village_tst_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_select_drop).click();
		utilities.MinimumWait(driver);
		driver.findElement(village_selec_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(village_selec_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}


	public void check_with_the_Select_From_date_selection_details() throws Throwable {
		utilities.webDriverWait(driver, From_date_selec);
		driver.findElement(From_date_selec).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selec).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_tst_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selec).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_selec).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}


	public void Click_on_the_Search_button_from_the_Approvedplots_screen_grid_view() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_Update_Advance_details_button() throws Throwable {
		utilities.webDriverWait(driver, Update_advance_details);
		driver.findElement(Update_advance_details).click();
		utilities.MaximumWait(driver);
		driver.findElement(close_window_update_ad).click();
		utilities.MaximumWait(driver);

	}


	public void Click_on_the_Add_sapling_Nursery_selection_details_button() throws Throwable {
		utilities.webDriverWait(driver, Add_saplings_details);
		driver.findElement(Add_saplings_details).click();
		utilities.MaximumWait(driver);
		driver.findElement(select_nursery_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_nursery_opt_ap).click();
		utilities.MaximumWait(driver);

	}
	public void Click_on_the_Add_sapling_indi_Nursery_selection_details_button() throws Throwable {
		utilities.webDriverWait(driver, Add_saplings_details);
		driver.findElement(Add_saplings_details).click();
		utilities.MaximumWait(driver);
		driver.findElement(select_nursery_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Add_select_nursery).click();
		utilities.MaximumWait(driver);
	}


	public void Select_Batch_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Select_batch_click);
		driver.findElement(Select_batch_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_batch_option).click();
		utilities.MaximumWait(driver);
	}
	public void Select_indi_Batch_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Select_batch_click);
		driver.findElement(Select_batch_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_batch_indi).click();
		utilities.MaximumWait(driver);
	}

	public void Select_Advance_receipt_numbers_from_the_Dropdown_option() throws Throwable {
		utilities.webDriverWait(driver, Select_advance_receipt);
		driver.findElement(Select_advance_receipt).click();
		utilities.MaximumWait(driver);
		driver.findElement(select_advance_rec_opt).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}


	public void select_Variety_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Variety_selec_click);
		driver.findElement(Variety_selec_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Variety_opt_sel).click();
		utilities.MaximumWait(driver);
		
	}


	public void select_Vendor_from_the_dropdown_list() throws Throwable {
		utilities.webDriverWait(driver, Vendor_selec_click);
		driver.findElement(Vendor_selec_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Vendor_opt_sel).click();
		utilities.MaximumWait(driver);
	}


	public void Enter_No_of_Imported_Saplings_Dispatched_input_details() throws Throwable {
		utilities.webDriverWait(driver, No_of_Imp_saplings);
		driver.findElement(No_of_Imp_saplings).clear();
		utilities.MaximumWait(driver);
		driver.findElement(No_of_Imp_saplings).sendKeys("10");
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);

	}
	public void Enter_with_the_Imported_comments() throws Throwable {
		utilities.webDriverWait(driver, Import_comments);
		driver.findElement(Import_comments).sendKeys("added Imported saplings");
		utilities.MaximumLongWait(driver);
	}

	public void Enter_No_of_Indigenous_Saplings_Dispatched_input_details() throws Throwable {
		utilities.webDriverWait(driver, No_of_Ind_saplings);
		driver.findElement(No_of_Ind_saplings).clear();
		utilities.MaximumWait(driver);
		driver.findElement(No_of_Ind_saplings).sendKeys("10");
		utilities.MaximumWait(driver);
	}
	public void Enter_with_the_Indigenous_comments() throws Throwable {
		utilities.webDriverWait(driver, Import_comments);
		driver.findElement(Import_comments).sendKeys("added Imported saplings");
		utilities.MaximumLongWait(driver);
	}

	public void click_on_the_Save_and_Print_button() throws Throwable {
		utilities.webDriverWait(driver, Save_and_print_click);
		driver.findElement(Save_and_print_click).click();
		utilities.MaximumWait(driver);
	}


	public void Click_on_the_View_Sapling_details_action_button() throws Throwable {
		utilities.webDriverWait(driver, View_saplings_button);
		driver.findElement(View_saplings_button).click();
		utilities.MaximumWait(driver);
	}


	public void Check_with_the_View_sapling_details_cancel_action_button() throws Throwable {
		utilities.webDriverWait(driver, View_saplings_close);
		driver.findElement(View_saplings_close).click();
		utilities.MaximumWait(driver);
	}













}
