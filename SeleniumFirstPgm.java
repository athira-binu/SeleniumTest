import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFirstPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Driver\\chromedriver_win32 (1)\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 // driver.get("https://www.saucedemo.com/");
		 
		//WebDriverManager
		//WebDriver driver = WebDriverManager.chromedriver().create();
		//driver.get("https://www.saucedemo.com/");
		//diff b/w driver.get and driver.navigate.to
		driver.navigate().to("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String Title = driver.getTitle();
		
		System.out.println("This is the page title --"+Title);
		String URL = driver.getCurrentUrl();
		System.out.println("The URL is -- "+URL);
		
		driver.findElement(By.id("user-name")).click();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	
		//driver.findElement(By.id("user-name")).clear();
		
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		WebElement e = driver.findElement(By.id("login-button"));
		//e.getLocation();
		System.out.println("Location is "+e.getLocation());
		System.out.println("Size is "+e.getSize());
		
		WebElement text = driver.findElement(By.xpath("(//h4)[1]"));
		System.out.println("Location of text is "+text.getCssValue("display"));
		
		//driver.navigate().back();
		//driver.navigate().forward();
		
		
		
		
		
		//driver.navigate().refresh();
		String ps = driver.getPageSource();
		System.out.println("The page source is -- "+ps);
		//driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.close();
		//driver.quit();
		
		
		

	}

}
