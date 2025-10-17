package com.basetes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginflow {
	
	public  WebDriver driver;
	
@BeforeClass
public void loginfunctionalities ()
{
	ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");       // Maximize window
    options.addArguments("--disable-notifications"); // Disable popups
    options.addArguments("--incognito");             // Incognito mode
    // options.addArguments("--headless");          // Uncomment for headless mode

    // Initialize WebDriver
    driver = new ChromeDriver(options);

    // Navigate to your base URL
    driver.get("https://example.com");
    System.out.println("Browser launched with ChromeOptions and navigated to URL");
}

@AfterClass
public void tearDown() {
    if (driver != null) {
        driver.quit();
    }
    System.out.println("Browser closed");
}
}
