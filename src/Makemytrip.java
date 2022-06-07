import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/flights/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[placeholder='Departure']")).click();
		
		while(!driver.findElement(By.cssSelector(".DayPicker-Caption div")).getText().contains("October"))
		
		{
		
		  
		driver.findElement(By.cssSelector("span[class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
		
	
		}
		
		List<WebElement> days =   driver.findElements(By.className("calDate"));
		int count = driver.findElements(By.className("calDate")).size();
		
		for(int i=0; i<count; i++)
		{
			
			String reqdate = driver.findElements(By.className("calDate")).get(i).getText();
	
			if (reqdate.equalsIgnoreCase("27"))
			{
				driver.findElements(By.className("calDate")).get(i).click();
				break;
			}
		}
		
	}

}
