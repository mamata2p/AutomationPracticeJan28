package day4.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class PhoneFinderCount {

	public static void main(String[] args) {
   WebDriver driver = SeleniumUtility.setUp("chrome","https://www.gsmarena.com/");
   List<WebElement> phoneFinderList =  driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
   System.out.println("count is: "+phoneFinderList.size());
   
   for(int  i =0; i<phoneFinderList.size(); i++) {
	   System.out.println("Device name is: "+phoneFinderList.get(i).getText());
   }
   
	}

}
