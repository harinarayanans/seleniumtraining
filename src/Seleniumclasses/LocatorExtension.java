package Seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExtension {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = 	new ChromeDriver();
		driver.get("https://www.google.com");
		//XAPTH
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("instagram");
		//driver.findElement(By.name("btnK")).click();
		driver.findElement(By.linkText("Advertising")).click();
	}

}
