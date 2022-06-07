import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Itemstocartrevision {



	public static void main(String[] args) throws InterruptedException {
		
		String[] VegNeedInCart = {"Brinjal", "Potato", "Grapes"};
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@alt='Cart']")));
		Itemstocartrevision.onlineCart(driver, VegNeedInCart);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
	    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	    driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
		
		
	
}
			

	public static void onlineCart(WebDriver driver, String[] VegNeedInCart)
	
	
	
	{
		int j=0;
		List<WebElement> itemsInPage = driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0; i<itemsInPage.size(); i++)
		{
			String[] VegNames = itemsInPage.get(i).getText().split("-");
			String FormattedVegNames = VegNames[0].trim();
			List  itemsList= Arrays.asList(VegNeedInCart);
			
			if(itemsList.contains(FormattedVegNames))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==VegNeedInCart.length)
				{
					break;
				}

			}		
				
		}		
				
	}

}