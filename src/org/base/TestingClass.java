package org.base;

import java.io.IOException;
import java.sql.Time;

import org.openqa.selenium.By;

public class TestingClass extends Baseclass{

	public static void main(String[] args) throws IOException {
		TestingClass t = new TestingClass();
		t.browserLaunch("https://www.google.com/");
		//implicitlyWait(6);
		t.maximize();
		t.sendKeys(By.xpath("//textarea[@jsname=\"yZiJbe\"]"), "google.com");
		webElement(By.xpath("(//h3[text() = \"Google\"])[1]"));
        click(By.xpath("//h3[text() = \"TV Series Anime\"]"));
        takesScreenShot("screenShot1.png");
        
	}
}
