import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("#password")).sendKeys("learning");
		driver.findElement(By.cssSelector("label[class='customradio']:nth-child(2)")).click();
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("Select[class='form-control']")));
		WebElement options = driver.findElement(By.cssSelector("Select[class='form-control']"));
		Select dropdown = new Select(options);
		dropdown.selectByIndex(2);
		driver.findElement(By.cssSelector("#terms")).click();
		driver.findElement(By.id("signInBtn")).click();	
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".nav-link.btn.btn-primary")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		List<WebElement> mobiles =  driver.findElements(By.cssSelector(".btn.btn-info"));	
		for(int i=0; i<mobiles.size(); i++)
		{
			mobiles.get(i).click();
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".nav-link.btn.btn-primary")));
		driver.findElement(By.cssSelector(".nav-link.btn.btn-primary")).click();
				
	}

}
