import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.cssSelector("div[id='start'] button")).click();
		
		 Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				 .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		 
		 WebElement submit = wait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		    	 
		    	 if (driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed())
		    	 {
				       return driver.findElement(By.cssSelector("div[id='finish'] h4"));
		    	 }
		    	 else
		    		 return null;
		     }
		   });
		 System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
	}
	
}