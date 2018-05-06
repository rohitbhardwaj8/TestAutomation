package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPageFactory {
	
@Test
public void Google_Search() {
	
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String baseURL="http://demo.guru99.com/test/yahoo.html";
	driver.get(baseURL);
	
	WebElement downloadBtn=driver.findElement(By.id("messenger-download"));
	
	
	//WebElement SearchBox=driver.findElement(By.id("lst-ib"));
	//SearchBox.sendKeys("Selenium Automation");
	
	//WebElement SearchButton=driver.findElement(By.xpath("//input[@name='btnK']"));
	//SearchButton.click();
	
	Actions Builder=new Actions(driver);
	
	String actual=driver.getTitle();
	//Assert.assertEquals(actual, "Selenium");
	System.out.println("Page Title is: " + actual);
	
}


}
