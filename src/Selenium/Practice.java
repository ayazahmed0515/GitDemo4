package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmad\\eclipse-workspace1\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver  driver=new ChromeDriver();
		
		driver.navigate().to("https://www.makemytrip.com/flight/search?itinerary=NYC-DEL-26/11/2022&tripType=O&paxType=A-1_C-0_I-0&intl=true&cabinClass=E&ccde=US&lang=eng");
		//driver.get("https://www.makemytrip.com/flight/search?itinerary=NYC-DEL-26/11/2022&tripType=O&paxType=A-1_C-0_I-0&intl=true&cabinClass=E&ccde=US&lang=eng");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		int siz=driver.findElements(By.xpath("//div/p[@class='makeFlex blackText']")).size();
		System.out.println(siz);
	List<WebElement> c=driver.findElements(By.xpath("//div/p[@class='makeFlex blackText']"));
	
	java.util.Iterator<WebElement> i=c.iterator();
	while(i.hasNext())
	{
		System.out.println(i.next().getText());
	}
	
		
		System.out.println(c.get(14).getText());
		driver.quit();
		

	}

}
