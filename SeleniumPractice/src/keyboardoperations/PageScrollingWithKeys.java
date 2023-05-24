package keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageScrollingWithKeys {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
		//scrollin till bottom
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
		Thread.sleep(2000);
		//scorroling till up
		driver.findElement(By.xpath("//body")).sendKeys(Keys.CONTROL,Keys.HOME);
	}

}
