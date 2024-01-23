package org.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class SelectClass {
	public static Select select;
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
