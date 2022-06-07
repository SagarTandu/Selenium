import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sslcertification {

	public static void main(String[] args) {

		//1. Import DesiredCapabilities to customize our browser. It is a class to customize the browser.
		DesiredCapabilities ed = new DesiredCapabilities();
		ed.acceptInsecureCerts();
		ed.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ed.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		//2. Merge this DesiredCapabilities to our browser.
		EdgeOptions c = new EdgeOptions();
		c.merge(ed);
		
		//3. 
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(c);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println("The page title is : " +driver.getTitle());
		
		
		
		
	}

}
