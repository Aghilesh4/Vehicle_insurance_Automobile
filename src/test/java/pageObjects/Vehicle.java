package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Vehicle 
{	
	WebDriver driver;
	
	public Vehicle(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void nextInsurant() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nextbtn =wait.until(ExpectedConditions.elementToBeClickable
		(By.xpath("//button[starts-with(@id,'next')]")));
		nextbtn.click();
	}
	
	public void prevPage() 
	{
		driver.findElement(By.xpath("//button[@class = 'prev']")).click();		
	}
	
	public void nextProduct() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nextbtn =wait.until(ExpectedConditions.elementToBeClickable
		(By.id("nextenterproductdata")));
		nextbtn.click();
		Thread.sleep(3000);
	}
	
	public void nextPrice() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Thread.sleep(3000);
		WebElement nextbtn =wait.until(ExpectedConditions.elementToBeClickable
		(By.id("nextselectpriceoption")));
		nextbtn.click();
		Thread.sleep(3000);
	}
	
	public void nextQuote() throws InterruptedException 
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement nextbtn =wait.until(ExpectedConditions.elementToBeClickable
		(By.id("nextsendquote")));
		nextbtn.click();
	}
	
	public boolean verifyPage(String s ,String r) 
	{
		if(s.equals(r)) 
		{
			return true;
		}
		else {
			return false;
		}
	}
	

	public void clickOption2() throws InterruptedException 
	{
		driver.findElement(By.xpath("(//table[@id='priceTable']//th[@class='group']//label[contains(@class,'choosePrice')])[2]\r\n"
				+ "")).click();
		Thread.sleep(1000);
	}
	
	public void closePage() 
	{
		driver.quit();
	}
}

//   //section[not(contains(@style,'display:none'))]"

