package stepDefinition;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.Vehicle;
import pageObjects.homePage;
import utilities.reportGenerator;

public class tc5_SelectPriceOption extends reportGenerator 
{	
	homePage home;
	Vehicle vehicle  = new Vehicle(hooks.driver);
	
	@When("the user selects a price option")
	public void the_user_selects_a_price_option() throws InterruptedException 
	{
		test = extent.startTest("Test 5");
		home = new homePage(hooks.driver);
		System.out.println("User in the price data page");
		Thread.sleep(3000);
		
		vehicle.clickOption2();
			    
	}
	
	@Then("the user allowed to click the next page")
	public void the_user_allowed_to_click_the_next_page() throws InterruptedException 
	{
		vehicle.nextQuote();		
	    test.log(LogStatus.PASS,"test 5 pass");
	    Allure.step("Passed");
	    Thread.sleep(1000);	
	}
}
