package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class NewlyConvertedPlots extends DriverFactory { 
        Utilities utilities        = new Utilities();
        By username                = By.xpath("//input[@type='text']");
    	By password                = By.xpath("//input[@type='password']");
    	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
    	By sidebar_Navg            = By.xpath("//a[@class='sidebar-toggle']");
    	By AreaExtension_module_c  = By.xpath("//span[text()='Area Extension/Conversion']");
    	By NewlyConverted_screen   = By.xpath("//a[@href='#/newPlots']");
    	By Select_location_frm     = By.xpath("//md-select[@name='GeoLocations']");
    	By State_select_first      = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
    	By Sel_state_grid_one_n    = By.xpath("//div[text()='Andhra Pradesh - AP']");
    	By Sel_state_sel_two_n     = By.xpath("//div[text()='Arunachal Pradesh - AR']");
    	By District_selec_drop     = By.xpath("//md-select[@name='DistrictIds']");
    	By District_alr_msg        = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
    	By Sele_Dstrict_one        = By.xpath("//div[text()='EAST GODAVARI - EG']");
    	By Sele_dstrict_two        = By.xpath("//div[text()='L/Dibang Valley - LD']");
    	By Mandal_selec_drop       = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
    	By Mandals_tst_msg         = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
    	By Mandal_sel_one          = By.xpath("//div[text()='Devarapalli-II - DA']");
    	By Mandal_sel_two          = By.xpath("//div[text()='Roing - RN']");
    	By Village_selec_drop      = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
    	By Village_tost_msg        = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
    	By village_sele_one        = By.xpath("//div[text()='Alumo - AL']");
    	By village_sele_two        = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
    	By From_date_sele          = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
    	By from_date_tst_msgs      = By.xpath("//div[text()='The entered value is not a date!']");
    	By Search_bt_click         = By.xpath("//button[@ng-click='initNewlyConvertedPlots(request)']");
    	By All_doc_verify          = By.xpath("//md-checkbox[@ng-model='row.IsPlotSubsidySubmission']");
    	By Check_update_clic       = By.xpath("(//md-dialog[@role='dialog']//button)[2]");
    	By All_details_verify      = By.xpath("//md-checkbox[@ng-model='row.IsPlotHavingIdCard']");
    	By Check_update_click      = By.xpath("(//md-dialog[@role='dialog']//button)[2]");
    	By Geo_boundary_verify     = By.xpath("//md-checkbox[@ng-model='row.IsGeoBoundariesVerification']");
    	By Check_update_cli        = By.xpath("(//md-dialog[@role='dialog']//button)[2]");
    	By Verify_action           = By.xpath("//button[@aria-label='Verify']");
    	
    	
    	
		public void First_signin_with_the_Respective_user_roles_details() throws Throwable {
			driver.get(prop.getProperty("url"));
			utilities.webDriverWait(driver, Login);
			utilities.webDriverWait(driver, username);
			driver.findElement(username).sendKeys("admin");
			driver.findElement(password).sendKeys("P@ssw0rd");
			utilities.webDriverWait(driver, Login);
			driver.findElement(Login).click();
			utilities.MaximumWait(driver);
		}

		public void the_page_will_Navigate_to_the_Dashboard_menu_of_the_oilpalm_screen() throws Throwable {
			utilities.webDriverWait(driver, sidebar_Navg);
			driver.findElement(sidebar_Navg).click();
			utilities.MinimumWait(driver);
			
		}

		public void Clicking_on_the_Areaextensions_module_screen_name() throws Throwable {
			utilities.webDriverWait(driver, AreaExtension_module_c);
			driver.findElement(AreaExtension_module_c).click();
			utilities.MaximumWait(driver);	
		}

		public void click_on_the_NewlyConvertedPlots_screen() throws Throwable {
			utilities.webDriverWait(driver, NewlyConverted_screen);
			driver.findElement(NewlyConverted_screen).click();
			utilities.MaximumWait(driver);	
		}

		public void select_with_Location_type_wise_details_search() throws Throwable {
			utilities.webDriverWait(driver, Select_location_frm);
			driver.findElement(Select_location_frm).click();
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
			utilities.MaximumWait(driver);
		}

		public void select_State_from_the_Newlyconverted_active_grid_screen() throws Throwable {
			utilities.webDriverWait(driver, State_select_first);
			driver.findElement(State_select_first).click();
			utilities.MaximumWait(driver);
			driver.findElement(Sel_state_grid_one_n).click();
			utilities.MaximumWait(driver);
			driver.findElement(Sel_state_sel_two_n).click();
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
			utilities.MaximumWait(driver);
		}

		public void Select_District_from_the_Newlyconverted_active_grid_details() throws Throwable {
			utilities.webDriverWait(driver, District_selec_drop);
			driver.findElement(District_selec_drop).click();
			utilities.MaximumWait(driver);
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
		    utilities.MinimumWait(driver);
		    WebElement message = driver.findElement(District_alr_msg);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(District_selec_drop).click();
			utilities.MaximumWait(driver);
			driver.findElement(Sele_Dstrict_one).click();
			utilities.MaximumWait(driver);
			driver.findElement(Sele_dstrict_two).click();
			Robot r1= new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			utilities.MaximumWait(driver);
		}

		public void select_mandals_from_the_newlyconverted_active_grid_details() throws Throwable {
			utilities.webDriverWait(driver, Mandal_selec_drop);
			driver.findElement(Mandal_selec_drop).click();
			utilities.MaximumWait(driver);
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
		    utilities.MinimumWait(driver);
		    WebElement message = driver.findElement(Mandals_tst_msg);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(Mandal_selec_drop).click();
			utilities.MaximumWait(driver);
			driver.findElement(Mandal_sel_one).click();
			utilities.MaximumWait(driver);
			driver.findElement(Mandal_sel_two).click();
			Robot r1= new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			utilities.MaximumWait(driver);
		}

		public void select_Villages_from_the_newlyconverted_active_grid_details() throws Throwable {
			utilities.webDriverWait(driver, Village_selec_drop);
			driver.findElement(Village_selec_drop).click();
			utilities.MaximumWait(driver);
			Robot r = new Robot();
		    r.keyPress(KeyEvent.VK_TAB);
		    utilities.MinimumWait(driver);
		    WebElement message = driver.findElement(Village_tost_msg);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			driver.findElement(Village_selec_drop).click();
			utilities.MaximumWait(driver);
			driver.findElement(village_sele_one).click();
			utilities.MaximumWait(driver);
			driver.findElement(village_sele_two).click();
			Robot r1= new Robot();
			r1.keyPress(KeyEvent.VK_TAB);
			utilities.MaximumWait(driver);
		}

		public void select_fromdate_from_the_newlyconverted_active_grid_details() throws Throwable {
			utilities.webDriverWait(driver, From_date_sele);
			driver.findElement(From_date_sele).clear();
			utilities.MinimumWait(driver);
			driver.findElement(From_date_sele).sendKeys("01/023/2024");
			utilities.MinimumWait(driver);
		    WebElement message = driver.findElement(from_date_tst_msgs);
		    String actualMessage = message.getText();
		    System.out.println("Validation message: " + actualMessage);
			utilities.MinimumWait(driver);
			driver.findElement(From_date_sele).clear();
			utilities.MaximumWait(driver);
			driver.findElement(From_date_sele).sendKeys("01/01/2020");
			utilities.MaximumWait(driver);
		}

		public void click_on_the_Search_button_from_the_Newly_converted_active_grid_details() throws Throwable {
			utilities.webDriverWait(driver, Search_bt_click);
			driver.findElement(Search_bt_click).click();
			utilities.MaximumWait(driver);
		}

		public void click_on_the_All_details_check_box_selections() throws Throwable {
			utilities.webDriverWait(driver, All_doc_verify);
			driver.findElement(All_doc_verify).click();
			utilities.MaximumWait(driver);
			driver.findElement(Check_update_clic).click();
			utilities.MaximumWait(driver);

		}
		public void click_on_the_All_details_submmitted_are_correct_or_not() throws Throwable {
			utilities.webDriverWait(driver, All_details_verify);
			driver.findElement(All_details_verify).click();
			utilities.MaximumWait(driver);
			driver.findElement(Check_update_click).click();
			utilities.MaximumWait(driver);
		}
		public void click_on_the_Geoboundaries_verification_checkbox_selection() throws Throwable {
			utilities.webDriverWait(driver, Geo_boundary_verify);
			driver.findElement(Geo_boundary_verify).click();
			utilities.MaximumWait(driver);
			driver.findElement(Check_update_cli).click();
			utilities.MaximumWait(driver);
		}
		public void Check_with_Click_on_the_Verify_button() throws Throwable {
			utilities.webDriverWait(driver, Verify_action);
			driver.findElement(Verify_action).click();
			utilities.MaximumWait(driver);
			driver.findElement(Check_update_cli).click();
			utilities.MaximumWait(driver);

		}

	

		

	}


