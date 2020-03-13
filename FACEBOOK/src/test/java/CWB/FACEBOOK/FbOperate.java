package CWB.FACEBOOK;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import utility.ConfigReader;

public class FbOperate {

	public static void main(String[] args) throws InterruptedException {
//		Please change the driver path according to your workspace config
		System.setProperty("webdriver.ie.driver", "D:\\webdrivers\\IEDriverServer.exe");

		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION, true);

		WebDriver driver = new InternetExplorerDriver();

		ConfigReader config = new ConfigReader();
		driver.manage().deleteAllCookies();
		driver.get(config.getUrl());

		driver.manage().window().maximize();// maximising window
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// initializing implicit wait in order to use wait in any cases
	

		try {
			if (driver.findElement(By.id("email")).isDisplayed()) {
				System.out.println("Logging in with the given credentials");
				System.out.println(driver.getTitle());
				
				WebElement email = driver.findElement(By.id("email"));
				WebElement password = driver.findElement(By.id("pass"));
				
//			Give correct username and password in config.property file 
				email.sendKeys(config.getUsername());
				password.sendKeys(config.getPassword());

				JavascriptExecutor js = (JavascriptExecutor) driver;

				WebElement login = driver.findElement(By.xpath("//*[@id='loginbutton']"));
				js.executeScript("arguments[0].click();", login);
			}
				
			
		} catch (Exception e) {
			System.out.println("Already logged in");
			e.getMessage();
		}
		Thread.sleep(2000);
//		Link directly goes to URL of the search page else can use below commented code to search 
		driver.get(config.getUrl2());
		
		/*WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(config.getSearchText());
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[contains(text(),'Posts')]")).click();*/
		
		
		
		// driver.quit();
	}
}
