package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class IframesDragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace1\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		int a=driver.findElements(By.tagName("iframe")).size();
//		System.out.println(a);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
	WebElement source=driver.findElement(By.xpath("//div[@id='draggable']/p"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']/p"));
	Actions a=new Actions(driver);
	a.dragAndDrop(source, dest).build().perform();
	driver.switchTo().defaultContent();
	
	int a1= driver.findElements(By.tagName("a")).size();//count of links in the page
	System.out.println(a1);
driver.findElement(By.xpath("//*[@id='content']/div[1]/ul/li[2]/a")).click();

	
	//System.out.println(driver.getCurrentUrl());
//		
		
		//driver.quit();
	}

}
