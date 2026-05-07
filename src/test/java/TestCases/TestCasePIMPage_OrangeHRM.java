package TestCases;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage_OrangeHRM;
import Pages.PIMPage_OrangeHRM;

public class TestCasePIMPage_OrangeHRM extends TestBase
{
	LoginPage_OrangeHRM login;
	PIMPage_OrangeHRM Pim;
	@BeforeMethod
	public void setup()
	{
		initialization();
		login=new LoginPage_OrangeHRM();
		Pim=new PIMPage_OrangeHRM();
		login.VerifyLoginApp();
		Pim.VerifyAddbtn();
		Pim.VerifyCustomField();
		//Pim.VerifyAddCustomfield();
		//Pim.VerifyAddemployee();
		//Pim.VerifyCustomField();
	
		
		
	}
	@Test
	public void VerifyAddbtnTestcase()
	{
		String expUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee";
		String actUrl=Pim.VerifyAddbtn();
		Assert.assertEquals(expUrl, actUrl);
		Reporter.log("Actual URL:" +actUrl);
	}
	@Test
	public void VerifyAddemployeeTestCase()
	{
		String expURL="Successfully Saved";
		String ActURL=Pim.VerifyAddemployee();
		Assert.assertEquals(expURL, ActURL);
		Reporter.log("Actual Result: "+ActURL);
	}
	@Test
	public void VerifyCustomFieldTestCase()
	{
		String expurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/listCustomFields";
		String acturl=Pim.VerifyCustomField();
		Assert.assertEquals(expurl, acturl);
		Reporter.log(acturl);
	}
	@Test
	public void VerifyAddCustomfieldTestCase()
	{
		String expurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/saveCustomFields";
		String acturl=Pim.VerifyAddCustomfield();
		Assert.assertEquals(expurl, acturl);
		Reporter.log(acturl);
		
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
