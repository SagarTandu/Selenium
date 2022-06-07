import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Scrollonwebpage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to scroll on a webpage
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		
		//after scrolling on the page, to scroll to a particular element, ex: box in a page.
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");
		
		List<WebElement> values =   driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for(int i=0;i< values.size(); i++)
		{
			values.get(i).getText();                      // <-- this is a String
			Integer.parseInt(values.get(i).getText());   //to convert string to integer= Integer.parseInt//
			sum = sum+ Integer.parseInt(values.get(i).getText()); //to sum all the values	
		}
		
		System.out.println(sum);
		
		int total = (Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim()));

		Assert.assertEquals(sum, total);
		
		
	}

}
