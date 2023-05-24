package keyboardoperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utilities.SeleniumUtility;

public class CopyPasteOperationUsingMouse {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://demo.automationtesting.in/Register.html");
		WebElement firstNameInputField = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Actions act = new Actions(driver);
		
		firstNameInputField.sendKeys("admin");
		act.moveToElement(firstNameInputField).doubleClick().keyDown(Keys.CONTROL).sendKeys("c"). keyUp(Keys.CONTROL).build().perform();
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}

}
