package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureToolTipText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"/Users/ahmad/OneDrive/Documents/Browsers/chromedriver-win64/chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.get("https://userguiding.com/blog/tooltip-examples-best-practices/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement button=driver.findElement(By.xpath("//a[@class='cta_button btn btn-danger']"));
		Actions a=new Actions(driver);
		//System.out.println("Hello");
		a.moveToElement(button);
		String ToolTipText=button.getAttribute("title");
		System.out.println(ToolTipText);
		System.out.println("Hello1");
		System.out.println("Hello2");
		System.out.println("Hello3");
		System.out.println("Hello4");
		System.out.println("Hello5");
		driver.quit();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://userguiding.com/blog/tooltip-examples-best-practices/");
//		driver.manage().window().maximize();
//		WebElement Pricing= driver.findElement(By.xpath("//a[@class='cta_button btn btn-danger']"));
//		Actions actions=new Actions(driver);
//		actions.moveToElement(Pricing);
//		String ToolTipText=Pricing.getAttribute("title");
//		System.out.println(ToolTipText);
//		driver.quit();
		

	}

}
