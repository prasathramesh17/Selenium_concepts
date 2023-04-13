package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) {

		String text = "karthi";
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		// new method to giv knowledge about alert button to selenium
		// -- SWITCH TO method-- will giv knowledge to the browser about --ALERT--
		// accept method is used to simply click ok for alert popup
		System.out.println(driver.switchTo().alert().getText()); // for okay option-accept method

		driver.switchTo().alert().accept();
		driver.findElement(By.id("confirmbtn")).click(); // for cancel option-dismiss method
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();

	}

}
