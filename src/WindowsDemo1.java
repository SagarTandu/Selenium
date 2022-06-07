
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsDemo1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);

		driver.manage().window().maximize();
	/*	driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.className("blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator(); 
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@class='im-para red']")).getText());
		
		driver.findElement(By.xpath("//*[@class='im-para red']")).getText();
		String emailId = driver.findElement(By.xpath("//*[@class='im-para red']")).getText().split("at")[1].trim()
				.split(" ")[0];
		driver.switchTo().window(parentId);
		driver.findElement(By.cssSelector("#username")).sendKeys(emailId); 
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); */
		
		
		driver.get("https://www.flipkart.com/");
		act.sendKeys(Keys.ESCAPE).build().perform();
		//driver.navigate().refresh();
		//driver.get(driver.getCurrentUrl());
		driver.findElement(By.linkText("Login")).sendKeys(Keys.F5);
		
		/*
		//String escape = Keys.chord(Keys.ESCAPE);
		act.sendKeys(Keys.ESCAPE).build().perform();
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		WebElement footerlink = driver.findElement(By.xpath("//div[@class='_2WErco row']"));
		List<WebElement> lastLinks = footerlink.findElements(By.tagName("a"));
		System.out.println(lastLinks.size()+": total links");
		
		for(int i=0; i<lastLinks.size(); i++)
		{
			String clickall = Keys.chord(Keys.CONTROL, Keys.ENTER);
			lastLinks.get(i).sendKeys(clickall);
			System.out.println(lastLinks.get(i).getAttribute("href"));
			System.out.println(lastLinks.get(i).getText());
		}  */
	}		
}