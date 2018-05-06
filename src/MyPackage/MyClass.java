package MyPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyClass {
	@Test(priority=1)
	public void Launch_url() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "E:\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//driver.get("http://demo.guru99.com/selenium/deprecated.html");
	driver.navigate().to("https://www.guru99.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(2000);
	//WebElement upload_file = driver.findElement(By.id("uploadfile_0"));
	//upload_file.
	Set<Cookie> cookies= driver.manage().getCookies();
	for(Cookie i: cookies)
	{
		System.out.println("Name of cookies is:== "+ i +" ==");
		
	}
	driver.manage().deleteAllCookies();
	//driver.manage().deleteCookie(arg0);
	//upload_file.sendKeys("D:\\Rohit\\Rohit Resume Prep Apr- 2018\\Rohit Bhardwaj- QA Automation.docx");
	Thread.sleep(2000);
	WebElement submit = driver.findElement(By.id("submitbutton"));
	submit.click();
	//WebElement hover_text = 
	/*driver.findElement(By.xpath("//*[@id=\"main\"]/h2[2]")).click();
	Thread.sleep(2000);
	WebElement hover_me = driver.findElement(By.xpath("//button[text()='Hover Me']"));
	Actions action = new Actions(driver);
	action.moveToElement(hover_me).build().perform();
	System.out.println("Mouse hover has been done");
	
	action.contextClick(hover_me).build().perform();
	System.out.println("Right click has been done");
	
	WebElement html = driver.findElement(By.xpath("//*[@id=\"topnav\"]/div/div[1]/a[3]"));
	String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,Keys.RETURN); 
	String selectLinkOpeninNewWindow=Keys.chord(Keys.SHIFT,Keys.RETURN);
	//html.sendKeys(selectLinkOpeninNewTab);
	html.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	System.out.println("Opened in new Tab");
	
	//html.sendKeys(selectLinkOpeninNewWindow);
	html.sendKeys(Keys.chord(Keys.SHIFT,Keys.RETURN));
	System.out.println("Opened in new Window");
	action.doubleClick(html);
	System.out.println("Double click has been done");*/
	
//	String expected_title = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
//	String actual_title = driver.getTitle();
//	System.out.println("Title of dashboard is "+actual_title);
//	Assert.assertEquals(actual_title, expected_title,"Title is not matching");
//	if(actual_title.contains("MakeMyTrip"))
//	{
//		System.out.println("Test is passed");
//	}
//	else
//		{
//		System.out.println("Test is failed");	
//			
//		}
//	
//	WebElement from_location = driver.findElement(By.id("hp-widget__sfrom"));
//	from_location.click();
//	Thread.sleep(2000);
//	from_location.sendKeys("New Delhi\n(DEL\n)");
//	WebElement to_location = driver.findElement(By.id("hp-widget__sTo"));
//	
//	to_location.click();
//	Thread.sleep(2000);
//	to_location.sendKeys("Chennai\n(MAA\n)");
//	
//	System.out.println("Tag name of to_location is: "+ to_location.getTagName());
	//driver.close();
	//System.out.println("****Source code of MakeMyTrip is***: "+driver.getPageSource());
	//System.out.println("Current URL is: "+driver.getCurrentUrl());
	//driver.switchTo().frame("classFrame");
	//WebElement deprecated = driver.findElement(By.linkText("Deprecated"));
	//deprecated.click();
	//WebElement go = driver.findElement(By.xpath("//input[@type='button']"));
	//go.clear();
	//go.submit();
	//driver.findElement(By.xpath("//input[@type='button']")).click();
	//Alert go1=driver.switchTo().alert();
	//Thread.sleep(3000);
	//go1.accept();
	//go1.dismiss();
	//System.out.println("Message over alert box is: "+go1.getText());
	//System.out.println("Property of Go button is: "+go.getAttribute("type"));
	//System.out.println("Property of Go button is: "+go.getAttribute("value"));
	//System.out.println("Property onclick of Go button is: "+go.getAttribute("onclick"));
	
	Thread.sleep(2000);
	//driver.navigate().refresh();
	/*System.out.println("Status for go button isDisplayed :"+go.isDisplayed());
	System.out.println("Status for go button isEnabled :"+go.isEnabled());
	System.out.println("Status for go button isSelected :"+go.isSelected());*/
	//go.isDisplayed();
	
	/*WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
	if(radio1.isSelected())
	{
		System.out.println("Button is already selected");	
	}
	else
	{
		radio1.click();
	}*/
	
	
	//go1.sendKeys("Testing");
	
	
	
	}
	
	}
