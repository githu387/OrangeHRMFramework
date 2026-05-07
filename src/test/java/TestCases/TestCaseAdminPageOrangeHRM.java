package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.AdminPage_OrangeHRM;
import Pages.LoginPage_OrangeHRM;

public class TestCaseAdminPageOrangeHRM extends TestBase
{
	AdminPage_OrangeHRM Admin;
	LoginPage_OrangeHRM login;
	@BeforeMethod
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		Admin=new AdminPage_OrangeHRM();
		login=new LoginPage_OrangeHRM();
		login.VerifyLoginApp();
		Admin.VerifyAdminPage();
	}
	@Test
	public void VerifyAdminPageTestcase() throws InterruptedException
	{
		String expURL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String actURL=Admin.VerifyAdminPage();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("Actual URL of AdminPage: "+actURL);
	}
	@Test
	public void VerifySystemusertextTestcase()
	{
		String expText="System Users";
		String actText=Admin.VerifySystemusertext();
		Assert.assertEquals(expText, actText);
		Reporter.log("Actual text: "+actText);
	}
	@Test
	public void VerifyAddbuttonTestcase() throws InterruptedException
	{
		String expURL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/saveSystemUser";
		String actURL=Admin.VerifyAddbutton();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("Actual add button URL: "+actURL);
	}
	//@Test
	public void VerifyCreateuserTestcase()
	{
		String expURL="https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers";
		String actURL=Admin.VerifyCreateuser();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("Actual URL of create user: "+actURL);
	}
	@AfterMethod
	public void Closebrowser()
	{
		driver.close();
	}

}
