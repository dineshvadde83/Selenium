package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.basetes.Loginflow;


public class Login extends Loginflow{
	
	 @Test
	    public void verifyTitle() {
	        String title =driver.getTitle();
	        System.out.println("Page title is: " + title);
	        Assert.assertEquals(title, "Example Domain"); // Adjust according to your site
	    }

}
