package day1seleniumpractice;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\chromedriver.exe");
		ChromeDriver cdriver = new ChromeDriver();
	}

}
