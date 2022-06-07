import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsPractice {

	public static void main(String[] args) throws IOException {

	/*
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("Sagar");
	driver.findElement(By.name("inputPassword")).sendKeys("123456");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Anshu");
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("anshuchocky@gmail.com");
	*/
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\OneDrive\\Desktop\\Sagar.Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freepdfconvert.com/");
		driver.findElement(By.xpath("(//span[@class='btn-label'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		Runtime.getRuntime().exec("C:\\Users\\HP\\OneDrive\\Desktop\\Sagar.Selenium\\uploadAutoIT");
		


	}

}
