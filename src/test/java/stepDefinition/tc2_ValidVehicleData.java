package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.Vehicle;
import pageObjects.homePage;
import utilities.reportGenerator;

public class tc2_ValidVehicleData extends reportGenerator
{
	homePage home;
	Vehicle vehicle = new Vehicle(hooks.driver);
	
	@Given("the user in the automobile page")
	public void the_user_in_the_automobile_page()
	{
		

		 
		 home = new homePage(hooks.driver);
		 home.clickCars();
		 //test = extent.startTest("Test 2");
	     System.out.println("The user in the Vehicle Data page");   
	}
	
	@When("user enters valid \"<make>\"and valid {string} and valid {string} and valid {string} and valid {string} and valid {string} and {string} and valid {string}")
	public void user_enters_valid_make_and_valid_and_valid_and_valid_and_valid_and_valid_and_and_valid(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException 
	{
		test = extent.startTest("Test 2");
		Select o = new Select(hooks.driver.findElement(By.id("make")));
		o.selectByVisibleText("Audi");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("engineperformance")).sendKeys("123");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("dateofmanufacture")).sendKeys("12/12/2020");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("numberofseats")).sendKeys("4");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("fuel")).sendKeys("Diesel");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("listprice")).sendKeys("3500");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("licenseplatenumber")).sendKeys("123466");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("annualmileage")).sendKeys("350");
		Thread.sleep(1000);
	}
	
	@Then("user able to click next.")
	public void user_able_to_click_next() throws InterruptedException  
	{
		
	    vehicle.nextInsurant();
	    test.log(LogStatus.PASS,"test 2 pass");
	    Allure.step("Passed");
	}
}
