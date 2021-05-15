package demo.Poc.Testcases;


import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import demo.Poc.Pages.HomePage;
import demo.Poc.Pages.LoginPage;


public class TC_LoginTest_001 extends BaseClass
{

	@Test
	public void loginTest() throws IOException, InterruptedException 
	{
			
		logger.info("URL is opened");
		
		LoginPage lp=new LoginPage(driver);
		HomePage hp=new HomePage(driver);
		lp.setUserName(username);
		logger.info("Entered username");
		
		lp.setPassword(password);
		logger.info("Entered password");
		
		lp.clickSubmit();
		
		hp.clickSyneTime();
		
	
		
		driver.findElement(By.xpath("attendence_popup_Ind")).click();;
		
		Thread.sleep(7000);
		
		if(driver.getTitle().equals("Testing"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
		
	}
}
