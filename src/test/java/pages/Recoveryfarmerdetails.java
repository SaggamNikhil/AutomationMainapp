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
		driver.findElement(Search_farmer_click).sendKeys("123");
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
        searchField.sendKeys("145");
        utilities.MaximumWait(driver);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        try {
            List<WebElement> suggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(Auto_suggestions));
            System.out.println("Number of suggestions found: " + suggestions.size());
            for (WebElement suggestion : suggestions) {
                System.out.println("Suggestion text: " + suggestion.getText());
                if (suggestion.getText().contains("145")) {
                    suggestion.click();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Exception while waiting for suggestions: " + e.getMessage());
        }
        utilities.MaximumWait(driver);
    }



	public void check_with_the_add_recoveryfarmers_by_using_Add_action_button() throws Throwable {
		utilities.webDriverWait(driver, Recovery_farmer_one_clk);
        driver.findElement(Recovery_farmer_one_clk).sendKeys("145");
       // utilities.MaximumWait(driver);

      
}
}

