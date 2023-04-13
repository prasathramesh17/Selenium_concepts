package Real_Time_Exercise;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table_Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,500)");
	
	Thread.sleep(2000);
	
	js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
	

	
	}

}
