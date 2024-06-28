package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

public class SetPlantationCategory extends DriverFactory  {
	Utilities utilities        = new Utilities();
	By text                    = By.xpath("//input[@type='text']");
  	By code                    = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By dashboard               = By.xpath("//section[@class='content-header']");
	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_clk     = By.xpath("//span[text()='Activities']");
  	By Set_plantation_menu     = By.xpath("//a[@href='#/plantationCategory']");
  	By Select_financial_yr     = By.xpath("//input[@ng-model='Request.FinancialYear']");
  	By Select_finan_yr_opt     = By.xpath("//span[text()='2024']");
  	By Sel_location_type       = By.xpath("//md-select[@name='GeoLocations']");
  	By Select_states_filter    = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
  	By State_select_opt_one    = By.xpath("//div[text()='Andhra Pradesh - AP']");
  	By State_select_opt_two    = By.xpath("//div[text()='Arunachal Pradesh - AR']");
  	By District_select_click   = By.xpath("//md-select[@name='DistrictIds']");
  	By District_err_tst        = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
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
	By Search_btn_click        = By.xpath("//button[@ng-click='plantationCategotyDetails(Request,Request.FinancialYear)']");
	By Add_Plantatation_click  = By.xpath("(//button[@ng-click='AddPlantation(row)'])[6]");
	By Select_plantation_catg  = By.xpath("//md-select[@ng-model='plantation.Id']");
	By Without_plantation_sel  = By.xpath("//div[@ng-messages='rowForm.Id.$error']");
	By Select_category_opt     = By.xpath("//div[text()='A']");
	By Comments_ip             = By.xpath("//input[@name='Comments']");
	By Without_comments        = By.xpath("//div[@ng-messages='rowForm.Comments.$error']");
	By Save_btn_click          = By.xpath("//button[@ng-click='addplantationCategory(req)']");
	By View_comments           = By.xpath("(//button[@ng-click='ViewComments(row)'])[2]");
	By Close_popup_win         = By.xpath("//md-icon[@aria-label='Close dialog']");

	public void the_user_has_entered(String username) throws Throwable {
		driver.get(prop.getProperty("url"));
        utilities.webDriverWait(driver, text);
		 driver.findElement(text).sendKeys(username);
		 utilities.MaximumWait(driver);
	}

	public void the_user_has_entered1(String password) throws Throwable {
		 utilities.webDriverWait(driver, code);
		 driver.findElement(code).sendKeys(password);
		 utilities.MaximumWait(driver);
	}

	public void User_click_on_the_signIn() throws Throwable {
		 utilities.webDriverWait(driver, Login);
		 driver.findElement(Login).click();
		 utilities.MaximumWait(driver);
	}

	public void User_navigated_to_the_home_page() throws Throwable {
		 utilities.webDriverWait(driver, dashboard);
		 WebElement message = driver.findElement(dashboard);
	     String actualMessage = message.getText();
	     System.out.println("Validation message: " + actualMessage);
		 utilities.MaximumWait(driver);
		 driver.findElement(sidebar_Ngt).click();
		 utilities.MaximumWait(driver);
	}

	public void Click_on_the_Activities_module_main_menu() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_clk);
		driver.findElement(Activities_menu_clk).click();
		utilities.MaximumWait(driver);
	}

	public void click_on_the_Setplantation_category_screen() throws Throwable {
		utilities.webDriverWait(driver, Set_plantation_menu);
		driver.findElement(Set_plantation_menu).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_financial_year_wise_data() throws Throwable {
		utilities.webDriverWait(driver, Select_financial_yr);
		driver.findElement(Select_financial_yr).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_finan_yr_opt).click();
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Select_location_type_from_the_Active_grid_data_details() throws Throwable {
		utilities.webDriverWait(driver, Sel_location_type);
		driver.findElement(Sel_location_type).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}

	public void check_with_the_Select_States_from_the_Dropdown_list_data_details() throws Throwable {
		utilities.webDriverWait(driver, Select_states_filter);
		driver.findElement(Select_states_filter).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_select_opt_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_select_opt_two).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Select_Districts_from_the_Dropdowm_list_data_details() throws Throwable {
		utilities.webDriverWait(driver, District_select_click);
		driver.findElement(District_select_click).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_err_tst);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_select_click).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_District_one).click();
		utilities.MinimumWait(driver);
		driver.findElement(Sel_district_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}

	public void check_with_the_Select_Mandal_from_the_Dropdown_list_data_details() throws Throwable {
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

	public void check_with_the_Select_Villages_from_the_Dropdown_list_data_details() throws Throwable {
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

	public void check_with_the_clicking_on_the_search_button_results() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MinimumWait(driver);
	}

	public void click_on_the_Add_plantation_category_button() throws Throwable {
		utilities.webDriverWait(driver, Add_Plantatation_click);
		driver.findElement(Add_Plantatation_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_plantation_catg).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Without_plantation_sel);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Select_plantation_catg).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_category_opt).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_Comments_Input_details() throws Throwable {
		utilities.webDriverWait(driver, Comments_ip);
		driver.findElement(Comments_ip).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(Without_comments);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(Comments_ip).sendKeys("Plantation category Added1~#");
		utilities.MaximumWait(driver);

	}

	public void check_with_the_Save_input_details() throws Throwable {
		utilities.webDriverWait(driver, Save_btn_click);
		driver.findElement(Save_btn_click).click();
		utilities.MaximumWait(driver);
	}

	public void check_with_the_View_Plantation_category_Comments_input_details() throws Throwable {
		utilities.webDriverWait(driver, View_comments);
		driver.findElement(View_comments).click();
		utilities.MaximumWait(driver);
		driver.findElement(Close_popup_win).click();
		utilities.MaximumWait(driver);

	}

}
