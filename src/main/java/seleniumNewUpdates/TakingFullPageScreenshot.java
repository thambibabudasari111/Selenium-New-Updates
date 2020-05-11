package seleniumNewUpdates;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qeagle.devtools.webdriver.DevToolsService;

import com.qeagle.devtools.services.ChromeDevToolsService;
import com.qeagle.devtools.utils.FullScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakingFullPageScreenshot {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/ref=cs_503_link/");
		
		//Get the dev tools service
		ChromeDevToolsService devToolsService = DevToolsService.getDevToolsService(driver);
		
		//Take the full screen 
		FullScreenshot.captureFullPageScreenshot(devToolsService, System.getProperty("user.dir")+"/screenshots/fullscreen.png");
		
		//close driver
		driver.close();
	}

}
