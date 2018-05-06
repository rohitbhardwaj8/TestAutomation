package MyPackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PopupTestClass {
	  			
  @Test
  public void TestWindowPopups() throws InterruptedException {
	  	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL="http://www.naukri.com/";
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();
		
		String parent=driver.getWindowHandle();
		
		Set<String> s1=driver.getWindowHandles();
		
		Iterator<String> I1=s1.iterator();
		
		while(I1.hasNext()) {
			String child_window=I1.next();
			if(!parent.equals(child_window))
			{
				driver.switchTo().window(child_window);
				System.out.println(driver.switchTo().window(child_window).getTitle());
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		
		/*
		for (String currentWindowHandle : allWindows)
		{
			
		}
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

