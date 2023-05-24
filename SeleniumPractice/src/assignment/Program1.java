package assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program1 {

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome");
		driver.get("https://demo.actitime,com/");
		String expectedURL = "https://demo.actitime,com/";
		String actualURL = driver.getCurrentUrl();
		 String pageTitle = driver.getTitle();
		System.out.println("PageTitle" + pageTitle);
		System.out.println("Result URL "+expectedURL);
			if(actualURL.contains(expectedURL))
			{
				System.out.println("Status : Pass ");
			}
			else
			{
				System.out.println("Status : Fail");
			}
	}
	
	public static WebDriver setUp(String browserName) {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\gecko.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

}
