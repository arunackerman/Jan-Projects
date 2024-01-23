package org.base;

import org.openqa.selenium.Alert;

public class AlertClass {
	public static Alert alert;
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
	
	
	
	
}
