package Real_Time_Exercise;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;                             // every link starts with an anchor taga as <a>...</a>
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;                               //  requirements
                                                              
public class Counting_Links {                                     //1--> count of links in the complete webpage
                                                                  //2--> count of links in the footer section only
	                                                              //3--> count of links in particular column only
	                                                              //4--> click on every link to see page is opening or not
	                                                              //5--> get title of every page appeared in different window
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		// to count all the link present in webpage 
		
		System.out.println(driver.findElements(By.tagName("a")).size());

		// to count link only in footer
		//create a webelement          //select locator where footer is present 
		  // with variable footer
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//to count in particular columns only
		
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//to click every link to see page actions   (ctrl key + click)= link opens in new tab no needed to get inside  
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
		String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			
			Thread.sleep(5000L);
		}   
		                                                    //to get titles
			Set<String> abc = driver.getWindowHandles();      // 4 windows
			
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext())                               //   .hasnext() -->checks whether  next window present or not
			{
				driver.switchTo().window(it.next());          // .next() --> moves to the next window
				System.out.println(driver.getTitle());        // helps in getting the webpage titles
			}
		}
		
	}


