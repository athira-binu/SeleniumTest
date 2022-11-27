import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSelenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).click();
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		//driver.findElement(By.className("submit-button btn_action")).click();
		
		
		//driver.findElement(By.cssSelector("input[id='login-button']")).click();
		
		//Locator for Linkedtext
		driver.findElement(By.linkText("Facebook")).click();
		
		//Locator for Linkedtext
		//driver.findElement(By.linkText("Face")).click();

	}

}
