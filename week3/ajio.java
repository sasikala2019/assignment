package week2.day1.ajio;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class ajio {
	private static WebElement webElement;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
//maximize&minimize
		 driver.manage().window().maximize();
		 driver.manage().window().minimize();
//time		 
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//search box- type as "bags" and press enter
		 driver.findElement(By.name("searchVal")).sendKeys("bag",Keys.ENTER);
		 Thread.sleep(2000);
			
// To the left  of the screen under " Gender" click the "Men"		 
		 driver.findElement(By.xpath("//label[@for='Men']")).click();
		 Thread.sleep(2000);
		 
// Print the count of the items Found.
			String totalItems = driver.findElement(By.className("length")).getText();
			System.out.println("Total number of items : " + totalItems);
			
//Get the list of brand of the products displayed in the page and print the list.
			System.out.println(" List of Brands");
			List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
			System.out.println(" Size :" + bagBrandList.size());
			
	for (WebElement webElement : bagBrandList) {
				String text = webElement.getText();
				System.out.println(text);
			}
	// Get the list of names of the bags and print it
			List<WebElement> bagNameList = driver.findElements(By.className("name"));
			System.out.println(" Size :" + bagNameList.size());
			System.out.println(" Names of the Bags");
			for (WebElement webElement : bagNameList) {
				String text = webElement.getText();
				System.out.println(text);
			}
			
			

		}

	}

		 



	
	
		