import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Itemstocartract {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		String[] veggiesToCart = {"Beetroot","Potato","Orange"};
		
		int j= 0;
		
		List<WebElement> items = driver.findElements(By.cssSelector("h4[class='product-name']"));
	
		
		for(int i=0; i<items.size(); i++) {
			
			String[] itemsNeeded = items.get(i).getText().split(" ");
			
			String modifiedVegName = itemsNeeded[0].trim();
			
			List itemsList = Arrays.asList(veggiesToCart);
			
			
			if(itemsList.contains(modifiedVegName)) {
				
				j++;
				
				driver.findElement(By.xpath("//div[@class='product-action']/button")).click();
				
				if(j==veggiesToCart.length);
				break;
				
			}
		}

	}

}
