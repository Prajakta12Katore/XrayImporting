package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Quantity 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"amount7\"]")
	WebElement e4;
	
	@FindBy(xpath="//*[@id=\"amount7\"]")
	WebElement e5;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[5]/div/div/div[2]/div/div/div[3]/div[3]/form[2]/div[2]/div/div[3]/button")
	WebElement e6;
	
	public Quantity(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}

	public void Click_On_Add() 
	{
		e4.clear();
		e5.sendKeys("2");
		e6.click();
		
		return;
	}
	
}
