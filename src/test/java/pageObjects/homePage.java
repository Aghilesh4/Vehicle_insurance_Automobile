package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class homePage
{	
	 WebDriver driver;
	
	public homePage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	 
	public void clickCars()
	{		
		driver.findElement(By.linkText("Automobile")).click();
	}
	
	public void sendEmail() throws InterruptedException
	{		
		Thread.sleep(2000);
		driver.findElement(By.id("sendemail")).click();
	}		
}