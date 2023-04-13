package ui_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_ui {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		 
		 driver.findElement(By.xpath("//a[@value='MAA']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active']//a[@value=''")).click();
		//error in line 20
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		//a[@class='ui-state-default ui-state-highlight ui-state-active']
	
		 // validation of enable and disable features
	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	
	}
}
