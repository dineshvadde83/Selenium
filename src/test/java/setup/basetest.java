package setup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class basetest {
 // @Test
  public void testmethod1() {
	  System.out.println("testmethod1");
	  
	  ArrayList<Integer> list = new ArrayList<>();
	  list.add(1);
	  list.add(2);
	  list.add(3);
	  
	  list.forEach(
			  e->System.out.println(list));
  }
  @Test (priority= -1)
  public void testmethod5() {
	  System.out.println("testmethod5");
  }
  @Test
  public void testmethod2() {
	  System.out.println("testmethod2");
  }
  @Test(priority=1)
  public void testmethod3() {
	  System.out.println("testmethod3");
  }
  @Test(priority=2)
  public void testmethod4() {
	  System.out.println("testmethod4");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }
 

  @BeforeTest
  public void beforeTest() {
	  System.out.println("BeforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("AfterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("BeforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
