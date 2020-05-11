package seleniumNewUpdates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MinimizeBrowser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize(); // To minimize the browser
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

}
