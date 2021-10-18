package week2.day1;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnFaceBook {
	private static WebElement webElement;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
//maximize&minimize
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
//implicy wait
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.findElement(By.linkText("Create New Account")).click();
		 driver.findElement(By.name("firstname")).sendKeys("Sasikala");
		 driver.findElement(By.name("lastname")).sendKeys("Sampath");
		 driver.findElement(By.name("reg_email__")).sendKeys("8072892072");
		 driver.findElement(By.name("reg_passwd__")).sendKeys("Mahizhan@2019");
		 
		 WebElement eleDay = driver.findElement(By.name("birthday_day"));
		 Select dropDown=new Select(eleDay);
		 dropDown.selectByVisibleText("12");
		 
		 WebElement eleMonth = driver.findElement(By.name("birthday_month"));
		 Select dropDown1=new Select(eleMonth);
		 dropDown1.selectByVisibleText("Jun");
		
		 WebElement eleYear = driver.findElement(By.id("year"));
		 Select dropDown2=new Select(eleYear);
		 dropDown2.selectByVisibleText("1994");
		
		 
		 
		 

		 
		 
		 

		 

	}

}
