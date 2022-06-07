import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LocatorsOwn {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Sagar.Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("Davidsagar");
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Anshu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("anshu@HSBC.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567890");
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).sendKeys("Anshu");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("p")).getText();
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
	/*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Sagar.Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://admin:admin@the-internet.herokuapp.com/");
			driver.findElement(By.linkText("Basic Auth")).click();
		*/	
	}

}
