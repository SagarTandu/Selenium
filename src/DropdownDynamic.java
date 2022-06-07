import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownDynamic {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='VTZ']")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//a[@value=\"BLR\"])[2]")).click();
		
		//in the above line we wrapped xpath in (brackets) and  used index 2 coz there are 2 matchings found with BLR on the same page(nothing but in the FROM tab)
       // in the above Syntax, if we do not want to use index number, then we can use Xpath-parent to child locator which is in below//
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		
	
	
	
	
	
	
	
	}

}
