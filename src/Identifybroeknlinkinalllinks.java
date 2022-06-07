import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.asserts.SoftAssert;

public class Identifybroeknlinkinalllinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		SoftAssert a = new SoftAssert();
		List<WebElement> links =   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for(WebElement link   :links)
		{
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int repcode = conn.getResponseCode();
			System.out.println(repcode);
			a.assertTrue(repcode<400, "The broken link is "+link.getText()+" with response code "+repcode); //here we've given assertion we're expecting so that it will where did it fail and the error message
			
		}
	      a.assertAll();   //this means it is storing the error and the prenting at the end not in the middle disturbing the program	
	}

}
