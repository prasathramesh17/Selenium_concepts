package Miscellaneous_topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;                        //By-passing of unsecure certificate by behaviour options of chrome

public class Https_certifications {                                      // * sending options--> within= new chromeDriver(Options);

	public static void main(String[] args) {
		//setting behaviour how chrome should work
		
		ChromeOptions options = new ChromeOptions();                      //proxy setup commonly used with chrome behaviour options //section-106
		
		// accept insecure certificates
		options.setAcceptInsecureCerts(true);
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://expired.badssl.com/");
		//getting title of insecurewebpage
		
		System.out.println(driver.getTitle());

	}

}
