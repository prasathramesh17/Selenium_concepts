package Miscellaneous_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Max_Window_Delete_Cookie {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();   //first maximize the window and then finds the url
		
		driver.manage().deleteAllCookies();        //to delete all the cookies in the browser (every option available within manage().
		
		driver.manage().deleteCookieNamed("---");   //to delete a particular cookie which is named
		
		
		
		
		driver.get("http://google.com");
	}

}
