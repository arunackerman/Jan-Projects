package org.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicityWaitClass {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public  void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\eclipse-workspace\\BaseClass\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

    public static void ExplicitWaitt() {
    	 wait = new WebDriverWait(driver, Duration.ofSeconds(0));
    	
    }
    public static void alertIsPresent() {
    	wait.until(ExpectedConditions.alertIsPresent());
    }
    
    public static void elementToBeClickable(By by) {  //by locator
    	wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    
    public static void elementToBeClickable(WebElement element) {  // by we element
    	wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    
    public static boolean elementToBeSelected(WebElement element) {  // by we element
    	return wait.until(ExpectedConditions.elementToBeSelected(element));
    } 
    
    
    
	
}
