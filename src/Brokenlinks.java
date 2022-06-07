import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Brokenlinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//1. we should call the URL using selenium
		String url = driver.findElement(By.cssSelector("a[class='gb_1 gb_2 gb_2d gb_2c']")).getAttribute("href");  //this is the link that we need to find valid or broken.
		
		//2.Java method to call the URL and to know the status code
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int repcode = conn.getResponseCode();
		
		System.out.println(repcode);
		
		
		
		
		
		
	
		
		
		
	}

}
