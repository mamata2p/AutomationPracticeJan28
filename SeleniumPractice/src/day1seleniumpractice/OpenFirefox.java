package day1seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\geckodriver.exe");
		//FirefoxDriver cdriver = new FirefoxDriver();
		WebDriver cdriver = new FirefoxDriver();
		String title = cdriver.getTitle();
		System.out.println(title);
	}
	

}
