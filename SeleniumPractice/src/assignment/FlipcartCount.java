package assignment;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.SeleniumUtility;

public class FlipcartCount {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = SeleniumUtility.setUp("chrome", "https://www.flipkart.com/");
		WebDriverWait wait = new WebDriverWait(driver,20);
		try {
			driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(NoSuchElementException e){
			e.printStackTrace();
		}
		
		List<WebElement> flipkartList = driver.findElements(By.cssSelector("._37M3Pb>div>a>*:nth-child(2)"));
		System.out.println("Flipkart List count is : "+flipkartList.size());
		
		//for(int i = 0; i<flipkartList.size();i++) {
		//	System.out.println("Flipkart list is: "+flipkartList.get(i).getText());
		
		for(WebElement element :flipkartList) {
			System.out.println(element.getText());
		}
	 
		  
		for(int i=0; i<flipkartList.size();i++) {
			flipkartList.get(i).click();
		
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
			driver.navigate().back();
			flipkartList = driver.findElements(By.cssSelector("._37M3Pb>div>a>*:nth-child(2)"));
			
			
			
		}
		
		
	}
}
