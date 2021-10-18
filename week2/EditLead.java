package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class EditLead {
	private static WebElement webElement;
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
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
 driver.findElement(By.linkText("Name and ID")).click();
	}
	

}



	

			
	