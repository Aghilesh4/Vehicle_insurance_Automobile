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

public class tc4_ValidProductData extends reportGenerator 
{	
	homePage home;
	Vehicle vehicle = new Vehicle(hooks.driver);
	@When("the user enters valid {string} and {string} and {string} and {string} and {string} and {string}")
	public void the_user_enters_valid_and_and_and_and_and(String string, String string2, String string3, String string4, String string5, String string6) throws InterruptedException 
	{
		test = extent.startTest("Test 4");
		home = new homePage(hooks.driver);
		System.out.println("The user in the Product Data page");
		
		hooks.driver.findElement(By.id("startdate")).sendKeys("12/3/2026");
		Thread.sleep(1000);
		
		Select selectinsurance=new Select(hooks.driver.findElement(By.id("insurancesum")));
		selectinsurance.selectByVisibleText("7.000.000,00");	
		Thread.sleep(1000);
		
		Select selectmerit = new Select(hooks.driver.findElement(By.id("meritrating")));
		selectmerit.selectByVisibleText("Bonus 1");
		Thread.sleep(1000);
		
		Select selectdamage=new Select(hooks.driver.findElement(By.id("damageinsurance")));
		selectdamage.selectByVisibleText("Partial Coverage");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")).click();
		Thread.sleep(1000);
	
		hooks.driver.findElement(By.id("courtesycar")).sendKeys("No");
		Thread.sleep(1000);

	}
	
	@Then("user able to click the next page")
	public void user_able_to_click_the_next_page() throws InterruptedException
	{    
		vehicle.nextPrice();
	    test.log(LogStatus.PASS,"test 4 pass");
	    Allure.step("Passed");
	}
}
