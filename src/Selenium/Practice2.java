package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		int siz=driver.findElements(By.tagName("iframe")).size();
		System.out.println(siz);
		//driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement source=driver.findElement(By.xpath("//div[@id='draggable']/p"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable']/p"));
		Actions a=new Actions(driver);
		a.dragAndDrop(source, dest).build().perform();
		driver.switchTo().defaultContent();
		int b=driver.findElements(By.tagName("a")).size();
		System.out.println(b);
		
		
		

	}

}
