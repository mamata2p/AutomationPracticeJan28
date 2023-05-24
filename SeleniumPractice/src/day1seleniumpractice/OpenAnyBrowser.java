package day1seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenAnyBrowser {

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome");
		//driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl() );
		//driver.close();
		
		
		driver.get("https://demo.actitime.com");
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		//get page source code
		String source = driver.getPageSource();
		System.out.println(source.length());
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


 