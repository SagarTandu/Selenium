import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DropdownUpdated {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		
		//we need 4 passengers, by default there will be 1 selected, so we need to click 3 times//
		//for that we use 'for' or 'while' loop//
		
		//while loop - we have to split the loop
      /*   int i=1;
		   While (i<5)
		   driver.findElement(By.id("hrefIncAdt")).click();
		   i++;     */
		
	for(int i=1; i<4;i++)
	{
		driver.findElement(By.id("hrefIncAdt")).click();
	}
	    
	    driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.className("paxinfo")).getText());
		Assert.assertEquals(driver.findElement(By.className("paxinfo")).getText(), "4 Adult");

	

		
		

	}

}
