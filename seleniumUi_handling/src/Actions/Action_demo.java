package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the window
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com/");

		// To increase readability
		// Webelement move=driver.findElement(By.id("nav-link-accountList"); //-1
		// a.moveToElement(move).build().perform();

		Actions a = new Actions(driver);

		//keydown(pressing->shift-> sendkeys hello->it will turn to capital while shift is pressed along +doubleclick()
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick()
				.build().perform();
		// moves to specific element  //keydown()  //keyup() methods
		
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		
		//right click-> contextclick()
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).contextClick().build().perform();
		
		 //drag and drop  -> one location to another location
		   //drag and drop by -> startbutton horizontal to right(horizontal movement)
		
		//usage of keydown() and keyup() methods
	//	a.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform()
		
		//findelement.sendkeys(keys.chord(keys.control,"z")) -> used to press two keys at a time  ctrl+z

	}

}
