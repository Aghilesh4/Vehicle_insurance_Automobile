package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class screenShot 
{
	public static int i =0;

	  public static void sShot(WebDriver driver) throws IOException 
	  {
		  System.out.println("Taking ScreenShot..");
  		  File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  		  Files.copy(scrFile, new File("C:\\Selenium DEmo\\Demo_Capstone\\scr"+i+".jpeg"));
	  }
}
