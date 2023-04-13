package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	
	driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).click();
	System.out.println(driver.findElement(By.cssSelector("input[id='ctl00_mainContent_view_date2']")).isSelected());
	
	driver.findElement(By.cssSelector("input[id='ctl00_mainContent_chk_friendsandfamily']")).click();
	
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	}
}
