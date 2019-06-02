package Seleniumclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ff browser
		System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
		WebDriver driver = 	new FirefoxDriver();
		
		//chrome browser
		//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//WebDriver driver = 	new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
