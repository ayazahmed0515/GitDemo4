package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountnoOFCheckBoxesonPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace1\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\executables\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/flight/search?itinerary=NYC-DEL-26/11/2022&tripType=O&paxType=A-1_C-0_I-0&intl=true&cabinClass=E&ccde=US&lang=eng");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		int a1=driver.findElements(By.xpath("//*[@class='customCheckbox']")).size();
		System.out.println(a1);
		driver.findElement(By.xpath("//*[@id='toCity']")).click();
		//int b=driver.findElements(By.xpath("//p[@class='makeFlex blackText']")).size();
		//System.out.println(b);
		List<WebElement> c=driver.findElements(By.xpath("//div/p[@class='makeFlex blackText']"));
		
		java.util.Iterator<WebElement> i=c.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().getText());
		}
		System.out.println(c.get(3).getText());
		driver.quit();
	}

}
