package day4.seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class PhoneFinder {

	public static void main(String[] args) {
    WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.gsmarena.com/");
    driver.findElement(By.linkText("samsung-phones-9.php")).click();
    
	}

}
