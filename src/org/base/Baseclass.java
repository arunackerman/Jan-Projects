package org.base;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import javax.tools.ForwardingJavaFileManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Baseclass {
	public static WebDriver driver;
	public static WebElement elementName;
	public static Wait<WebDriver>wait;
	public static Select select;
	public static Alert alert;
	
	public  void browserLaunch(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hello\\eclipse-workspace\\BaseClass\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static void webElement(By by) {

		 elementName = driver.findElement(by);
	}
	
	public static void clear(WebElement element) {
		element.clear(); 
	}
	
	public static String getAttribute(WebElement element, String attribute) {
		String attributeValue = element.getAttribute(attribute);
		return attributeValue;
	}
	
	public static boolean isEnabled(WebElement element) {
		boolean isEnabled = element.isEnabled();
		return isEnabled;
	}
	
	public static boolean isSelected(WebElement element) {
		boolean isSelected = element.isSelected();
		return isSelected;
	}
	
	public static boolean isDisplayed(WebElement element) {
		boolean isDisplayed = element.isDisplayed();
		return isDisplayed;
	}
		
	public static void sendKeys(By by , String value) {
		driver.findElement(by).sendKeys(value + Keys.ENTER);
	}
	
	public static void webElements(By by, List<WebElement>elements) {
		elements = driver.findElements(by);
	}
	
	public static String getCurrentUrl(String getCurrentUrl) {
		getCurrentUrl = driver.getCurrentUrl();
		return getCurrentUrl;
	}
	
	public static String title(String title) {
		title = driver.getTitle();
		return title;
	}
	
	public static String windowHandle(String window) {
		window = driver.getWindowHandle();
		return window;
	}
	
	public static void windowHandles(Set<String>windows) {
		windows = driver.getWindowHandles();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void back() {
		driver.navigate().back();
	}
	
	public static void forward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	public static void toString(String value) {
		driver.navigate().to(value);
	}
	
	public static void toUrl(String url) {
		driver.navigate().to(url);
	}
	

	public static void click(By by) {
		driver.findElement(by).click();
	}
	
	public static void takesScreenShot(String path) throws IOException {
		TakesScreenshot screenShot = (TakesScreenshot)driver;
		File source = screenShot.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\hello\\eclipse-workspace\\BaseClass\\ScreenShots\\" + path);
		FileHandler.copy(source, target);
		
	}
	
	public static void implicitlyWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	
	public static void fluentWait(long time1, long time2) {
		wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(time1)).pollingEvery(Duration.ofSeconds(time2));
	}
	
	public static void thread(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void accept() {
		alert.accept();
	}
	
	public static void dismiss() {
		alert.dismiss();
	}
	
	public static String getText() {
		String getText = alert.getText();
		return getText;
	}
	
	public static void sendKeys(String text) {
		alert.sendKeys(text);
	}
	
	public static void selectClass(WebElement element) {
		 select = new Select(element);
	}
	
	public static void selectByIndex(int indexValue) {
		select.selectByIndex( indexValue);
	}
	
	public static void selectByValue(String value) {
		select.selectByValue(value);
	}
	
	public static void selectBy(String visibleText) {
		select.selectByVisibleText(visibleText);
	}
	
	public static void deselectAll() {
		select.deselectAll();
	}
	
	public static void deselectByIndex(int indexValue) {
		select.deselectByIndex(indexValue);
	}
	
	public static void deselectByValue(String value) {
		select.deselectByValue(value);
	}
	
	public static void deselectByVisibleText(String visibleText) {
		select.deselectByVisibleText(visibleText);
	}
	

}
