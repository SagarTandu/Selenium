import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownAutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Arab");
		Thread.sleep(3000);
		List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option  :options)
		{
			if(option.getText().equalsIgnoreCase("Saudi Arabia"))
			{
				option.click();
				break;
			}
		
		}
	}

}
