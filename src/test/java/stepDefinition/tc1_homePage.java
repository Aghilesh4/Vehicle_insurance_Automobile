package stepDefinition;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.homePage;
import utilities.reportGenerator;


public class tc1_homePage extends reportGenerator
{
	@Given("the user in the home page")
	public void the_user_in_the_home_page() 
	{		
		test = extent.startTest("Test 1");
	    System.out.println("User in HOME PAGE");
	}
	
	@When("user launches the home page")
	public void user_launches_the_home_page() 
	{
	    System.out.println("User in  TRICENTIS VEHICLE INSURANCES HOMEPAGE");
	}
	
	
	@Then("user able to click automobile")
	public void user_able_to_click_automobile()
	{
	    System.out.println("Clicking AUTOMOBILE PAGE");
	    homePage home = new homePage(hooks.driver);
	    home.clickCars();
	    test.log(LogStatus.PASS,"test 1 pass");
	    Allure.step("Passed");
	 
	}
}
