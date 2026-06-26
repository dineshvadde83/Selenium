package seleniumPractice;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Verify;

public class Basetest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void launch()
	{
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
	}
	
	@Test
	public void flipkart() throws Throwable
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		
		String window = driver.getWindowHandle();
		driver.switchTo()
	      .newWindow(WindowType.TAB).get("https://www.uber.com/in/en/ride/");
		driver.switchTo()
	      .newWindow(WindowType.TAB).get("https://www.amazon.in/amazonpay/home?ref_=nav_cs_apay");
		Set<String> value = driver.getWindowHandles();
		
		for(String window1 : value)
		{
			driver.switchTo().window(window1);
			System.out.println(driver.getTitle() + "during iterations");
		}
		
		driver.switchTo().window(window);
		System.out.println(driver.getTitle() +"after iteration");
	}
	
	//@Test
	public void framepractice() throws Throwable
	{
		WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(5));
		wb.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='button']")));
		
        
        FluentWait<WebDriver> wait = new FluentWait<>(driver)
        		.withTimeout(Duration.ofSeconds(20))
        		.pollingEvery(Duration.ofSeconds(2))
        		.ignoring(NoSuchElementException.class);
       // wait.until(driver -> driver.findElement(By.xpath("//span[@role='button']")));
        WebElement ele = wait.until(driver -> {

            System.out.println("Polling at : " + LocalTime.now());

            return driver.findElement(By.xpath("//span[@role='button']"));
        });
        ele.isDisplayed();
        ele.click();
        System.out.println("Element found at : " + LocalTime.now());
		driver.findElement(By.xpath("//*[text()='Beauty']")).click();
		Thread.sleep(2000);
		driver.switchTo().frame("Flipkart Beauty Glam up 2026 - Day 2");

		 Alert alert = (Alert)driver;
		 alert.accept();
		 
		 Verify.verify(false, "java");
		 	}
	
//	@Test
	public void brokenlinks() throws Exception
	{
		List<WebElement> ls = driver.findElements(By.tagName("a"));
		
		for(int i =0 ;i<ls.size();i++)
		{
			  WebElement href = ls.get(i);
			  
			  String value = href.getAttribute("href");
			  
			  URL url = new URL(value);
			  
			  HttpURLConnection con = (HttpURLConnection) url.openConnection();
			  con.connect();
			  
			  int responsecode = con.getResponseCode();
			  
			  if(responsecode>=400)
			  {
				  System.out.println("broken link");
			  }
			  else
			  {
				  System.out.println("not a broken link");
			  }
			  con.disconnect();
					  }
		
	}

	@Test
	public void verifytitle()
	{
		String title = driver.getTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@AfterClass
	public void quit()
	{
		driver.quit();
	}
	

}
