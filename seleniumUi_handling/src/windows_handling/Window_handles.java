package windows_handling;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handles {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		

		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");  //parentid
		
		driver.findElement(By.className("blinkingText")).click();        //childid  --by clicking the link it takes to another window
		
		Set<String> windows = driver.getWindowHandles();   // .getwindowhandles--> return type--> set<string>
		
		Iterator<String>it = windows.iterator();          // iterator method-->return type--> iterator<string>
		
		String parentId = it.next();                      //.next()--> return type--> string
		
		String childId = it.next();
		
		
		driver.switchTo().window(childId);               // switching between windows --> .switchTo().window( id )
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(parentId);
		
	//	driver.findElement(By.id("username")).sendKeys(args)
		
		
		
		

	}

}
