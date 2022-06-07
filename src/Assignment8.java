import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment8 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		//push the table into a WebElement
		WebElement table = driver.findElement(By.id("product"));
		//to find number of rows
		System.out.println(table.findElements(By.tagName("tr")).size());
		//to find number of columns
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		
		//to the text present in the 2nd row
		List<WebElement> secondrow =   table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());
		
	}

}
