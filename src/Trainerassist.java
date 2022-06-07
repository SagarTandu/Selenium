import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Trainerassist {

	public static void main(String[] args) {
		
		
		
		//Create instance of ChromeOptions Class
				ChromeOptions handlingSSL = new ChromeOptions();
		 
				//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
				handlingSSL.setAcceptInsecureCerts(true);
						
				//Creating instance of Chrome driver by passing reference of ChromeOptions object
				WebDriver driver = new ChromeDriver(handlingSSL);
				
				//Launching the URL
				driver.get("https://expired.badssl.com/");
				System.out.println("The page title is : " +driver.getTitle());
				driver.quit();
				
				
				
				
				
		
	}

}
