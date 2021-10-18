package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class LeafGrount {
	private static WebElement webElement;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		
		WebElement eleIndex = driver.findElement(By.id("dropdown1"));
		Select dropDown1=new Select(eleIndex);
		dropDown1.selectByIndex(1);
		
		WebElement eleIndex2 = driver.findElement(By.name("dropdown2"));
		Select dropDown2=new Select(eleIndex2);
		dropDown2.selectByVisibleText("Selenium");
		
		WebElement eleIndex3 = driver.findElement(By.name("dropdown3"));
		Select dropDown3=new Select(eleIndex3);
		dropDown3.selectByVisibleText("Selenium");
		
		WebElement eleIndex4 = driver.findElement(By.className("dropdown"));
		Select dropDown4=new Select(eleIndex4);
		dropDown4.selectByVisibleText("Appium");
		
		
		 WebElement eleIndex5 =driver.findElement(By.xpath("(//div[@class='example']/select)[5]"));
		 Select dropDown5=new Select(eleIndex5);
		dropDown5.selectByVisibleText("Selenium");
		
			
		WebElement eleCombo =driver.findElement(By.xpath("(//div[@class='example']/select)[6]"));
		Select dropDown=new Select(eleCombo);
		dropDown.selectByVisibleText("Selenium");
		dropDown.selectByVisibleText("Appium");

		//driver.close();
	}

}
