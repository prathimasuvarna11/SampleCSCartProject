package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class HomePage {
	public WebDriver driver;
	By searchItem=By.xpath("//input[@title='Search products']");
	By click=By.cssSelector(".ty-icon-search");
	By searchResult=By.cssSelector(".ty-mainbox-title__left");
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement search()
	{
		return driver.findElement(searchItem);
		
		
	}
	public WebElement clickButton()
	{
		return driver.findElement(click);
	}
    public WebElement searchResult()
    {
    	return driver.findElement(searchResult);
    }
}
