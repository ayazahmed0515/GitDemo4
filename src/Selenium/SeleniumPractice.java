package Selenium;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.Arrays.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumPractice {

	public static void main(String[] args) {
		//1)Capture tool tip text
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.navigate().to("https://userguiding.com/blog/tooltip-examples-best-practices/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		WebElement buttons=driver.findElement(By.cssSelector(".cta_button.btn.btn-danger"));
//		Actions action=new Actions(driver);
//		action.moveToElement(buttons);
//		String ToolTipText=buttons.getAttribute("title");
//		System.out.println(ToolTipText);
//		driver.quit();
		
		//2)How to handle child windows
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.findElement(By.cssSelector(".blinkingText")).click();
//		int siz=driver.getWindowHandles().size();
//		System.out.println(siz);
//		Set<String> win=driver.getWindowHandles();
//		java.util.Iterator<String> it=win.iterator();
//		String parent=it.next();
//		String child=it.next();
//		driver.switchTo().window(child);
//		String email=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
//		driver.switchTo().window(parent);
//		driver.findElement(By.cssSelector("input#username")).sendKeys(email);
//		driver.quit();
//		
		//3) Handle iframes and draganddrop
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.navigate().to("https://jqueryui.com/droppable/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		int count=driver.findElements(By.tagName("iframe")).size();
//		System.out.println(count);
//		driver.switchTo().frame(0);
//		WebElement source=driver.findElement(By.cssSelector("div#draggable"));
//		WebElement dest=driver.findElement(By.cssSelector("div#droppable"));
//		Actions action=new Actions(driver);
//		action.dragAndDrop(source, dest).build().perform();
//		driver.switchTo().defaultContent();
//		driver.findElement(By.cssSelector("#sidebar > aside:nth-child(1)>ul>li:nth-child(1) >a")).click();
//		
		
		//4) Count number of dropdowns available, display all the dropdowns and also display the 4th one
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
//		driver.navigate().to("https://www.makemytrip.com/flight/search?itinerary=NYC-DEL-26/11/2022&tripType=O&paxType=A-1_C-0_I-0&intl=true&cabinClass=E&ccde=US&lang=eng");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.cssSelector("#toCity")).click();
//		int count=driver.findElements(By.cssSelector("p.makeFlex.blackText")).size();
//		System.out.println(count);
//		List<WebElement> drpdwn=driver.findElements(By.cssSelector("p.makeFlex.blackText"));
//		java.util.Iterator<WebElement> it=drpdwn.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next().getText());
//		}
//		System.out.println(drpdwn.get(3).getText());
		
		
		//5) Count number of check boxes, print the checkboxes names and check the 6th checkbox
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.macys.com/shop/mens-clothing/deals-of-the-day?id=65071&edge=hybrid");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#PRODUCT_DEPARTMENT>h2>span")).click();
		int count=driver.findElements(By.cssSelector("#PRODUCT_DEPARTMENT>div>ul>li>a")).size();
		System.out.println(count);
		List<WebElement> checkboxes=driver.findElements(By.cssSelector("#PRODUCT_DEPARTMENT>div>ul>li>a"));
		java.util.Iterator<WebElement> it=checkboxes.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getText());
		}
		System.out.println(checkboxes.get(5).getText());
		driver.findElement(By.cssSelector("#PRODUCT_DEPARTMENT >div>ul>li:nth-child(5)>a")).click();
		
		
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
