package MyPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTestClass {
	  			
  @Test
  public void VerifyPageTitle() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="http://demo.guru99.com/test/delete_customer.php";
		driver.get(baseURL);
		
		WebElement custID=driver.findElement(By.xpath("//*[@name='cusid']"));
		custID.sendKeys("rohit");
		driver.findElement(By.xpath("//input[@name='submit']")).submit();
		
		Alert alert=driver.switchTo().alert();
		
		String alertMsg=driver.switchTo().alert().getText();
		
		System.out.println("Alert Message: "+ alertMsg );
		
		Thread.sleep(3000);
		
		alert.accept();
		
		/*
		String expectedTitle = "Welcome: Mercury Tours";
	    String actualTitle = driver.getTitle();
	    Assert.assertEquals(actualTitle, expectedTitle);
	    */
	    
	    
	    driver.close();
}
}

