package Locators;

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	//ID, Name, ClassName, LinkText -> one to one mapping is possible (attribute is present within it)
	
	//Xpath, Css selector -> one to one mapping is not possible
	 //                     -> Generic Locators (Universal & able to build new for any html)
	

	public class Locaters {

	public static void main(String[] args) throws InterruptedException {
	//implicit wait - 2 seconds time out (to show the objects)
	// thread ( used in -> application in the changing state (transition slides )
		
		//.setProperty( "Property name") , ("Property value")
		             //(browser im using) , (location of the the browser driver)
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	
	// interface            //class
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//get() - to locate the url
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);//
	
	//cssselector / Xpath
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
	
	// using INDEX values in css and xpath
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	
	//parentclass/childclass[indexvalue] -> in Xpath
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
	
	
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	
	//         parentclass (space) childclass -> in css selector
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	
	//parentclass - childclass transverse 
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	
	//partial text in css selector (*) used for dynamic values->   Tagname[attribute*='value']
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	
	driver.findElement(By.id("chkboxOne")).click();
	
	//partial text in xpath selector ->    //Tagname[contains(@attribute,'value')]
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	
	driver.manage().window().maximize();
	}

	}


