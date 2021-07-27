package com.Day9_Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Handling_Popup {
	@Test
	public void popup_handling() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Prasanna\\eclipse-workselenium\\Day8_selenium_webdriver\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/");
		driver.findElement(By.linkText("Alert")).click();

		// alert box
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		String message = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(message);

		// confirmbox
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		String msg = driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(msg);

		// promptbox
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		alert.sendKeys("Hellowolrd");
		alert.sendKeys("Hi hello i am prasanna kumar");
		 alert.accept();

		// linebrraks
		// driver.findElement(By.xpath("//button[@onclick='lineBreaks()']")).click();

		// sweet alert
		// driver.findElement(By.xpath("//button[@onclick='sweetalert()']")).click();
		 //String confirmwindow=driver.switchTo().alert().getText();
		 //driver.switchTo().alert().accept();
		 //System.out.println(confirmwindow);

	}

}
