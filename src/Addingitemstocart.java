import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addingitemstocart {

	public static void main(String[] args) throws InterruptedException {

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		String[]  vegiesToCart  = {"Mushroom","Corn", "Pista"};
		
		int j=0; 
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<items.size(); i++)
			
		{
			
			String[] veggiesNeeded = items.get(i).getText().split("-");
			String formattedVegName = veggiesNeeded[0].trim();
			
			List itemsToCart = Arrays.asList(vegiesToCart);
				if(itemsToCart.contains(formattedVegName))
				
				{
					j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==vegiesToCart.length)
				
				{
				break;
				}
				
				}
			}
			
	}

}
