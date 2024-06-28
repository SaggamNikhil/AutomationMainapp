package pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class UnderPlanting extends DriverFactory{
	Utilities utilities        = new Utilities();
	By text                    = By.xpath("//input[@type='text']");
  	By code                    = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By dashboard               = By.xpath("//section[@class='content-header']");
	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_clk     = By.xpath("//span[text()='Activities']");
  	By Underplanting_menu      = By.xpath("//a[@href='#/initiatedUnderPlantingPlot']");
  	By Selec_location_type     = By.xpath("//md-select[@name='GeoLocations']");
  	By Select_States_filt      = By.xpath("//md-select[@ng-model='GeoLocation.StateIds']");
  	By Select_State_one        = By.xpath("//div[text()='Andhra Pradesh - AP']");
  	By Select_State_two        = By.xpath("//div[text()='Arunachal Pradesh - AR']");
  	By District_select_click   = By.xpath("//md-select[@name='DistrictIds']");
	By District_err_msg        = By.xpath("//div[@ng-messages='rowForm.DistrictIds.$error']");
	By Sel_District_one        = By.xpath("//div[text()='EAST GODAVARI - EG']");
	By Sel_district_two        = By.xpath("//div[text()='L/Dibang Valley - LD']");
	By Mandal_select_clk       = By.xpath("//md-select[@ng-model='GeoLocation.MandalIds']");
	By Mandals_err_msg         = By.xpath("//div[@ng-messages='rowForm.MandalIds.$error']");
	By Mndal_selec_one         = By.xpath("//div[text()='Devarapalli-II - DA']");
	By Mndal_selec_two         = By.xpath("//div[text()='Roing - RN']");
	By Village_selec_clk       = By.xpath("//md-select[@ng-model='GeoLocation.VillageIds']");
	By Villages_err_msg        = By.xpath("//div[@ng-messages='rowForm.VillageIds.$error']");
	By villages_sele_one       = By.xpath("(//div[text()='Alumo - AL'])[1]");
	By villages_sele_two       = By.xpath("(//div[text()='Yernagudem - YG'])[2]");
	By From_date_sel           = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]");
	By Fromdate_tsg_msg        = By.xpath("//div[text()='The entered value is not a date!']");
	By Search_btn_click        = By.xpath("//button[@ng-click='initUnderplating(request)']");
	By Initiate_underplanting  = By.xpath("//a[@href='#/initiatedUnderplantingPlotDetails']");
	By Search_farmer           = By.xpath("//input[@aria-label='Select Farmer']");
	By With_out_search_farmer  = By.xpath("//div[@ng-messages='autocompleteForm.autocompleteField.$error']");
	By Auto_suggestions        = By.xpath("//ul[contains(@class, 'md-autocomplete-suggestions')]/li");
	By Selected_farmer_plot_c  = By.xpath("(//md-checkbox[@ng-model='row.isSelected'])[1]");
  	By Total_plot_area_ip      = By.xpath("//input[@name='TotalPlotArea']");
  	By Without_plot_area       = By.xpath("//div[@ng-messages='plotForm.TotalPlotArea.$error']");
  	By Total_palm_area_ip      = By.xpath("//input[@name='TotalPalmArea']");
  	By Expected_month_date     = By.xpath("//input[@class='md-datepicker-input md-input']");  
  	By Without_month_date      = By.xpath("//div[@ng-messages='plotForm.PlantingMonth.$error']");
  	By Address_one_ip_check    = By.xpath("//input[@name='AddressLine1']");
  	By land_mark_ip            = By.xpath("//input[@name='Landmark']");
  	By pdf_upload              = By.xpath("//input[@id='fileToUploadForm']");
  	By Underplanting_reason    = By.xpath("//md-select[@name='UnderPlantingReasonTypeId']");
  	By Without_Up_reason       = By.xpath("//div[@ng-messages='underForm.UnderPlantingReasonTypeId.$error']");
    By Approx_current_tress    = By.xpath("//md-select[@name='TreesHeightTypeId']");
    By Without_Approx_tress    = By.xpath("//div[@ng-messages='underForm.TreesHeightTypeId.$error']");
    By Harvesting_ip           = By.xpath("//md-select[@name='HarvestTypeId']");
    By without_harvest_ip      = By.xpath("//div[@ng-messages='underForm.HarvestTypeId.$error']");
    By uprooting_current_plan  = By.xpath("//input[@name='UprootingCurrentPlantationPlan']");
    By Without_uproot          = By.xpath("//div[@ng-messages='underForm.UprootingCurrentPlantationPlan.$error']");
    By Save_details            = By.xpath("//button[@ng-click='saveUnderplanting()']");
  	
	public void the_user_has_entered_a(String username) throws Throwable {
		driver.get(prop.getProperty("url"));
        utilities.webDriverWait(driver, text);
		 driver.findElement(text).sendKeys(username);
		 utilities.MaximumWait(driver);
	}


	public void the_user_has_entered1_a(String password) throws Throwable {
		 utilities.webDriverWait(driver, code);
		 driver.findElement(code).sendKeys(password);
		 utilities.MaximumWait(driver);
	}


	public void User_click_on_the_LogIn_button() throws Throwable {
		 utilities.webDriverWait(driver, Login);
		 driver.findElement(Login).click();
		 utilities.MaximumWait(driver);		
	}


	public void the_User_navigated_to_the_home_page() throws Throwable {
		 utilities.webDriverWait(driver, dashboard);
		 WebElement message = driver.findElement(dashboard);
	     String actualMessage = message.getText();
	     System.out.println("Validation message: " + actualMessage);
		 utilities.MaximumWait(driver);
		 driver.findElement(sidebar_Ngt).click();
		 utilities.MaximumWait(driver);		
	}


	public void click_on_the_dashoboard_menu_as_Activities() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_clk);
		driver.findElement(Activities_menu_clk).click();
		utilities.MaximumWait(driver);
	}


	public void click_on_the_Underplanting_menu_screen() throws Throwable {
		utilities.webDriverWait(driver, Underplanting_menu);
		driver.findElement(Underplanting_menu).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_location_type_wise_details() throws Throwable {
		utilities.webDriverWait(driver, Selec_location_type);
		driver.findElement(Selec_location_type).click();
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
		utilities.MinimumWait(driver);
	}


	public void check_with_the_Select_State_selection_wise_details() throws Throwable {
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


	public void check_with_the_Select_District_wise_details() throws Throwable {
		utilities.webDriverWait(driver, District_select_click);
		driver.findElement(District_select_click).click();
		utilities.MinimumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    WebElement message = driver.findElement(District_err_msg);
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


	public void check_with_the_Select_Mandal_wise_details() throws Throwable {
		utilities.webDriverWait(driver, Mandal_select_clk);
		driver.findElement(Mandal_select_clk).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Mandals_err_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Mandal_select_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mndal_selec_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(Mndal_selec_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_Villages_wise_details() throws Throwable {
		utilities.webDriverWait(driver, Village_selec_clk);
		driver.findElement(Village_selec_clk).click();
		utilities.MaximumWait(driver);
		Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_TAB);
	    utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Villages_err_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		driver.findElement(Village_selec_clk).click();
		utilities.MaximumWait(driver);
		driver.findElement(villages_sele_one).click();
		utilities.MaximumWait(driver);
		driver.findElement(villages_sele_two).click();
		Robot r1= new Robot();
		r1.keyPress(KeyEvent.VK_TAB);
		utilities.MaximumWait(driver);
	}

	public void check_with_the_From_date_selection_validations_details() throws Throwable {
		utilities.webDriverWait(driver, From_date_sel);
		driver.findElement(From_date_sel).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_sel).sendKeys("01/023/2024");
		utilities.MaximumWait(driver);
	    WebElement message = driver.findElement(Fromdate_tsg_msg);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
		driver.findElement(From_date_sel).clear();
		utilities.MaximumWait(driver);
		driver.findElement(From_date_sel).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}
	public void check_with_the_Click_on_the_search_button_from_the_Underplanting_screen() throws Throwable {
		utilities.webDriverWait(driver, Search_btn_click);
		driver.findElement(Search_btn_click).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Click_on_the_Initiate_Underplanting_action_button() throws Throwable {
		utilities.webDriverWait(driver, Initiate_underplanting);
		driver.findElement(Initiate_underplanting).click();
		utilities.MaximumWait(driver);
	}


	public void Check_with_the_Select_Farmer_search_input_details() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer);
		driver.findElement(Search_farmer).click();
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).sendKeys("145");
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_search_farmer);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
        WebElement searchField = driver.findElement(Search_farmer);
        searchField.sendKeys("177");
        utilities.MaximumWait(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
        System.out.println("Number of suggestions found: " + suggestions.size());
        for (WebElement suggestion : suggestions) {
        System.out.println("Suggestion text: " + suggestion.getText());
        if (suggestion.getText().contains("177")) {
            suggestion.click();
        break;
            }
            }
        } catch (Exception e) {
            System.out.println("Exception while waiting for suggestions: " + e.getMessage());
        }
        utilities.MaximumWait(driver);
	}


	public void check_with_the_Select_plot_from_the_underplanting_screen() throws Throwable {
		utilities.webDriverWait(driver, Selected_farmer_plot_c);
		driver.findElement(Selected_farmer_plot_c).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_plot_details_by_Total_Plot_area_ip_details() throws Throwable {
		utilities.webDriverWait(driver, Total_plot_area_ip);
		driver.findElement(Total_plot_area_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area_ip).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_plot_area);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_plot_area_ip).sendKeys("0.03s");
		utilities.MaximumWait(driver);	
	}


	public void check_with_the_Plot_details_by_Total_Plam_area_ip_details() throws Throwable {
		utilities.webDriverWait(driver, Total_palm_area_ip);
		driver.findElement(Total_palm_area_ip).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_palm_area_ip).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_palm_area_ip).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_plot_area);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_palm_area_ip).sendKeys("0.02s");
		utilities.MaximumWait(driver);	
	}


	public void check_with_the_Expected_month_of_Underplanting_tress_Date_selection() throws Throwable {
		utilities.webDriverWait(driver, Expected_month_date);
		driver.findElement(Expected_month_date).click();
		utilities.MaximumWait(driver);
		driver.findElement(Expected_month_date).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(Without_month_date);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Expected_month_date).sendKeys("01/07/2024");
		utilities.MaximumWait(driver);

	}


	public void check_with_the_Address_one_input_details() throws Throwable {
		utilities.webDriverWait(driver, Address_one_ip_check);
		WebElement inputElement = driver.findElement(Address_one_ip_check);
	    String inputValue = inputElement.getAttribute("value");
		if (inputValue != null && !inputValue.isEmpty()) {
		System.out.println("Current Landlord Name: " + inputValue);
		        } 
		else {
		        inputElement.clear();
		        }
		        utilities.MaximumWait(driver);
		driver.findElement(Address_one_ip_check).clear();
        utilities.MaximumWait(driver);
		driver.findElement(Address_one_ip_check).sendKeys("test user one1");
        utilities.MaximumWait(driver);
	}


	public void check_with_the_Landmark_field_input_details() throws Throwable {
		utilities.webDriverWait(driver, land_mark_ip);
		driver.findElement(land_mark_ip).click();
        utilities.MaximumWait(driver);
        WebElement message = driver.findElement(land_mark_ip);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
		driver.findElement(land_mark_ip).clear();
        utilities.MaximumWait(driver);
        driver.findElement(land_mark_ip).sendKeys("Landed area one");
        utilities.MaximumWait(driver);  

	}

	public void check_with_the_file_upload_application_for_underplanting() throws Throwable {
		utilities.webDriverWait(driver, pdf_upload);
		driver.findElement(pdf_upload).sendKeys("D:/3f/Img/sample.pdf");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Underplanting_reason_dropdown_selection() throws Throwable {
		utilities.webDriverWait(driver, Underplanting_reason);
		driver.findElement(Underplanting_reason).click();
        utilities.MaximumWait(driver);
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}


	public void check_with_the_Approx_height_of_current_tress_details() throws Throwable {
		utilities.webDriverWait(driver, Approx_current_tress);
		driver.findElement(Approx_current_tress).click();
        utilities.MaximumWait(driver);
		Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}


	public void check_with_the_Harvesting_method_dropdown_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Harvesting_ip);
		driver.findElement(Harvesting_ip).click();
        utilities.MaximumWait(driver);
    	Robot t = new Robot();
		t.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		t.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

	}


	public void check_with_the_Plan_for_uprooting_current_plantation_details() throws Throwable {
		utilities.webDriverWait(driver, uprooting_current_plan);
		driver.findElement(uprooting_current_plan).click();
        utilities.MaximumWait(driver);
        driver.findElement(uprooting_current_plan).sendKeys("test data");
        utilities.MaximumWait(driver);
        driver.findElement(uprooting_current_plan).clear();
        WebElement message = driver.findElement(Without_uproot);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
        utilities.MaximumWait(driver);
        driver.findElement(uprooting_current_plan).sendKeys("New comments");
        utilities.MaximumWait(driver);


	}


	public void Check_with_the_Clicking_on_the_Save_butoon_details() throws Throwable {
		utilities.webDriverWait(driver, Save_details);
		driver.findElement(Save_details).click();
        utilities.MaximumWait(driver);
	}




}
