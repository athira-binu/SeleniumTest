import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdownInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.get("https://selenium.obsqurazone.com/jquery-select.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='select2-selection__rendered'])[1]")).click();
		//We are storing dynamic drop down values in the list
		List<WebElement> DropValues = driver.findElements(By.xpath("//li[@role='option']"));
		
		//Iterating through the web element using for each loop
		for(WebElement opt:DropValues) {
			System.out.println("Web Element is "+opt+"!!!!This is the value of Web Element "+opt.getText());
		}

	}

}
