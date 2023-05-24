package keyboardoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseOver2 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		Actions act = new Actions(driver);
		
		List<WebElement> menulist = driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		WebElement webTableLink = menulist.get(2);
		act.moveToElement(webTableLink,100,0).perform();
	}

}
