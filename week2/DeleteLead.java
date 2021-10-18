package week2.day1;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DeleteLead {
	private static WebElement webElement;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		 WebElement findElement = driver.findElement(By.id("username"));
		 WebElement elePassword = driver.findElement(By.id("password"));
		 findElement.sendKeys("DemoSalesManager");
		 elePassword.sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
		 driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("");
	   	 driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("44");
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7911 123456");
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
						 
		 String  eleLeadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).getText();
		 System.out.println("The Lead ID:"+eleLeadId);
		 
		 driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]")).click();
		//driver.findElement(By.linkText("subMenuButtonDangerous")).click();

		 
		
	}

}

