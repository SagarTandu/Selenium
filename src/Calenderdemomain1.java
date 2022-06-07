import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calenderdemomain1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("October"))
		{
		
			driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
			
		}
		
		
		List<WebElement> days = driver.findElements(By.cssSelector(".day"));
		
		int dayCount = driver.findElements(By.cssSelector(".day")).size();
		
		for (int i=0; i<dayCount; i++)
		{
			String reqday = driver.findElements(By.cssSelector(".day")).get(i).getText();
			
			if(reqday.equalsIgnoreCase("27"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		 	
		}
		
		
	}

}
