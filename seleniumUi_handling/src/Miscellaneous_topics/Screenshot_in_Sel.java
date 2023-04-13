package Miscellaneous_topics;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_in_Sel {

	public static void main(String[] args) throws IOException {
	

		System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   //main code to take screenshot
		Files.copy(src,new File("C:\\Users\\Prasath\\screenshot.png"));           // location of the screenshot
                                    //provide a location
	}

}
