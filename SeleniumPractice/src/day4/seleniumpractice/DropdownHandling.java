package day4.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utilities.SeleniumUtility;

public class DropdownHandling {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome", "http://demo.automationtesting.in/Register.html");
		WebElement skillDropdown= driver.findElement(By.id("Skills"));
		
		Select selectSkill = new Select(skillDropdown);
		
		System.out.println("dropdown is allow to select multiple option: "+selectSkill.isMultiple());
		
		System.out.println("Already selected option: "+selectSkill.getFirstSelectedOption().getText());
		
		List<WebElement> options = selectSkill.getOptions();
		System.out.println("selectskilllist count is: "+options.size());
		
		for(int i =0;i<options.size(); i++) {
	 		System.out.println("Options are: "+i+":"+options.get(i).getText());
		}
	}

}
