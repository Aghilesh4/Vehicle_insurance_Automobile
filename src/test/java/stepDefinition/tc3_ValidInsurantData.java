package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.Vehicle;
import pageObjects.homePage;
import utilities.reportGenerator;

public class tc3_ValidInsurantData extends reportGenerator
{
	homePage home;
	Vehicle vehicle = new Vehicle(hooks.driver);
	
	@When("user enters valid {string} and \"<lastname>\"and {string} and {string} and {string} and {string} and {string}")
	public void user_enters_valid_and_lastname_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException 
	{
		test = extent.startTest("Test 3");
		home = new homePage(hooks.driver);
	    System.out.println("The user in the Insurant Data page"); 
	     
	    hooks.driver.findElement(By.id("firstname")).sendKeys("aghhh");
	    Thread.sleep(1000);

	 	hooks.driver.findElement(By.id("lastname")).sendKeys("lsksk");
	 	Thread.sleep(1000);
	 	
	 	hooks.driver.findElement(By.id("birthdate")).sendKeys("08/05/2002");
	 	Thread.sleep(1000);

	 	Select selectcountry=new Select(hooks.driver.findElement(By.id("country")));
	 	selectcountry.selectByVisibleText("India");	
	 	Thread.sleep(1000);

	 	hooks.driver.findElement(By.id("zipcode")).sendKeys("12345");
	 	Thread.sleep(1000);
	 	
	 	Select selectjob=new Select(hooks.driver.findElement(By.id("occupation")));
	 	selectjob.selectByVisibleText("Employee");
	 	Thread.sleep(1000);

	 	hooks.driver.findElement(By.xpath("//label[contains(.,'Speeding')]")).click();
	 	Thread.sleep(1000);
	}
	
	@Then("user clicks the next page")
	public void user_clicks_the_next_page() throws InterruptedException 
	{
	    vehicle.nextProduct();
	    test.log(LogStatus.PASS,"test 3 pass");
	    Allure.step("Passed");
	}
}

