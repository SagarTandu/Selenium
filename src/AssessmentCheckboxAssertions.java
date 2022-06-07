import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssessmentCheckboxAssertions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
	
		System.out.println(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		
	
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).click();
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name='checkBoxOption1']")).isSelected());
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).getSize();
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());
		
		
	
	}
	
	

}
