package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndLogoutActitime {

	public static void main(String[] args) {
		
		WebDriver driver =  setUp("chrome");
		
		driver.get("https://demo.actitime.com/login.do ");
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//System.out.println("Login Page Title: "+driver.getTitle());
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.id("loginButton")).click();
		
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleIs(expectedHomePageTitle));
		String actualHomePageTitle = driver.getTitle();
		System.out.println("Actual home page title: "+actualHomePageTitle);
		System.out.println("expected home page title: "+expectedHomePageTitle);
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
		System.out.println("home page validation is successful,logout from the application");
		}
		else
		{
			System.out.println("Home page validation is failed,not allowed to logout from the application");
		}
		
		driver.findElement(By.id("logoutLink")).click();
		
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
