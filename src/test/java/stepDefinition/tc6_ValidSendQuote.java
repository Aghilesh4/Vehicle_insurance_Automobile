package stepDefinition;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.LogStatus;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import pageObjects.homePage;
import utilities.reportGenerator;

public class tc6_ValidSendQuote extends reportGenerator 
{
	homePage home;
	
	@When("the user enters valid send quote")
	public void the_user_enters_valid_send_quote() throws InterruptedException 
	{
		home = new homePage(hooks.driver);
		System.out.println("User in the price data page");

		Thread.sleep(1000);
		test= extent.startTest("Test6 is running");
		
		hooks.driver.findElement(By.id("email")).sendKeys("user1@gmail.com");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("phone")).sendKeys("1234560987");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("username")).sendKeys("user1");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("password")).sendKeys("User123*");
		Thread.sleep(1000);
		
		hooks.driver.findElement(By.id("confirmpassword")).sendKeys("User123*");
		Thread.sleep(1000);
	}
	
	@Then("the user gets a confirmation mail")
	public void the_user_gets_a_confirmation_mail() throws InterruptedException 
	{		
		home.sendEmail();
		
	    test.log(LogStatus.PASS,"test 6 pass");
	    Allure.step("Passed");
	    Thread.sleep(10000);	
	}
}
