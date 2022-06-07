import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/");	
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows = driver.getWindowHandles();
		java.util.Iterator<String> it =   windows.iterator();
		@SuppressWarnings("unused")
		String parentId = it.next();
		String childId1 = it.next();
		String childId2 = it.next();
		driver.switchTo().window(childId2);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
