package keyboardoperations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class MouseOperations {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome","https://demo.automationtesting.in/Register.html");
		//create istance of action class and pass browser instance to its constructor
		Actions act = new Actions(driver);
		List<WebElement> menulist = driver.findElements(By.cssSelector(".navbar-nav>li>a"));
		
		
		//WebElement homelink = menulist.get(0);
		//act.moveToElement(homelink).perform();
		
		for(int i =0;i<menulist.size();i++) {
			act.moveToElement(menulist.get(i)).perform();
		}
	}

}
