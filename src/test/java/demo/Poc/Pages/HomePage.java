package demo.Poc.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver ldriver;
	
	public HomePage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(xpath="//body[1]/nav[1]/ul[1]/li[3]/a[1]/i[1]")
	@CacheLookup
	WebElement btnSyneTime;
	//Cheing the Code for testing Git and Comint
	
	
	public void clickSyneTime()
	{
		btnSyneTime.click();
	}
	
	
}
