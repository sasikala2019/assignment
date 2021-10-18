package week2.day1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSalesForce {
	private static WebElement webElement;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
//maximize&minimize
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
//implicy wait
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.findElement(By.name("UserFirstName")).sendKeys("Sasikala");
		 driver.findElement(By.name("UserLastName")).sendKeys("Sampath");
		 driver.findElement(By.name("UserEmail")).sendKeys("sasikalaecekiot@gmail.com");
		 
		 WebElement eleTitle = driver.findElement(By.name("UserTitle"));
		 Select dropDown=new Select(eleTitle);
		 dropDown.selectByVisibleText("Sales Manager");

		 driver.findElement(By.name("CompanyName")).sendKeys("Reveille Technology");
		 
		 WebElement eleEmployee = driver.findElement(By.name("CompanyEmployees"));
		 Select dropDown2=new Select(eleEmployee);
		 dropDown2.selectByVisibleText("501 - 1500 employees");
		 
		 driver.findElement(By.name("UserPhone")).sendKeys("8072892072");

		 WebElement eleCountry= driver.findElement(By.name("CompanyCountry"));
		 Select dropDown3=new Select(eleCountry);
		 dropDown3.selectByVisibleText("India");
		 
		 driver.findElement(By.className("checkbox-ui")).click();

		 

	}

}
