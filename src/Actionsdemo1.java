import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionsdemo1 {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions c= new ChromeOptions();
        c.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(c);
		driver.get("http://automationpractice.com/index.php");
		//WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		Actions a = new Actions(driver);
		
		//below step is to move to specific element and right click. Above we've declared the the required WebElement to 'move'//
		//a.moveToElement(move).contextClick().build().perform();
		//Thread.sleep(3000);
		List <WebElement> elements = driver.findElements(By.className("img-responsive"));
		int count = elements.size();
		System.out.println(count);
		/*
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("pubg").doubleClick().build().perform();
		
		/*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions c= new ChromeOptions();
		WebDriver driver = new ChromeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://www.planetsuperheroes.com/");
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		WebElement box = driver.findElement(By.xpath("//input[@type='search']"));
		String textinBox = box.getAttribute("value");
		
		for(int i=0; i<=2; i++)
		{
			if(textinBox.contains("Spiderman"))
			{
				System.out.println("Text is present");
			}
			else
			{
				System.out.println("Text is not present");4er
			    driver.navigate().refresh();
			}
		}
		System.out.println("Test is failed");	 
		
		System.out.println(driver.findElement(By.xpath("//input[@type='search']")).getAttribute("placeholder"));
		System.out.println(driver.findElement(By.cssSelector("div[class='ff-montserrat fs-28 fw-600 f-style-normal f-stretch-normal lh35 l-spacing-normal fc-black31 mb-3 mt-5']")).getText());
	    
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
	
		
	
		driver.get("http://automationpractice.com/index.php");	
		List <WebElement> element= driver.findElements(By.linkText("Women"));
		int n = element.size();
		System.out.println(n);
		boolean j = driver.findElement(By.linkText("Women")).isDisplayed();
		System.out.println(j);
		*/
	}

}