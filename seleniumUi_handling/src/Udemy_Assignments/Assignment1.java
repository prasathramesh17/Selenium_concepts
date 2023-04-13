package Udemy_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
			driver.findElement(By.id("checkBoxOption1")).click();
			driver.findElement(By.id("checkBoxOption2")).click();
			driver.findElement(By.id("checkBoxOption3")).click();
			
			System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
			
		/*	 assignment correct answer
			driver.findElement(By.id("checkBoxOption1")).click();

			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print True

			driver.findElement(By.id("checkBoxOption1")).click();

			System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected()); //Should Print false

			driver.findElements(By.cssSelector("input[value='checkbox']")).size(); */
	}

}
