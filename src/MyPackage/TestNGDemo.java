package MyPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
	  			
  @Test
  public void VerifyPageTitle() {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="http://demo.guru99.com/test/newtours";
		driver.get(baseURL);
		
		String expectedTitle = "Welcome: Mercury Tours";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    driver.close();
}
}

