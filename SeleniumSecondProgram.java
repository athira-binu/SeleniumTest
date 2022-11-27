import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.edge.driver",
		 * "C:\\Users\\user\\Driver\\edgedriver_win64\\msedgedriver.exe"); WebDriver
		 * driver = new EdgeDriver(); driver.get("https://www.saucedemo.com/");
		 */
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.get("https://www.saucedemo.com/");

	}

}
