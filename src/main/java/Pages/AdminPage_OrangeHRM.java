package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.TestBase;

public class AdminPage_OrangeHRM extends TestBase
{
	
	@FindBy(xpath="//span[text()='Admin']")private WebElement adminpage;
	//@FindBy(xpath="(//i[@class='oxd-icon bi-chevron-down'])[1]") private WebElement dropdownarrow;
	//@FindBy(xpath="//a[text()='Users']")private WebElement userdropdown;
	@FindBy(xpath="//h5[text()='System Users']") private WebElement usertext;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")private WebElement addbutton;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")private WebElement userrolearrow;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[1]")private WebElement Userroledropdown;
	@FindBy(xpath="//input[@placeholder='Type for hints...']")private WebElement employeenametextbox;
	@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")private WebElement statusarrow;
	@FindBy(xpath="(//div[@class='oxd-select-text-input'])[2]")private WebElement statusdrodown;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")private WebElement usernametextbox;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")  private WebElement passwordtextbox;
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[4]")private WebElement confirmpasstextbox;
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")private WebElement savebutton;
	//@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]") private WebElement usernametextbox;
	//@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")private WebElement Roledropdownarrow;
	//@FindBy(xpath="//input[@placeholder='Type for hints...']")private WebElement employeetextbox;
	//@FindBy(xpath="(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")private WebElement statusdropdownarrow;
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	
	public AdminPage_OrangeHRM()
	{
		PageFactory.initElements(driver, this);
	}
	 public String VerifyAdminPage() throws InterruptedException
	 {
		 adminpage.click();
		 Thread.sleep(3000);
		return driver.getCurrentUrl();
	 }
	 public String VerifySystemusertext()
	 {
		return wait.until(ExpectedConditions.visibilityOf(usertext)).getText() ;
		 
	 }
	 public String VerifyAddbutton() throws InterruptedException
	 {
		 wait.until(ExpectedConditions.visibilityOf(addbutton)).click();
		 Thread.sleep(3000);
		return driver.getCurrentUrl();
		 
	 }
	 public String VerifyCreateuser()
	 {
		 wait.until(ExpectedConditions.visibilityOf(userrolearrow)).click();
		 Select s=new Select(Userroledropdown);
		 s.selectByVisibleText("Admin");
		 wait.until(ExpectedConditions.visibilityOf(employeenametextbox)).sendKeys("Ranga  Akunuri");
		 wait.until(ExpectedConditions.visibilityOf(statusarrow)).click();
		 Select s1=new Select(statusdrodown);
		 s1.selectByVisibleText("Enabled");
		 wait.until(ExpectedConditions.visibilityOf(usernametextbox)).sendKeys("Ganesh");
		 wait.until(ExpectedConditions.visibilityOf(passwordtextbox)).sendKeys("Ganesh@123");
		 wait.until(ExpectedConditions.visibilityOf(confirmpasstextbox)).sendKeys("Ganesh@123");
		 wait.until(ExpectedConditions.visibilityOf(savebutton)).click();
		return driver.getCurrentUrl();	
	 }
	
	
	

}
