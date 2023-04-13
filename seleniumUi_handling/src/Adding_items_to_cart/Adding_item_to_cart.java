package Adding_items_to_cart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adding_item_to_cart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] itemsNeeded= {"Cucumber","Brocolli"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++)
		{
			String name=products.get(i).getText();
			
			//converting array to arraylist
			// list al= Arrays.asList(null)
		//	List itemsNeeded=Arrays.asList(itemsNeeded);
			if(name.contains("Cucumber"))
			{
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}

}
