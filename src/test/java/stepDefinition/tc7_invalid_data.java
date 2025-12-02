package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.Vehicle;
import pageObjects.homePage;
import utilities.reportGenerator;
import utilities.screenShot;

public class tc7_invalid_data extends reportGenerator
{
	
	homePage home = new homePage(hooks.driver);
	Vehicle ve = new Vehicle(hooks.driver);

	@When("user enters invalid data in vehicle page")
	public void user_enters_invalid_data_in_vehicle_page() throws InterruptedException
	{
		System.out.println("User in the automobile page");
		home.clickCars();
	
		Thread.sleep(1000);
		
		Select o = new Select(hooks.driver.findElement(By.id("make")));
		o.selectByVisibleText("Audi");
		Thread.sleep(1000);
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("engineperformance")).sendKeys("123");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("dateofmanufacture")).sendKeys("12/12/2028");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("numberofseats")).sendKeys("4");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("fuel")).sendKeys("Diesel");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("listprice")).sendKeys("35000");
		Thread.sleep(1000);

		hooks.driver.findElement(By.id("licenseplatenumber")).sendKeys("123466");
		Thread.sleep(1000);

		hooks.driver.findElement(By.id("annualmileage")).sendKeys("3");
		Thread.sleep(1000);
		
		ve.nextInsurant();
	}
	
	@When("user enters invalid data in insurant page")
	public void user_enters_invalid_data_in_insurant_page() throws InterruptedException 
	{
		System.out.println("The user in the Insurant Data page"); 	
		 
		hooks.driver.findElement(By.id("firstname")).sendKeys("aghhh");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("lastname")).sendKeys("lsksk");
		Thread.sleep(1000);

		hooks.driver.findElement(By.id("birthdate")).sendKeys("08/05/2015");
		Thread.sleep(1000);
	
		Select selectcountry=new Select(hooks.driver.findElement(By.id("country")));
		selectcountry.selectByVisibleText("India");	
		Thread.sleep(1000);
	
		hooks.driver.findElement(By.id("zipcode")).sendKeys("12341234t5");
		Thread.sleep(1000);
		
		Select selectjob=new Select(hooks.driver.findElement(By.id("occupation")));
		selectjob.selectByVisibleText("Employee");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.xpath("//label[contains(.,'Speeding')]")).click();
		Thread.sleep(1000);
	
		ve.nextProduct();
	}
	
	@When("user enters invalid data in product page")
	public void user_enters_invalid_data_in_product_page() throws InterruptedException 
	{
		System.out.println("The user in the Product Data page");
		
		hooks.driver.findElement(By.id("startdate")).sendKeys("6/6/2025");
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
	
	@When("user can go to the price page")
	public void user_can_go_to_the_price_page() throws InterruptedException 
	{
		ve.nextPrice();
		Thread.sleep(5000);
	}
	
	@Then("system shows the error page")
	public void system_shows_the_error_page() throws IOException 
	{
		test=extent.startTest("Test7_negative");
		try 
		{
		String wor=hooks.driver.findElement(By.xpath("//*[@id=\"xLoaderPrice\"]/p")).getText();
		boolean val= ve.verifyPage(wor,"Please, complete the first three steps to see the price table.");
		
			assertTrue(val);
			test.log(LogStatus.PASS, "test case 7_negative verified");	
			Allure.step("Passed");
		}
		catch (NoSuchElementException e) 
		{
		    test.log(LogStatus.FAIL, "Element not found, test case 7_negative failed"+e.getMessage());
		    screenShot.sShot(hooks.driver);
		}
			catch(AssertionError e)
		{
				screenShot.sShot(hooks.driver);
			    test.log(LogStatus.FAIL, "test case 7_negative failed");
			    Allure.addAttachment("Failed",e.getMessage());
		}
	}
	
}
