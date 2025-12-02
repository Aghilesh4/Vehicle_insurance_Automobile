package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks 
{
  public static WebDriver driver;
  
  @Before("@f1") 
  public void f() 
  {
	  driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://sampleapp.tricentis.com/101/index.php");
  }
  
  @Before("@f3") 
  public void in() 
  {
	  driver = new EdgeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://sampleapp.tricentis.com/101/index.php");
  }
  
  @After("@f2")
  public void close() 
  {
	  driver.quit();
  }
  
  @After("@f3")
  public void closeInvalid() 
  {
    driver.quit();
  }
}