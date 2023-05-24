package day1seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginApplication {

	public static void main(String[] args) {
		
		WebDriver driver = setUp("chrome");
		
		driver.get("https://www.saucedemo.com/");
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		System.out.println("Login page title: "+driver.getTitle());
		
	
		
		
		WebElement userNameInputField = driver.findElement(By.id("user-name"));
		
		userNameInputField.sendKeys("standard_user"); 
		
		WebElement passwordInputField = driver.findElement(By.id("password"));
		passwordInputField.sendKeys("secret_sauce");
		
		//WebElement loginButton = driver.findElement(By.id("login-button"));
		//loginButton.click();
		
		driver.findElement(By.id("login-password")).click(); 
		
		driver.close();
	}
	public static WebDriver setUp(String browserName) {
		WebDriver driver = null; 
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\gecko.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
