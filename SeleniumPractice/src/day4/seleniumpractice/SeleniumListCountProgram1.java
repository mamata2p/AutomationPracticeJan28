package day4.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class SeleniumListCountProgram1 {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.google.com");
		
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		//.G43f7e>li>div>*:nth-child(2)>div>*:first-child>span
		//identify all google suggession.
		List<WebElement> suggessionList = driver.findElements(By.cssSelector("ul[class = 'G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
		System.out.println("Total Suggestion Count: "+suggessionList.size());
		
		//print the suggesssion
		
		for(int i =0; i<suggessionList.size();i++) {
			suggessionList = driver.findElements(By.cssSelector("ul[class = 'G43f7e']>li>div>*:nth-child(2)>div>*:first-child>span"));
			WebElement suggession = suggessionList.get(i);
			System.out.println("Suggession "+i+":"+suggession.getText());
		}
	}

}
