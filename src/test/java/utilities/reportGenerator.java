package utilities;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class reportGenerator 
{
	public static ExtentReports extent;
	public static ExtentTest test;

	  @BeforeSuite
	  public void beforeSuite() 
	  {
		  extent = new ExtentReports("C:\\Selenium DEmo\\Demo_Capstone\\TestResults\\reports.html",true);
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
		  extent.flush();
	  }	
}
