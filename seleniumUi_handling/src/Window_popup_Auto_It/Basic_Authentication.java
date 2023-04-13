package Window_popup_Auto_It;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Authentication {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/");
		//bypass the username & pwd within the url 
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
				
			//	http://username:password@siteURL"
		driver.findElement(By.linkText("Basic Auth")).click();

	}

}
