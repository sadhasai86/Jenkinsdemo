package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void testJenkins() {
	  System.out.println("welcome to jenkins world");
	  
	  WebDriver driver = new FirefoxDriver();
	  
	  driver.get("https://www.facebook.com/");
	  
	  System.out.println(driver.getTitle());
	  
	  driver.close();
	  
  }
}
