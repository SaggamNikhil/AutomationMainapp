package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class GeoboundariesDoneplots extends DriverFactory {
	Utilities utilities = new Utilities();

	By text                    = By.xpath("//input[@type='text']");
  	By code                    = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By dashboard               = By.xpath("//section[@class='content-header']");
	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_clk     = By.xpath("//span[text()='Activities']");
  	By Geo_Boundaries_nav      = By.xpath("//a[@href='#/retakeGeoBoundaries']");
  	By Sel_location_type       = By.xpath("//md-select[@name='GeoLocations']");
  	By Select_States_filt      = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
  	By Select_State_one        = By.xpath("//div[text()='Andhra Pradesh - AP']");
  	By Select_State_two        = By.xpath("//div[text()='Arunachal Pradesh - AR']");
  	By District_select_clk     = By.xpath("//md-select[@name='DistrictIds']");
	By District_err_msg        = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Sel_District_one        = By.xpath("//div[text()='EAST GODAVARI - EG']");
	By Sel_district_two        = By.xpath("//div[text()='L/Dibang Valley - LD']");
	By Mandal_select_field_clk = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandals_err_msg         = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mndal_selec_one         = By.xpath("//div[text()='Devarapalli-II - DA']");
	By Mndal_selec_two         = By.xpath("//div[text()='Roing - RN']");
	By Village_selec_field_clk = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Villages_err_msg        = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By villages_sele_one       = By.xpath("(//div[text()='Alumo - AL'])[1]");
	By villages_sele_two       = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
	By Search_btn_click        = By.xpath("//button[@ng-click='initGeoBoundariesDonePlots(request)']");
	By From_date_selection     = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By from_date_tst_msg       = By.xpath("//div[text()='The entered value is not a date!']"); 
	By Alldoc_verify_check     = By.xpath("//md-checkbox[@ng-model='row.IsPlotSubsidySubmission']");
	By bank_verify_confirm     = By.xpath("//button[@ng-click='dialog.hide()']");
    By Id_verify_check         = By.xpath("//md-checkbox[@ng-model='row.IsPlotHavingIdCard']");
    By id_verify_confirm       = By.xpath("//span[text()='Update']");
    By Geo_verify_boundaries   = By.xpath("//md-checkbox[@ng-model='row.IsGeoBoundariesVerification']");
    By Geo_verify_confirm      = By.xpath("//span[text()='Update']");
    By Final_verify            = By.xpath("//button[@ng-if='ActivityRights.CanVerifyPlotStatus']");
    By Final_verify_confirm    = By.xpath("//span[text()='Update']");
	
	
  	
		public void the_users_has_entered(String username) throws Throwable {
			driver.get(prop.getProperty("url"));
             utilities.webDriverWait(driver, text);
			 driver.findElement(text).sendKeys(username);
			 utilities.MaximumWait(driver);
			}

	public void the_users_has_entered1(String password) throws Throwable {
		 utilities.webDriverWait(driver, code);
		 driver.findElement(code).sendKeys(password);
		 utilities.MaximumWait(driver);
		}

	public void User_click_on_the_LogIn() throws Throwable {
		 utilities.webDriverWait(driver, Login);
		 driver.findElement(Login).click();
		 utilities.MaximumWait(driver);
	}

	public void Users_navigated_to_the_home_page() throws Throwable {
		 utilities.webDriverWait(driver, dashboard);
		 WebElement message = driver.findElement(dashboard);
	     String actualMessage = message.getText();
	     System.out.println("Validation message: " + actualMessage);
		 utilities.MaximumWait(driver);
		 driver.findElement(sidebar_Ngt).click();
		 utilities.MaximumWait(driver);
	}

	public void Click_on_the_Activities_module_main_menus() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_clk);
		driver.findElement(Activities_menu_clk).click();
		utilities.MaximumWait(driver);
	}

	public void click_on_the_Geo_Boundaries_Done_Plots_menu() throws Throwable {
		utilities.webDriverWait(driver, Geo_Boundaries_nav);
		driver.findElement(Geo_Boundaries_nav).click();
		utilities.MaximumWait(driver);
	}

	public void Check_with_the_Select_Location_details() throws Throwable {
		utilities.webDriverWait(driver, Sel_location_type);
		driver.findElement(Sel_location_type).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}

	public void Check_with_the_Select_States_from_the_Geoboundaries_Done_Plots_screen() throws Throwable {
		utilities.webDriverWait(driver, Select_States_filt);
		driver.findElement(Select_States_filt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_State_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_State_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void Check_with_the_Select_Districts_from_the_Geoboundaries_Done_Plots_screen() throws Throwable {
		utilities.webDriverWait(driver, District_select_clk);
		driver.findElement(District_select_clk).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_err_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_select_clk).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_District_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_district_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}

	public void Check_with_the_Select_Mandals_from_the_Geoboundaries_Done_plots_screen() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_field_clk);
		driver.findElement(Mandal_select_field_clk).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Mandals_err_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_select_field_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mndal_selec_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mndal_selec_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void Check_with_the_Select_Villages_from_the_Geoboundaries_Done_plots_screen() throws Throwable {
		utilities.webDriverWait(driver, Village_selec_field_clk);
		driver.findElement(Village_selec_field_clk).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Villages_err_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_selec_field_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(villages_sele_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(villages_sele_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void Check_with_the_Clicking_on_the_Search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MinimumWait(driver);
	}

	public void Check_with_the_From_date_selection_from_the_Active_grid() throws Throwable {
		utilities.webDriverWait(driver, From_date_selection);
		driver.findElement(From_date_selection).clear();
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selection).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(from_date_tst_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(From_date_selection).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_selection).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}

	public void Check_with_the_All_Documents_Submitted_checkbox_selection() throws Throwable {
		utilities.webDriverWait(driver, Alldoc_verify_check);
		driver.findElement(Alldoc_verify_check).click();
		utilities.MinimumWait(driver);
	}

	public void check_with_the_Bank_details_Confirmation_popup_window() throws Throwable {
		utilities.webDriverWait(driver, bank_verify_confirm);
		driver.findElement(bank_verify_confirm).click();
		utilities.MinimumWait(driver);
		
	}

	public void check_with_the_All_details_correct_or_not_checkbox_input() throws Throwable {
		utilities.webDriverWait(driver, Id_verify_check);
		driver.findElement(Id_verify_check).click();
		utilities.MinimumWait(driver);
		driver.findElement(id_verify_confirm).click();
		utilities.MinimumWait(driver);

	}

	public void check_with_the_Geo_Boundaries_verification_Checkbox_input() throws Throwable {
		utilities.webDriverWait(driver, Geo_verify_boundaries);
		driver.findElement(Geo_verify_boundaries).click();
		utilities.MinimumWait(driver);
		driver.findElement(Geo_verify_confirm).click();
		utilities.MinimumWait(driver);
	}

	public void check_with_the_verify_action_confirmation() throws Throwable {
		utilities.webDriverWait(driver, Final_verify);
		driver.findElement(Final_verify).click();
		utilities.MinimumWait(driver);
		driver.findElement(Final_verify_confirm).click();
		utilities.MinimumWait(driver);

	}
}
