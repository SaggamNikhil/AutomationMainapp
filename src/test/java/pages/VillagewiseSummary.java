package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import util.DriverFactory;
import util.Utilities;

	
public class VillagewiseSummary extends DriverFactory {
	Utilities utilities       = new Utilities();
	By username               = By.xpath("//input[@type='text']");
	By password               = By.xpath("//input[@type='password']");
	By Login                  = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
	By sidebar                = By.xpath("//a[@class='sidebar-toggle']");
	By snapshot               = By.xpath("//span[text()='Snapshot']");
	By Villagewisesummary_cli = By.xpath("//a[@href='#/farmerPlots']");
	By Select_Location_click  = By.xpath("(//div[text()='GeoLocations'])[1]");
	By Click_mouse_on_grid    = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By State_select_c         = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
	By Select_state_opt       = By.xpath("//div[text()='AP - Andhra Pradesh']");
	By Click_side_butt        = By.xpath("//body/md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By District_select        = By.xpath("//md-select[@name='DistrictIds']");
	By option_select_D        = By.xpath("//div[text()='VN - Vizianagaram']");
	By Side_cl_grid_b         = By.xpath("//body[@class='skin-red sidebar-mini sidebar-collapse']//header[@class='main-header']");
	By Mandal_select_c        = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By select_mandal_opt      = By.xpath("//div[text()='SK - S.Kota']");
	By cl_side_btn_c          = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By village_select_c       = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By select_village_opt     = By.xpath("//div[text()='AG - Alugubilli']");
	By Click_sd_btn           = By.xpath("//md-backdrop[@class='md-select-backdrop md-click-catcher ng-scope']");
	By By_search              = By.xpath("//button[@ng-click='getReport(request)']");
	By Export_cl              = By.xpath("//button[@ng-click='exportToExcel()']");
	By Enable_click           = By.xpath("(//button[@ng-click='toggleFilter()'])[2]");
	By Fliter_by_vill         = By.xpath("//input[@name='VillageName']");
	By Disable_cli            = By.xpath("//button[@ng-show='isFiltersEnabled']");
	
	By State_select_opt       = By.xpath("//md-select[@aria-label='State']");
	By State_opt_ap           = By.xpath("//div[text()='AP - Andhra Pradesh']");
	By State_opt_ar           = By.xpath("//div[text()='AR - Arunachal Pradesh']");
	By District_select_opt    = By.xpath("//md-select[@name='DistrictIds']");
	By District_non_select    = By.xpath("//div[@ng-messages='rowform.DistrictIds.$error']");
	By Dist_opt_first         = By.xpath("//div[text()='EG - EAST GODAVARI']");
	By Dist_opt_Second        = By.xpath("//div[text()='LD - L/Dibang Valley']");
	By Mandal_select_opt      = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandal_non_select      = By.xpath("//div[@ng-messages='rowform.MandalIds.$error']");
	By mdl_opt_first          = By.xpath("//div[text()='NB - Nallajarla-II']");
	By mdl_opt_second         = By.xpath("//div[text()='RN - Roing']");
	By Village_select_opt     = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By village_non_select     = By.xpath("//div[@ng-messages='rowform.VillageIds.$error']");
	By Vill_opt_first         = By.xpath("//div[text()='AC - Achannapalem']");
	By Vill_opt_second        = By.xpath("//div[text()='AO - Arango']");
	By select_loc_click       = By.xpath("//md-select[@ng-model='Geo']");
	By Select_loc_change      = By.xpath("//div[text()='Cluster']");
	By select_clusters_sel    = By.xpath("//md-select[@ng-model='GeoLocation.ClusterIds']");
	By select_cluster_first   = By.xpath("(//div[text()='Kota - KO'])[1]");
	By select_cluster_second  = By.xpath("(//div[text()='Telikicherla - TK'])[1]"); 
	By search_by_cluster      = By.xpath("//button[@ng-click='getReport(request)']");
	
	public void User_First_in_login_page() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MinimumWait(driver);
	}
	public void Navigate_to_the_Dashboard_page_details() throws Throwable {
		utilities.webDriverWait(driver, sidebar);
		driver.findElement(sidebar).click();
		utilities.MinimumWait(driver);
		}
	public void the_user_click_on_the_snapshot_module() throws Throwable {
		utilities.webDriverWait(driver, snapshot);
		driver.findElement(snapshot).click();
		utilities.MinimumWait(driver);
		
	}
	public void Click_on_the_Village_wise_summary_screen() throws Throwable {
		utilities.webDriverWait(driver, Villagewisesummary_cli);
		driver.findElement(Villagewisesummary_cli).click();
		utilities.MinimumWait(driver);
	}
	public void Select_Location_type_from_the_grid() throws Throwable {
		utilities.webDriverWait(driver, Select_Location_click);
		driver.findElement(Select_Location_click).click();
		driver.findElement(Click_mouse_on_grid).click();
		utilities.MinimumWait(driver);

	}
	public void Select_States_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, State_select_c);
		driver.findElement(State_select_c).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_state_opt).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
		
	}
	public void Select_District_from_the_dropdown_option() throws Throwable {
	    utilities.webDriverWait(driver, District_select);
	    driver.findElement(District_select).click();
	    utilities.MinimumWait(driver);
	    driver.findElement(option_select_D).click();
	    utilities.MinimumWait(driver);
	    // Create a Robot instance to perform non-browser specific actions
	    Robot r = new Robot();
	    // Press the Escape key to close the dropdown or dismiss any pop-ups
	    r.keyPress(KeyEvent.VK_ESCAPE);
	    // Wait for the UI to respond to the Escape key action
	    utilities.MaximumWait(driver);
	}

	public void Select_Mandal_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_c);
		driver.findElement(Mandal_select_c).click();
		utilities.MinimumWait(driver);
		driver.findElement(select_mandal_opt).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
		
	}
	public void Select_Village_from_the_dropdown_field() throws Throwable {
		utilities.webDriverWait(driver, village_select_c);
		driver.findElement(village_select_c).click();
		utilities.MinimumWait(driver);
		driver.findElement(select_village_opt).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
	}
	public void Click_on_the_grid_Search_button() throws Throwable {
		utilities.webDriverWait(driver, By_search);
		driver.findElement(By_search).click();
		utilities.MinimumWait(driver);
	}
	public void Click_on_the_Export_action_button() throws Throwable {
		utilities.webDriverWait(driver, Export_cl);
		driver.findElement(Export_cl).click();
		utilities.MinimumWait(driver);
	}
	public void Click_on_the_Enable_Filter_Result() throws Throwable {
		utilities.webDriverWait(driver, Enable_click);
		driver.findElement(Enable_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Fliter_by_vill).sendKeys("Ar");
		utilities.MaximumWait(driver);
		driver.findElement(Fliter_by_vill).sendKeys("cs");
		utilities.MaximumWait(driver);
		driver.findElement(Disable_cli).click();
		utilities.MaximumWait(driver);
	}
	public void Select_States_from_the_Dropdown_field_validations() throws Throwable {
		utilities.webDriverWait(driver, State_select_opt);
		driver.findElement(State_select_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_opt_ap).click();
		utilities.MaximumWait(driver);
		driver.findElement(State_opt_ar).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);

	}
	public void Select_Districts_from_the_Dropdown_field_Validations() throws Throwable {
		utilities.webDriverWait(driver, District_select_opt);
		driver.findElement(District_select_opt).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(District_non_select);
		 String actualMessage = message.getText();
		 System.out.println("Validation message: " + actualMessage);
		driver.findElement(District_select_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Dist_opt_first).click();
		utilities.MaximumWait(driver);
		driver.findElement(Dist_opt_Second).click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
	}
	public void select_Mandals_from_the_dropdown_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_opt);
		driver.findElement(Mandal_select_opt).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Mandal_non_select);
		 String actualMessage = message.getText();
		 System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_select_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(mdl_opt_first).click();
		utilities.MaximumWait(driver);
		driver.findElement(mdl_opt_second).click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
	}
	public void select_Villages_from_the_dropdown_field_validations() throws Throwable {
		utilities.webDriverWait(driver, Village_select_opt);
		driver.findElement(Village_select_opt).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(village_non_select);
		 String actualMessage = message.getText();
		 System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_select_opt).click();
		utilities.MaximumWait(driver);
		driver.findElement(Vill_opt_first).click();
		utilities.MaximumWait(driver);
		driver.findElement(Vill_opt_second).click();
		Robot r1 = new Robot();
		r1.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);
	}
	public void select_location_as_cluster() throws Throwable {
		utilities.webDriverWait(driver, select_loc_click);
		driver.findElement(select_loc_click).click();
		utilities.MinimumWait(driver);
		driver.findElement(Select_loc_change).click();
		utilities.MaximumWait(driver);

	}
	public void check_with_the_Cluster_selection() throws Throwable {
		utilities.webDriverWait(driver, select_clusters_sel);
		driver.findElement(select_clusters_sel).click();
		utilities.MinimumWait(driver);
		driver.findElement(select_cluster_first).click();
		utilities.MaximumWait(driver);
		driver.findElement(select_cluster_second).click();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		utilities.MaximumWait(driver);


	}
	public void check_with_the_search_button() throws Throwable {
		utilities.webDriverWait(driver, search_by_cluster);
		driver.findElement(search_by_cluster).click();
		utilities.MinimumWait(driver);
	}


}
