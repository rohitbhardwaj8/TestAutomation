package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchMMT {
	
	@Test
	public void Flight_search()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.makemytrip.com/");
		WebElement FromCity = driver.findElement(By.id("hp-widget__sfrom"));
		FromCity.sendKeys("New Delhi");
		
	}

}
