import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {

	public static void main(String[] args) {


		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption3")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText());	    
		
		String opt = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
		WebElement staticDropdown = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText(opt);
		
		driver.findElement(By.cssSelector("input[placeholder='Enter Your Name']")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		
		String message = driver.switchTo().alert().getText();

		if(message.contains(opt))
		{
			System.out.println("Success");
		}
		else
			System.out.println("Failure");

		
		
		
		
		
		
	}

}
