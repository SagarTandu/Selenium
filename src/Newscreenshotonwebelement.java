import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Newscreenshotonwebelement {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement name = driver.findElement(By.cssSelector("input[name='name']:nth-child(2)"));
		name.sendKeys("12345678.gmail.com");
		File src = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("Screenshot.png"));
		
		//get dimensions
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());

	}

}
