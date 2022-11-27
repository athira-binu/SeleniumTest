import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		WebElement Staticdrop = driver.findElement(By.id("single-input-field"));
		//driver.findElement(By.xpath("//option[@value='Red'][1]")).click();
		//driver.findElement(By.cssSelector("select[id='single-input-field']"))
		
		Select sle = new Select(Staticdrop);
		sle.selectByIndex(1);
		
		sle.selectByValue("Green");
		
		sle.selectByVisibleText("Yellow");
		
		//sle.deselectByIndex(1);

	}

}
