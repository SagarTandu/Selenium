import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scopeselenium {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		// WebDriverManager.firefoxdriver().setup();

		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// 1. to find total number of links in the page.Every link has a tagname "a" -
		// Anchor
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. to find the number of links in the footer section, so here we have to
		// limit the driver to only footer so create a driver to that particular footer.
		// this is called limiting WebDriver scope.
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3. to find the number of links in the first column of footer.

		WebElement Column1driver = footerdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));

		for (int i = 1; i < Column1driver.findElements(By.tagName("a")).size(); i++)

		{
			String linksToClick = Keys.chord(Keys.CONTROL, Keys.ENTER);
			Column1driver.findElements(By.tagName("a")).get(i).sendKeys(linksToClick);

			// to get the title of all the opened windows.

			Thread.sleep(3000);
		}
		Set<String> difflinks = driver.getWindowHandles();

		Iterator<String> it = difflinks.iterator();
		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}