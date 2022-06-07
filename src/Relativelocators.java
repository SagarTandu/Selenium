import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Relativelocators {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//above
		WebElement nameTextBox = driver.findElement(By.cssSelector("input[name = 'name']:nth-child(2)"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameTextBox)).getText());
		//below
		WebElement dob = driver.findElement(By.cssSelector("[for=dateofBirth]"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		//left side
		WebElement checkboxLable =   driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(checkboxLable)).click();
		//right side
		WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
		
		
		
		
	}

}
