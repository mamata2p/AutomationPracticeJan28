package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginAndLogoutForVitiger {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("chrome");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		driver.findElement(By.xpath("//input[@id = 'username']")).clear();
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("Admin@123");
		driver.findElement(By.xpath(" //button[@text() = 'Sign in']")).click();
		
		
	}
	
	public static WebDriver setUp(String browserName) {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\gecko.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
