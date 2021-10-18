package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class XpathLoginPage {
	private static WebElement webElement;
	public static void main(String[] args) {
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("http://leaftaps.com/opentaps/control/main");
	 WebElement findElement = driver.findElement(By.xpath("//input[@id='username']"));
	 WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));
	 findElement.sendKeys("DemoSalesManager");
	 elePassword.sendKeys("crmsfa");
	 driver.findElement(By.className("decorativeSubmit")).click();
	 
	 driver.manage().window().maximize();
	 driver.manage().window().minimize();
	 driver.findElement(By.xpath("//a[contains(text(),'CRM')]"));
	 driver.findElement(By.linkText("Leads")).click();
	 driver.findElement(By.linkText("Create Lead")).click();
	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test _leaf");
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sasikala");
	 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sampath");
	 WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
	 Select dropDown=new Select(eleSource);
	 dropDown.selectByVisibleText("Direct Mail");
	 WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dropDown1=new Select(eleIndustry);
	dropDown1.selectByIndex(7);
	WebElement eleOwnerShip = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dropDown2=new Select(eleOwnerShip);
	dropDown2.selectByValue("OWN_PARTNERSHIP");
	WebElement eleMarkCompaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select dropDown3=new Select(eleMarkCompaign);
	 dropDown3.selectByVisibleText("Automobile");

	
	 
	 //driver.findElement(By.className("smallsubmit")).click();

	 

	}

}

