import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsInSeleniumPgm2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).click();
		driver.findElement(By.name("password")).sendKeys("admin123");
		//driver.findElement(By.className("oxd-input oxd-input--active")).sendKeys("admin123");
		
		//driver.findElement(By.tagName("button")).click();
		//Thread.sleep(5000);
		
		//driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		//Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Orange")).click();
		//Thread.sleep(3000);
		

	}

}
