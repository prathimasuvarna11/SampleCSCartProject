package testcase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobject.HomePage;
import resources.Base;

public class HomePageTest extends Base {
	public WebDriver driver;
	@BeforeTest
	public void initialise() throws IOException
	{
		driver=initialiseDriver();
		
	}
	
	@Test
	public void searchProduct()
	{
		driver.get(prop.getProperty("url"));
		HomePage hp = new HomePage(driver);
		hp.search().sendKeys("computer");
		
		Reporter.log("Search text is entered", true);
		hp.clickButton().click();
		Reporter.log("Search button is clicked", true);
		Assert.assertEquals(hp.searchResult().getText(), "Search results");
	}
	
	
	  @AfterTest 
	  public void tearDrop() 
	  { driver.close(); 
	  }
	 
}
