package setup;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basetest {
	public static AndroidDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeClass
	@Parameters({"appPackage","appActivity"})
	public void openApplication(String appPackage , String appActivity) throws Exception
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "REALME");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
		cap.setCapability(MobileCapabilityType.NO_RESET, "true");
		driver =new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		//java functions addedd in the  base test
		// changes to master local to master git
		//java 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

//		??Line Deleted

//		Test 123

		
		// I have modified through local branch Dinesh Test 1
  
    // It's Second Branch conflict
		
		// CHanging things in master
		
		//edited in github
	}
	

}
