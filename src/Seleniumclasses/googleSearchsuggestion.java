package Seleniumclasses;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchsuggestion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = 	new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@title='Enter your search term']")).sendKeys("testing");
		List <WebElement> l1= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sa_sg']"));
		System.out.println(l1.size());
	}

}
