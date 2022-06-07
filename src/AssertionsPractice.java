import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertionsPractice {

	public static void main(String[] args) throws InterruptedException {
		
		String S="Anshu";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(S);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(1000);
	
		System.out.println(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] p")).getText(), "You are successfully logged in.");
	
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Hello "+S+",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();	
		

		
	}

}
