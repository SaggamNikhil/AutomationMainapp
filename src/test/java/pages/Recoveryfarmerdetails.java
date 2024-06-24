package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import util.DriverFactory;
import util.Utilities;

public class Recoveryfarmerdetails extends DriverFactory  {
     Utilities utilities = new Utilities();
     
    By username                = By.xpath("//input[@type='text']");
  	By password                = By.xpath("//input[@type='password']");
  	By Login                   = By.xpath("//div[@class='col-xs-12 text-center']//button[@class='btn btn-theme']/i");
  	By sidebar_Ngat            = By.xpath("//a[@class='sidebar-toggle']");
  	By Activities_menu_click   = By.xpath("//span[text()='Activities']");
  	By recovery_farmer_click   = By.xpath("//a[@href='#/Recovery']");
  	By Form_date_Cl            = By.xpath("(//input[@class='md-datepicker-input md-input'])[1]"); 
  	By Invalid_date_format     = By.xpath("//div[text()='The entered value is not a date!']");
  	By Search_button_clk       = By.xpath("//button[@ng-click='initMainFarmer()']");
  	By Click_Addfarmer_btn     = By.xpath("//a[@href='#/AddRecoveryFarmers']");
  	By Search_farmer_click     = By.xpath("(//input[@aria-label='Select Farmer'])[1]");
  	By With_out_search_farmer  = By.xpath("//div[@ng-messages='addForm.autocompleteField.$error']");
  	By Auto_suggestions        = By.xpath("//ul[contains(@class, 'md-autocomplete-suggestions')]/li"); 
  	By Recovery_farmer_one_clk = By.xpath("(//input[@aria-label='Select Farmer'])[2]");
  	By Select_recovery_f_one   = By.xpath("(//md-autocomplete-parent-scope[@class='ng-scope'])[4]");
  	By farmer_one_save         = By.xpath("//button[@ng-click='SaveRecoveyFarmers()']");
  	By Click_Edit_button       = By.xpath("(//a[@href='#/EditRecoveryFarmers'])[2]");
  	By Click_on_add_button     = By.xpath("//button[@ng-click='addRecoveryFarmer($index)']");
  	By Search_recovery_f_one   = By.xpath("//input[@aria-label='Select Farmer']"); 
  	By select_farmer           = By.xpath("(//li[@ng-click='$mdAutocompleteCtrl.select($index)'])[1]");
  	By update_click            = By.xpath("//button[@ng-click='SaveRecoveyFarmers()']");
  	By Select_same_recovery_f  = By.xpath("//input[@aria-label='Select Farmer']");
  	By Select_recovery_f_opt   = By.xpath("(//md-autocomplete-parent-scope[@class='ng-scope'])[1]");
  	By addRecoveryFarmerButton = By.cssSelector("button.btn.btn-sm.btn-theme[ng-click='addRecoveryFarmer($index)']");
  	By Cancel_click_btn        = By.xpath("//a[@ng-click='Cancel()']");
  	By Delete_button_click     = By.xpath("(//button[@ng-click='deleteRecoverFarmer(row)'])[1]");
    By Confirmation_del_action = By.xpath("//button[@ng-click='dialog.hide()']");
  	
  	
  	
  	
	public void the_user_signin_with_the_Respective_role_details() throws Throwable {
		driver.get(prop.getProperty("url"));
		utilities.webDriverWait(driver, Login);
		utilities.webDriverWait(driver, username);
		driver.findElement(username).sendKeys("admin");
		driver.findElement(password).sendKeys("P@ssw0rd");
		utilities.webDriverWait(driver, Login);
		driver.findElement(Login).click();
		utilities.MaximumWait(driver);
	}



	public void the_page_will_Navigate_to_the_Dashboard_screen_of_the_main_page() throws Throwable {
		utilities.webDriverWait(driver, sidebar_Ngat);
		driver.findElement(sidebar_Ngat).click();
		utilities.MinimumWait(driver);
	}



	public void click_on_the_menu_as_a_Activities_module() throws Throwable {
		utilities.webDriverWait(driver, Activities_menu_click);
		driver.findElement(Activities_menu_click).click();
		utilities.MinimumWait(driver);
	}



	public void click_on_the_Recovery_farmer_details_screen() throws Throwable {
		utilities.webDriverWait(driver, recovery_farmer_click);
		driver.findElement(recovery_farmer_click).click();
		utilities.MinimumWait(driver);
	}



	public void check_with_the_From_date_selection_from_the_Recovery_farmer_details_screen() throws Throwable {
		utilities.webDriverWait(driver, Form_date_Cl);
		driver.findElement(Form_date_Cl).clear();
		utilities.MinimumWait(driver);
		driver.findElement(Form_date_Cl).sendKeys("01/023/2024");
		utilities.MinimumWait(driver);
	    WebElement message = driver.findElement(Invalid_date_format);
	    String actualMessage = message.getText();
	    System.out.println("Validation message: " + actualMessage);
		utilities.MinimumWait(driver);
		driver.findElement(Form_date_Cl).clear();
		utilities.MaximumWait(driver);
		driver.findElement(Form_date_Cl).sendKeys("01/01/2020");
		utilities.MaximumWait(driver);
	}



	public void check_with_the_click_on_the_search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_button_clk);
		driver.findElement(Search_button_clk).click();
		utilities.MaximumWait(driver);
	}



	public void click_on_the_Add_recovery_farmer_action_button() throws Throwable {
		utilities.webDriverWait(driver, Click_Addfarmer_btn);
		driver.findElement(Click_Addfarmer_btn).click();
		utilities.MaximumWait(driver);
	}



	public void check_with_the_click_on_the_Search_button() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer_click);
		driver.findElement(Search_farmer_click).click();
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer_click).sendKeys("145");
		utilities.MaximumWait(driver);
		driver.findElement(Search_farmer_click).clear();
		utilities.MaximumWait(driver);
		WebElement message = driver.findElement(With_out_search_farmer);
		String actualMessage = message.getText();
		System.out.println("Validation message: " + actualMessage);
		utilities.MaximumWait(driver);

	}

	public void select_farmer_from_the_auto_suggestion_key_list() throws Throwable {
		utilities.webDriverWait(driver, Search_farmer_click);
        WebElement searchField = driver.findElement(Search_farmer_click);
        searchField.sendKeys("159");
        utilities.MaximumWait(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
            System.out.println("Number of suggestions found: " + suggestions.size());
            for (WebElement suggestion : suggestions) {
                System.out.println("Suggestion text: " + suggestion.getText());
                if (suggestion.getText().contains("159")) {
                    suggestion.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception while waiting for suggestions: " + e.getMessage());
        }
        utilities.MaximumWait(driver);
    }

	public void select_duplicate_Main_farmer_from_the_auto_suggestion_key_list() throws Throwable {
		WebElement searchField = driver.findElement(Search_farmer_click);
		searchField.sendKeys("146");
		utilities.MaximumWait(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		boolean suggestionClicked = false;

		try {
		    do {
		        List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
		        System.out.println("Number of suggestions found: " + suggestions.size());
		        
		        for (WebElement suggestion : suggestions) {
		            System.out.println("Suggestion text: " + suggestion.getText());
		            if (suggestion.getText().contains("177")) {
		                suggestion.click();
		                suggestionClicked = true;
		                break;
		            }
		        }

		        if (!suggestionClicked) {
		            // Clear the search field and try again with a new value
		            searchField.clear();
		            searchField.sendKeys("177");
		        }

		    } while (!suggestionClicked);
		} catch (Exception e) {
		    System.out.println("Exception while waiting for suggestions: " + e.getMessage());
		}

		utilities.MaximumLongWait(driver);

	}
	public void check_with_the_add_recoveryfarmers_by_using_Add_action_button() throws Throwable {
		utilities.webDriverWait(driver, Recovery_farmer_one_clk);
        driver.findElement(Recovery_farmer_one_clk).sendKeys("149");
        utilities.MaximumWait(driver);
        driver.findElement(Select_recovery_f_one).click();
        utilities.MaximumWait(driver);
}

	public void click_on_the_Save_button_for_farmer_one() throws Throwable {
		utilities.webDriverWait(driver, farmer_one_save);
        driver.findElement(farmer_one_save).click();
        utilities.MaximumWait(driver);
	}



	public void check_with_active_grid_Edit_button_click() throws Throwable {
		utilities.webDriverWait(driver, Click_Edit_button);
        driver.findElement(Click_Edit_button).click();
        utilities.MaximumWait(driver);
	}



	public void check_with_the_Add_button_with_update_details() throws Throwable {
		utilities.webDriverWait(driver, Click_on_add_button);
        driver.findElement(Click_on_add_button).click();
        utilities.MaximumWait(driver);
	}



	public void check_with_the_Search_recovery_farmer() throws Throwable {
		utilities.webDriverWait(driver, Search_recovery_f_one);
        driver.findElement(Search_recovery_f_one).click();
        utilities.MaximumWait(driver);
        driver.findElement(Search_recovery_f_one).sendKeys("169");
        utilities.MaximumWait(driver);
        driver.findElement(select_farmer).click();
        utilities.MaximumWait(driver);


	}



	public void click_on_the_update_button() throws Throwable {
		utilities.webDriverWait(driver, update_click);
        driver.findElement(update_click).click();
        utilities.MaximumWait(driver);
	}



	public void check_with_same_recover_farmer_into_another_index() throws Throwable {
      String[] farmerNames = {"Vengala Reddy Nukaraju", "Raju Achanta", "farmer plot three", "Sivanarayana Reddy jakka",};
        for (String farmerName : farmerNames) {
            utilities.webDriverWait(driver, Select_same_recovery_f);
            driver.findElement(Select_same_recovery_f).click();
            utilities.MaximumWait(driver);
            driver.findElement(Select_same_recovery_f).sendKeys(farmerName);
            utilities.MaximumWait(driver);
            driver.findElement(Select_recovery_f_opt).click();
            utilities.MaximumWait(driver);
            driver.findElement(addRecoveryFarmerButton).click();
            utilities.MaximumWait(driver);
        }
    }



	public void click_on_the_Cancel_button_the_page_will_be_navigated_to_the_Recovery_farmer_list_screen() throws Throwable {
		utilities.webDriverWait(driver, Cancel_click_btn);
        driver.findElement(Cancel_click_btn).click();
        utilities.MaximumWait(driver);
	}



	public void check_with_grid_delete_action_button() throws Throwable {
		utilities.webDriverWait(driver, Delete_button_click);
        driver.findElement(Delete_button_click).click();
        utilities.MaximumWait(driver);
        driver.findElement(Confirmation_del_action).click();
        utilities.MaximumWait(driver);
	}
	}

