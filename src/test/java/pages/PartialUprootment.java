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

public class PartialUprootment extends DriverFactory {
	Utilities utilities = new Utilities();
	By username                = By.xpath("//input[@type='text']");
  	By password                = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By sidebar_Ngt             = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_click   = By.xpath("//span[text()='Activities']");
  	By Partial_uprootment_clk  = By.xpath("//a[@href='#/partialUprootment']");
  	By Search_farmer           = By.xpath("//input[@aria-label='Select Farmer']");
  	By without_search_farmer   = By.xpath("//div[@ng-messages='addForm.autocompleteField.$error']");
  	By Auto_suggestions        = By.xpath("//ul[contains(@class, 'md-autocomplete-suggestions')]/li");
  	By Select_farmer_plot      = By.xpath("(//div[@class='md-container md-ink-ripple'])[1]");
  	By Total_plot_area         = By.xpath("//input[@name='TotalPlotArea']");
  	By with_out_plot_area      = By.xpath("//div[@ng-messages='plotForm.TotalPlotArea.$error']");
  	By Total_Palm_area         = By.xpath("//input[@ng-model='plotDetails.TotalPalmArea']");
  	By Crop_In_Left_out_area   = By.xpath("//md-select[@ng-model='plotDetails.LeftOutAreaCropId']");
    By Select_crop_left_area_o = By.xpath("//div[text()='Cocoa Mature']");
    By Survey_number_ip        = By.xpath("//input[@name='SurveyNumber']");
    By With_out_survey_no      = By.xpath("//div[@ng-messages='plotForm.SurveyNumber.$error']");
    By Cropincome_select       = By.xpath("//md-select[@name='AnnualIncone']");
    By Checkbox_for_fencing    = By.xpath("//md-checkbox[@name='IsBoundryFencing']");
    By Is_plot_handled_care    = By.xpath("//md-checkbox[@name='IsPlotHandledByCareTaker']");
    By Caretaker_name_ip       = By.xpath("//input[@name='CareTakerName']");
    By Without_caretaker_name  = By.xpath("//div[@ng-messages='plotForm.CareTakerName.$error']");
    By Caretaker_mobile_no     = By.xpath("//input[@ng-model='plotDetails.CareTakerContactNumber']");
    By with_out_mobile_no      = By.xpath("//div[@ng-messages='plotForm.CareTakerContactNumber.$error']");
    By input_Field_Locator     = By.xpath("//input[@name='Landmark']");
    By plantation_Details_clk  = By.xpath("//button[@ng-click='addNewPlantationDetails()']");
    By Sapling_nursery_sele    = By.xpath("//md-select[@name='nurseryDetails']");
    By Sprouts_vendor_sel      = By.xpath("//md-select[@ng-model='details.PVDetails']");
    By origin_of_saplings_ip   = By.xpath("//md-select[@ng-model='details.PSDetails']");
    By Cross_drop_down_sel     = By.xpath("//md-select[@ng-model='details.PCDetails']");
    By Lifted_spalings         = By.xpath("//input[@ng-model='details.TreesCount']");
    By with_out_Lifted_sapling = By.xpath("//div[@ng-messages='addPlantationDetails.TreesCount.$error']");
    By planted_saplings_count  = By.xpath("//input[@ng-model='details.SaplingsPlanted']");
    By without_sap_count       = By.xpath("//div[@ng-messages='addPlantationDetails.SaplingsPlanted.$error']");
    By save_click              = By.xpath("//button[@aria-label='Save']");
    
	public void the_user_signin_with_the_Respective_role_credential_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}


	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_pages() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Ngt);
		driver.findElement(sidebar_Ngt).click();
		utilities.MaximumWait(driver);
	}


	public void click_on_the_dashboard_menu_as_Activities_module_name() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_click);
		driver.findElement(Activities_menu_click).click();
		utilities.MaximumWait(driver);
	}


	public void click_on_the_Partial_Uprootment_screen() throws Throwable {
		utilities.webDriverWait(driver, Partial_uprootment_clk);
		driver.findElement(Partial_uprootment_clk).click();
		utilities.MaximumWait(driver);
	}


	public void click_on_the_search_farmer_input_field() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer);
		driver.findElement(Search_farmer).click();
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).sendKeys("145");
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(without_search_farmer);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);
	
	}


	public void Select_farmer_from_the_auto_suggestion_keywords_list() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer);
        WebElement searchField = driver.findElement(Search_farmer);
        searchField.sendKeys("179");
        utilities.MaximumWait(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
            System.out.println("Number of suggestions found: " + suggestions.size());
            for (WebElement suggestion : suggestions) {
                System.out.println("Suggestion text: " + suggestion.getText());
                if (suggestion.getText().contains("179")) {
                    suggestion.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception while waiting for suggestions: " + e.getMessage());
        }
        utilities.MaximumWait(driver);
    }


	public void check_with_the_selected_farmer_plot_details() throws Throwable {
		utilities.webDriverWait(driver, Select_farmer_plot);
		driver.findElement(Select_farmer_plot).click();
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Total_plot_area_input_details() throws Throwable {
		utilities.webDriverWait(driver, Total_plot_area);
		driver.findElement(Total_plot_area).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_plot_area).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(with_out_plot_area);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Total_plot_area).sendKeys("1.5s");
		utilities.MaximumWait(driver);

	}


	public void check_with_the_Total_Palm_area_input_details() throws Throwable {
		utilities.webDriverWait(driver, Total_Palm_area);
		driver.findElement(Total_Palm_area).click();
		utilities.MaximumWait(driver);
		driver.findElement(Total_Palm_area).sendKeys("1.1214544898789798712365746468534635465844685746854");
		utilities.MaximumWait(driver);
		driver.findElement(Total_Palm_area).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Total_Palm_area).sendKeys("0.1s");
		utilities.MaximumWait(driver);
	}


	public void check_with_the_Crop_in_Left_out_area_dropdown_selection() throws Throwable {
		utilities.webDriverWait(driver, Crop_In_Left_out_area);
		driver.findElement(Crop_In_Left_out_area).click();
		utilities.MaximumWait(driver);
		driver.findElement(Select_crop_left_area_o).click();
		utilities.MaximumWait(driver);

	}


	public void Check_with_the_Survey_number_input_validations_details() throws Throwable {
		    utilities.webDriverWait(driver, Survey_number_ip);
		    String inputText = "1234567890123456789012345678901234567890123456789044";
		    driver.findElement(Survey_number_ip).sendKeys(inputText);
		    String actualValue = driver.findElement(Survey_number_ip).getAttribute("value");
		    int charactersEntered = actualValue.length();
		    System.out.println("Number of characters entered: " + charactersEntered);
            driver.findElement(Survey_number_ip).clear();
		    utilities.MaximumWait(driver);
		    WebElement message = driver.findElement(With_out_survey_no);
		    String actualMessage = message.getText().trim(); 
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(Survey_number_ip).sendKeys("123478");
		    utilities.MaximumWait(driver);
		}


	public void check_with_the_CropIncome_Dropdown_selection() throws Throwable {
		utilities.webDriverWait(driver, Cropincome_select);
		driver.findElement(Cropincome_select).click();
		utilities.MaximumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
        
	}
	public void check_with_the_Is_Boundary_fencing_checkbox_selection_field() throws Throwable {
		    utilities.webDriverWait(driver, Checkbox_for_fencing);
	        driver.findElement(Checkbox_for_fencing).click();
	        utilities.MaximumWait(driver);
		    }


	public void check_with_the_Is_plot_handled_by_care_taker_checkbox_selection_field() throws Throwable {
		 utilities.webDriverWait(driver, Is_plot_handled_care);
	        driver.findElement(Is_plot_handled_care).click();
	        utilities.MaximumWait(driver);
	}


	public void Validate_with_the_Caretaker_name_input_field() throws Throwable {
		    utilities.webDriverWait(driver, Caretaker_name_ip);
	        driver.findElement(Caretaker_name_ip).sendKeys("Ram");
	        utilities.MaximumWait(driver);
	        driver.findElement(Caretaker_name_ip).clear();
	        utilities.MaximumWait(driver);
	        WebElement message = driver.findElement(Without_caretaker_name);
		    String actualMessage = message.getText().trim(); 
		    System.out.println("Validation message: " + actualMessage);
		    driver.findElement(Caretaker_name_ip).sendKeys("Rana");
		    utilities.MaximumWait(driver);
		    driver.findElement(Caretaker_name_ip).clear();
		    utilities.MaximumWait(driver);
		    String inputText = "A while back I needed to count the amount of letters";
		    driver.findElement(Caretaker_name_ip).sendKeys(inputText);
		    String actualValue = driver.findElement(Caretaker_name_ip).getAttribute("value");
		    int charactersEntered = actualValue.length();
		    System.out.println("Number of characters entered: " + charactersEntered);
	}


	public void validate_with_the_Caretaker_mobile_number_details() throws Throwable {
		    utilities.webDriverWait(driver, Caretaker_mobile_no);
	        driver.findElement(Caretaker_mobile_no).sendKeys("12345");
	        utilities.MaximumWait(driver);
	        driver.findElement(Caretaker_mobile_no).clear();
	        WebElement message = driver.findElement(with_out_mobile_no);
		    String actualMessage = message.getText().trim(); 
		    System.out.println("Validation message: " + actualMessage);
	        utilities.MaximumWait(driver);
	        String inputText = "1234567890411";
		    driver.findElement(Caretaker_mobile_no).sendKeys(inputText);
		    String actualValue = driver.findElement(Caretaker_mobile_no).getAttribute("value");
		    int charactersEntered = actualValue.length();
		    System.out.println("Number of characters entered: " + charactersEntered);
	        utilities.MaximumWait(driver);


	}


	public void check_with_the_landmark_input_details() throws Throwable {
		    utilities.webDriverWait(driver, input_Field_Locator);
		    WebElement inputField = driver.findElement(input_Field_Locator);
	        utilities.MaximumWait(driver);
		    String inbuiltText = inputField.getAttribute("value");
		    System.out.println("Inbuilt text in the input field: " + inbuiltText);
	        utilities.MaximumWait(driver);

		}


	public void Click_on_the_Plantation_Details_action_button() throws Throwable {
		utilities.webDriverWait(driver, plantation_Details_clk);
        driver.findElement(plantation_Details_clk).click();
        utilities.MaximumWait(driver);
	}


	public void check_with_the_Sapling_nursery_dropdown_input_selection() throws Throwable {
		utilities.webDriverWait(driver, Sapling_nursery_sele); 
		driver.findElement(Sapling_nursery_sele).click();
        utilities.MaximumWait(driver);
        Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);

	}


	public void check_with_the_Sprouts_vendor_input_details() throws Throwable {
		utilities.webDriverWait(driver, Sprouts_vendor_sel); 
		driver.findElement(Sprouts_vendor_sel).click();
        utilities.MaximumWait(driver);
        Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}


	public void check_with_the_Origin_of_saplings_input_selection_details() throws Throwable {
		utilities.webDriverWait(driver, origin_of_saplings_ip); 
		driver.findElement(origin_of_saplings_ip).click();
		utilities.MinimumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}


	public void check_with_the_Cross_dropdown_input_selection_details() throws Throwable {
		utilities.webDriverWait(driver, Cross_drop_down_sel); 
		driver.findElement(Cross_drop_down_sel).click();
		utilities.MinimumWait(driver);
		Robot s = new Robot();
		s.keyPress(KeyEvent.VK_DOWN);
		utilities.MinimumWait(driver);
		s.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
	}


	public void check_with_the_Lifted_saplings_Input_details() throws Throwable {
		utilities.webDriverWait(driver, Lifted_spalings); 
		driver.findElement(Lifted_spalings).sendKeys("5");
		utilities.MinimumWait(driver);
		driver.findElement(Lifted_spalings).clear();
		WebElement message = driver.findElement(with_out_Lifted_sapling);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(Lifted_spalings).sendKeys("3");
		utilities.MinimumWait(driver);

		
		
	}


	public void check_with_the_Planted_saplings_input_details() throws Throwable {
		utilities.webDriverWait(driver, planted_saplings_count); 
		driver.findElement(planted_saplings_count).sendKeys("5");
		utilities.MinimumWait(driver);
		driver.findElement(planted_saplings_count).clear();
		WebElement message = driver.findElement(without_sap_count);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		driver.findElement(planted_saplings_count).sendKeys("3");
		utilities.MinimumWait(driver);
	}


	public void click_on_the_Save_button() throws Throwable {
		utilities.webDriverWait(driver, planted_saplings_count); 
		driver.findElement(planted_saplings_count).sendKeys("5");
		utilities.MinimumWait(driver);
	}
		
	}



