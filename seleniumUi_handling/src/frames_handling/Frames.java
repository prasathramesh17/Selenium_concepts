package frames_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//.frame(int arg)
		//.frame(String arg)
		//.frame(Webelement arg)
		
		driver.get("http://jqueryui.com/droppable/");
		                //(webelement arg)
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));   //switchTo.frame--> webelement arg
		
		driver.findElement(By.id("draggable")).click();                                               //checked
		
		Actions a = new Actions(driver);// (to overcome mouse and keybrd events)                          //actions class
		
		WebElement source = driver.findElement(By.id("draggable"));                                   // source,target variable
		WebElement target = driver.findElement(By.id("droppable"));
		
		a.dragAndDrop(source, target).build().perform();                                              //dragAndDrop(source, target)
		
		// To check whether you have frames in ur application and to count it
				System.out.println(driver.findElements(By.tagName("iframe")).size());                // to count frames
				
				driver.switchTo().defaultContent();                                                 // to come out from frame and select outside frame
				
				
				driver.findElement(By.name("s")).sendKeys("Effects");
				
			WebElement suggest = driver.findElement(By.className("algolia-docsearch-suggestion--title"));
				
		//	a.moveToElement(suggest).click().perform().
	}

}
