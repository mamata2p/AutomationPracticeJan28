package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utilities.SeleniumUtility;

public class RedBus {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		//open red bus.in
		//from pune to goa
		//date in future
		//click on search button
		//departure time should be afte 6am
		//bus type AC
		//get the bus name along with its price
		
		
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/");
		
		Thread.sleep(1000);
		driver.findElement(By.id("src")).sendKeys("Pune");
		Thread.sleep(1000);
		driver.findElement( By.xpath("//li[contains(text() ,'Swargate')]")).click();
		
		
		driver.findElement(By.id("dest")).sendKeys("Panjim");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[contains(text() ,'Panjim')]")).click();
		
		driver.findElement(By.xpath("//label[text() = 'Date']")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".next")).click();
	
		driver.findElement(By.cssSelector(".first.last>tbody>*:nth-child(4)>*:nth-child(2)")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		driver.findElement(By.xpath("//label[@title = 'Before 6 am']")).click();
		driver.findElement(By.xpath("//label[@title = 'AC']")).click();
		driver.findElement(By.xpath("//div[@class = ''button]"));
	}

}
