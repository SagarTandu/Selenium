import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class DropdownCheckboxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//below assertion is for false for as of now, that checkbox is not selected and we're expecting false
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='IndArm']")).isSelected());
		
		driver.findElement(By.cssSelector("input[name*='IndArm']")).click();
		
		
		
		//the below syntax is to check whether the checkbox is selected or not. Hence used .selected()//
		driver.findElement(By.cssSelector("input[name*='IndArm']")).isSelected();
		
		//below assertion is for True for as of now, that checkbox is  selected and we're expecting True
		Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='IndArm']")).isSelected());
		
		System.out.println(driver.findElement(By.cssSelector("input[name*='IndArm']")).isSelected());
		
		
		//below syntax is to check - total number of checkboxes are present in the page. Hence used .size()//
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
		
		
	    //below assertion is to compare actual and the result)
		Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),6);
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
	
	}

}
