package day4.seleniumpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class DemoBlazeDeviceCountAndName {

	public static void main(String[] args) {
		WebDriver driver = SeleniumUtility.setUp("chrome","https://www.demoblaze.com/");
		
		List<WebElement> deviceList = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		System.out.println("Device count is: "+deviceList.size());
		
		//get a particular element form the list
		//WebElement element = deviceList.get(0);
		//System.out.println("First Device Name is: "+element.getText());
		
	//	System.out.println("First Device Name is: "+deviceList.get(0).getText());
		
		for(int i =0; i<deviceList.size();i++) {
			System.out.println("Device name is: "+deviceList.get(i).getText());
		}
	}
	

}
