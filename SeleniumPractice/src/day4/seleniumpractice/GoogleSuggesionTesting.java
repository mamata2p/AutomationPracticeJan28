package day4.seleniumpractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggesionTesting {

	public static void main(String[] args) {
		WebDriver driver = setUp("chrome");
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Testing interview questions");
		
		List<WebElement> googleSuggession = driver.findElements(By.cssSelector("ul[class = 'G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
		System.out.println("Total Suggessions "+googleSuggession.size());
		
		for(int i=0; i<googleSuggession.size();i++) {
			googleSuggession = driver.findElements(By.cssSelector("ul[class = 'G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
			WebElement suggessions = googleSuggession.get(i);
			if(suggessions.getText().equals("testing interview questions for freshers"))
			{
				suggessions.click();
				break;
			}
		}
		 String pageTitle = driver.getTitle();
		String  expectedTitle = "testing interview questions for freshers";
		System.out.println("page validation: "+pageTitle.contains(expectedTitle));
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
