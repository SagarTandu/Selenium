import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class FirefoxNEW {

	public static void main(String[] args) throws InterruptedException {
		
		String S="Anshu";
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		String Password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(S);
		driver.findElement(By.name("inputPassword")).sendKeys(Password);
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
		driver.findElement(By.className("submit")).click();
		Thread.sleep(1000);
		
	    System.out.println(driver.findElement(By.cssSelector("p")).getText());
	    Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "You are successfully logged in.");
	    System.out.println(driver.findElement(By.cssSelector("h2")).getText());
	    Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Hello " +S+",");
	    
	    driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	    Thread.sleep(1000);
	    driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String passwordText = driver.findElement(By.className("infoMsg")).getText();
		String[] passwordArray = passwordText.split("'");
		String[] passwordArray2 = passwordArray[1].split("'");
		String Password = passwordArray2[0];
		return Password;
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
