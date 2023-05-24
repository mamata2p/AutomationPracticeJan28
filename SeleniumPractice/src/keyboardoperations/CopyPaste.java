package keyboardoperations;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPaste {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement firstNameField = driver.findElement(By.xpath("//input[@placeholder = 'First Name']"));
	//firstNameField.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
	//	firstNameField.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		firstNameField.sendKeys("admin",Keys.chord(Keys.CONTROL ,"a"),Keys.chord(Keys.CONTROL,"c"));
		driver.findElement(By.xpath("//input[@placeholder = 'Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.F5);
	}

}
