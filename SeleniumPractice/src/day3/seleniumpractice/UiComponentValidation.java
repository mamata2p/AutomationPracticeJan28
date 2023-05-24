package day3.seleniumpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiComponentValidation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Mamata\\AutomationSession\\Workspace\\SeleniumPractice\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
	    WebElement	firstNameInputField = driver.findElement(By.className("form-control"));
	    System.out.println("First Name Input Field visible or not? "+firstNameInputField.isDisplayed());
	    
	    System.out.println("first Name input field enable or not? "+firstNameInputField.isEnabled());
	     String firstNameInputFieldValue = firstNameInputField.getAttribute("placeholder");
	     System.out.println("Default Value validation status: "+firstNameInputFieldValue.equals("First Name"));
	     
	     //for radio button
	    WebElement maleRadioBtn =  driver.findElement(By.name("radiooptions"));
	    System.out.println("male radio button visible or not? "+maleRadioBtn.isDisplayed());
	    System.out.println("male radio button functional or not? "+maleRadioBtn.isEnabled());
	    System.out.println("male radio button default status? "+maleRadioBtn.isSelected());
	    maleRadioBtn.click();
	    System.out.println("After selection ,status will be "+maleRadioBtn.isSelected());
	    
	   WebElement submitButton  = driver.findElement(By.id("submitbtn"));
	   System.out.println("Submit button visible or not? "+submitButton.isDisplayed()); 
	   System.out.println("Submit button functional or not "+submitButton.isEnabled());
	   String actualButtonName = submitButton.getText().trim();
	   System.out.println("Submit Button Validation status "+actualButtonName.equals("Submit"));
	    
	    
	}

}
