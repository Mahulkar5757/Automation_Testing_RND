package demo.Poc.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	//Testing
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
		
	@FindBy(id="UserName")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//body/div[2]/form[1]/div[1]/div[2]/div[4]/input[1]")
	@CacheLookup
	WebElement btnLogin;
	
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement lnkLogout;
	
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	
	public void clickSubmit()
	{
		btnLogin.click();
	}	
	
	public void clickLogout()
	{
		lnkLogout.click();
	}
	
	
	
}









