package Selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector(".blinkingText")).click();
	int count=driver.getWindowHandles().size();
	System.out.println(count);
		Set<String> wind=driver.getWindowHandles();
		java.util.Iterator<String> it=wind.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
//		String text=driver.findElement(By.cssSelector(".im-para.red")).getText();
//		System.out.println(text);
//		String[] text1 =text.split("at");
//		System.out.println(text1[1].trim().split(" ")[0]);
		String email=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		driver.switchTo().window(parent);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);
		driver.quit();
		

	}

}
