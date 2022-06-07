import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException, IOException {
		//String country = "United States (USA)";
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys("unit");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
		driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.cssSelector("input[placeholder='Type to Select Countries']")).getAttribute("value"));
		//getAttribute("value") will gives the word in the text box.
		
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\david\\screenshot1.png"));
		
	}

}