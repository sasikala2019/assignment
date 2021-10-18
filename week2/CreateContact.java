package week2.day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	private static WebElement webElement;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
//maximize&minimize
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
//implicy wait
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 WebElement findElement = driver.findElement(By.id("username"));
		 WebElement elePassword = driver.findElement(By.id("password"));
		 findElement.sendKeys("DemoSalesManager");
		 elePassword.sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 
		 driver.findElement(By.id("firstNameField")).sendKeys("Sasikala");
		 driver.findElement(By.id("lastNameField")).sendKeys("Sampath");
		 
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sasikala");
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sampath");
		 
		 driver.findElement(By.id("createContactForm_departmentName")).sendKeys("ECE");
		 driver.findElement(By.name("description")).sendKeys("The contact is created");
		 driver.findElement(By.name("primaryEmail")).sendKeys("sasikalaecekiot@gmail.com");
		 
		 driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("8072892072");

		 WebElement eleCountry = driver.findElement(By.name("generalStateProvinceGeoId"));
		 Select dropDown=new Select(eleCountry);
		 dropDown.selectByVisibleText("New York");

		 driver.findElement(By.className("smallSubmit")).click();

		 driver.findElement(By.linkText("Edit")).click();
		 driver.findElement(By.name("description")).clear();

		 driver.findElement(By.name("importantNote")).sendKeys("Creating a Contact is a important one");

		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 String eleTitle=driver.getTitle();
System.out.println("The Title of the page is:"+ eleTitle);
		 
	}

}
