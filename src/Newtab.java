import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Newtab {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		//you can switch yo new window by WindowTyPe.Window
		
		Set<String> totalwindows = driver.getWindowHandles();
		Iterator<String> it= totalwindows.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		driver.switchTo().window(childWindow);
		driver.get("https://courses.rahulshettyacademy.com/courses");
		System.out.println(driver.findElement(By.cssSelector("[title='All-Access Membership']")).getText());
		String text = driver.findElement(By.xpath("(//a/div/div[2])[1]")).getText();
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector("input[name='name']:nth-child(2)")).sendKeys(text);
	}

}
