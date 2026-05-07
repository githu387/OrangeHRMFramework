package Pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class LoginPage_OrangeHRM extends TestBase
{
	@FindBy(xpath="//input[@name='username']") private WebElement usernametext;
	@FindBy(xpath="//input[@name='password']") private WebElement passwordtext;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")private WebElement loginbtn;
	@FindBy(xpath="//h5[text()='Login']")private WebElement logintext;
	@FindBy(xpath="//p[text()='Forgot your password? ']")private WebElement forgotpass;
	@FindBy(xpath="//p[text()='© 2005 - 2025 ']")private WebElement yeartext;
	@FindBy(xpath="//a[text()='OrangeHRM, Inc']")private WebElement orangetext;
	@FindBy(xpath="//a[contains(@href,'linkedin.com')]")private WebElement linkedwindow;
	@FindBy(xpath="//a[contains(@href,'facebook.com')]") private WebElement facewindow;
	@FindBy(xpath="//a[contains(@href,'twitter.com')]") private WebElement  twitwindow;
	@FindBy(xpath="//a[contains(@href,'youtube.com')]") private WebElement youtubewindow;
	@FindBy(xpath="//p[text()='OrangeHRM OS 5.7']") private WebElement versiontext;
	
	WebDriverWait wait;
	public LoginPage_OrangeHRM()
	{
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public String VerifyURLofApp()
	{
		return driver.getCurrentUrl();
		
	}
	public String  Verifytitle()
	{
		return driver.getTitle();
		
	}
	public String VerifyLoginApp()
	{
		wait.until(ExpectedConditions.visibilityOf(usernametext)).sendKeys("Admin");
		wait.until(ExpectedConditions.visibilityOf(passwordtext)).sendKeys("admin123");
		wait.until(ExpectedConditions.visibilityOf(loginbtn)).click();
		return driver.getCurrentUrl();
	}
	public String Verifylogintext()
	{
		return logintext.getText();
	}
	public String Verifyforgotbtn()
	{
		forgotpass.click();
		return driver.getCurrentUrl();	
	}
	public String Verifyyeartext()
	{
		return yeartext.getText();
	}
	public String verifywindow()
	{
		
		String mainwindow = driver.getWindowHandle();
		orangetext.click();
		
		
		Set<String> allwindows = driver.getWindowHandles();
		for(String window:allwindows)
		{
			if(!window.equals(mainwindow))
			{
				driver.switchTo().window(window);
				
			}
		}
		return driver.getCurrentUrl();
	}
	public String VerifyLinkedIn()
	{
		String Mainwindow = driver.getWindowHandle();
		linkedwindow.click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String window:allwindows)
		{
			if(!window.equals(Mainwindow))
			{
				driver.switchTo().window(window);
			}
		}
		return driver.getCurrentUrl();
		
	}
	public String VerifyFacebook()
	{
		String Mainwindow = driver.getWindowHandle();
		facewindow.click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String window:allwindows)
		{
			if(!window.equals(Mainwindow))
			{
				driver.switchTo().window(window);
			}
		}
		return driver.getCurrentUrl();
		
	}
	public String VerifyTwitter()
	{
		String Mainwindow = driver.getWindowHandle();
		twitwindow.click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String window:allwindow)
		{
			if(!window.equals(Mainwindow))
			{
				driver.switchTo().window(window);
			}
		}
		return driver.getCurrentUrl();
	}
	public String VerifyYoutube()
	{
		String mainwindow = driver.getWindowHandle();
		youtubewindow.click();
		Set<String> allwindow = driver.getWindowHandles();
		for(String window:allwindow)
		{
			if(!window.equals(mainwindow))
			{
				driver.switchTo().window(window);
			}
		}
		return driver.getCurrentUrl();
	}
	public String Verifyversiontext()
	{
		return versiontext.getText();
		
	}
	public boolean LinkedInlogo()
	{
		return linkedwindow.isDisplayed();
		
	}

}
