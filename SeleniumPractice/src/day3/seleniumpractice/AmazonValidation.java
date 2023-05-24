package day3.seleniumpractice;

import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class AmazonValidation {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("firefox", "https://www.amazon.in");
		driver.get(null);
	}

}
