package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage_OrangeHRM;


public class TestCaseLoginPageOrangeHRM extends TestBase
{
	LoginPage_OrangeHRM HRM;
	@BeforeMethod
	public void setup() throws IOException
	{
		initialization();
		HRM=new LoginPage_OrangeHRM();
	}
	@Test(priority = 2)
	public void VerifyURLofAppTest()
	{
		String expURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String ActURL=HRM.VerifyURLofApp();
		Assert.assertEquals(expURL, ActURL);
		Reporter.log("Actual URL of application="+ActURL);
	}
	@Test(priority = 3)
	public void VerifytitleTest()
	{
		String exptitle="OrangeHRM";
		String acttitle=HRM.Verifytitle();
		Assert.assertEquals(exptitle, acttitle);
		Reporter.log("Actual title of app="+acttitle);
	}
	@Test(priority = 0)
	public void VerifyLoginAppTest()
	{
		String explogin="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actlogin=HRM.VerifyLoginApp();
		Assert.assertEquals(explogin, actlogin);
		Reporter.log("Login URL of App="+actlogin);
	}
	
	@Test(priority = 4)
	public void VerifylogintextTest()
	{
		String Exptext="Login";
		String Acttext=HRM.Verifylogintext();
		Assert.assertEquals(Exptext, Acttext);
		Reporter.log("Actual login text="+Acttext);
	}
	@Test(priority = 1)
	public void VerifyforgotbtnTest()
	{
		String Expurl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/requestPasswordResetCode";
		String Acturl=HRM.Verifyforgotbtn();
		Assert.assertEquals(Expurl, Acturl);
		Reporter.log("Actual forgot URL="+Acturl);
	}
	@Test(priority = 5)
	public void VerifyyeartextTestcase()
	{
		String exptext="© 2005 - 2025 OrangeHRM, Inc. All rights reserved.";
		String Acttext=HRM.Verifyyeartext();
		Assert.assertEquals(exptext, Acttext);
		Reporter.log("Actual text of year= "+Acttext);
	}
	@Test(priority = 6)
	public void verifywindowTestCase()
	{
		String expurl="https://www.orangehrm.com/";
		String Acturl=HRM.verifywindow();
		Assert.assertEquals(expurl, Acturl);
		Reporter.log("Actual text of: "+Acturl);
	}
	@Test(priority = 8)
	public void VerifyLinkedInTestCase()
	{
		String expURL="https://www.linkedin.com/company/orangehrm";
		String ActURL=HRM.VerifyLinkedIn();
		Assert.assertEquals(expURL, ActURL);
		Reporter.log("Actual URL Linked In: "+ActURL);
	}
	@Test(priority = 7)
	public void VerifyFacebookTestCase()
	{
		String axpURL="https://www.facebook.com/OrangeHRM/";
		String actURL=HRM.VerifyFacebook();
		Assert.assertEquals(axpURL, actURL);
		Reporter.log("Actual URL of FaceBook: "+actURL);
		
	}
	@Test(priority = 9)
	public void VerifyTwitterTestCase()
	{
		String expURL="https://x.com/orangehrm?lang=en";
		String ActURL=HRM.VerifyTwitter();
		Assert.assertEquals(expURL, ActURL);
		Reporter.log("Actual URL of Twitter: "+ActURL);
	}
	@Test(priority = 10)
	public void VerifyYoutubeTestCase()
	{
		String expURL="https://www.youtube.com/c/OrangeHRMInc";
		String actURL=HRM.VerifyYoutube();
		Assert.assertEquals(expURL, actURL);
		Reporter.log("Actual URL of youtube: "+actURL);
	}
	@Test(priority = 11)
	public void VerifyversiontextTestCase()
	{
			String exptext="OrangeHRM OS 5.7";
			String acttext=HRM.Verifyversiontext();
			Assert.assertEquals(exptext, acttext);
			Reporter.log("Actual text of version: "+acttext);
	}
	@Test(priority = 12)
	public void LinkedInlogo()
	{
		boolean actlogo=HRM.LinkedInlogo();
		Assert.assertEquals(actlogo, true);
	}
	@AfterMethod
	public void CloseBrower()
	{
		driver.quit();
	}

}
