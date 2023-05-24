package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAndLogoutFromApplication {

	public static void main(String[] args) {
		//open chrome browser
		WebDriver driver = setUp("chrome");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//enter application url
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("Login page title: "+driver.getTitle());
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		//click on login button
		driver.findElement(By.id("login-button")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver, 20);
		
		//wait.until(ExpectedConditions.elementToBeClickable(By.className("app_logo")));
		
		//click on navigation pannel
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		// driver.close();
		
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
