package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class PIMPage_OrangeHRM extends TestBase
{
	@FindBy(xpath="//span[text()='PIM']")private WebElement pimpage;
	@FindBy(xpath="(//button[@type='button'])[5]")private WebElement addbtn;
	@FindBy(xpath="//input[contains(@name,'fi')]")private WebElement firstname;
	@FindBy(xpath="//input[@name='middleName']")private WebElement middlename;
	@FindBy(xpath="//input[@name='lastName']") private WebElement lastname;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")private WebElement empid;
	@FindBy(xpath="//button[@type='submit']")private WebElement submitbtn;	
	@FindBy(xpath="//p[text()='Successfully Saved']")private WebElement sucessmsg;
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-down']")private WebElement dropdownarrow;
	@FindBy(xpath="//a[text()='Custom Fields']")private WebElement customfieldbtn;
	@FindBy(xpath="(//button[@type='button'])[4]")private WebElement addcustomfield;
	
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	public PIMPage_OrangeHRM()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String VerifyAddbtn()
	{
		pimpage.click();
		addbtn.click();
		return driver.getCurrentUrl();
	}
	public String VerifyAddemployee()
	{
		wait.until(ExpectedConditions.visibilityOf(firstname)).sendKeys("Nilam");
		wait.until(ExpectedConditions.visibilityOf(middlename)).sendKeys("Sana");
		wait.until(ExpectedConditions.visibilityOf(lastname)).sendKeys("Giri");
		//firstname.sendKeys("Ajay");
		//middlename.sendKeys("Arun");
		//lastname.sendKeys("Nikam");
		wait.until(ExpectedConditions.visibilityOf(empid)).clear();
		//empid.clear();
		wait.until(ExpectedConditions.visibilityOf(empid)).sendKeys("516");
		//empid.sendKeys("0372512");
		submitbtn.click();
		String textmasssge = wait.until(ExpectedConditions.visibilityOf(sucessmsg)).getText();
		return textmasssge;
		
	}
	public String VerifyCustomField()
	{
		wait.until(ExpectedConditions.visibilityOf(dropdownarrow)).click();
		wait.until(ExpectedConditions.visibilityOf(customfieldbtn)).click();
		return driver.getCurrentUrl();	
	}
	public String VerifyAddCustomfield()
	{
		wait.until(ExpectedConditions.visibilityOf(addcustomfield)).click();
		return driver.getCurrentUrl();
		
	}

}
