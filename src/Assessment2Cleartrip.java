import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assessment2Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		
		WebElement staticDropdown = driver.findElement(By.xpath("(//select[@class='bc-neutral-100 bg-transparent'])[1]"));
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByVisibleText("4");
		
		WebElement staticDropdown1 = driver.findElement(By.xpath("(//div //select[@class='bc-neutral-100 bg-transparent'])[2]"));
		Select dropdown1 = new Select(staticDropdown1);
		dropdown1.selectByVisibleText("2");
		
		driver.findElement(By.cssSelector(".t-all.ml-2")).click();
		driver.findElement(By.className("p-1 day-gridContent flex flex-middle flex-column flex-center flex-top")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Sat Jan 22 2022']")).click();
		
		////div[@class='DayPicker-Week']
		

	}

}
