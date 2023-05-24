package keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PressEscapButton {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com");
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		
		driver.get("https://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		
	}

}
