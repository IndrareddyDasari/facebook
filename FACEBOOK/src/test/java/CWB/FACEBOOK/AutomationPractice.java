package CWB.FACEBOOK;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();// maximising window
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// initializing implicit wait in order to use wait in any cases

		driver.findElement(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email_create")).sendKeys("bharathmotta2@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();

		driver.findElement(By.id("uniform-id_gender1")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Bharath");
		driver.findElement(By.id("customer_lastname")).sendKeys("Motta");
		driver.findElement(By.id("passwd")).sendKeys("password");

		driver.findElement(By.xpath("//*[@id='days']/option[10]")).click();
		driver.findElement(By.xpath("//*[@id='months']/option[12]")).click();
		driver.findElement(By.xpath("//*[@id='years']/option[29]")).click();

		driver.findElement(By.id("firstname")).sendKeys("bharath");
		driver.findElement(By.id("lastname")).sendKeys("motta");
		driver.findElement(By.id("company")).sendKeys("Student");
		driver.findElement(By.id("address1")).sendKeys("125 Parkway forest dr.");
		driver.findElement(By.id("address2")).sendKeys("unit 143");
		driver.findElement(By.id("city")).sendKeys("toronto");
		driver.findElement(By.xpath("//*[@id='id_state']/option[4]")).click();
		driver.findElement(By.id("postcode")).sendKeys("00000");
		driver.findElement(By.id("other")).sendKeys("This is automation testing assignment by bharath");
		driver.findElement(By.id("phone")).sendKeys("123456789");
		driver.findElement(By.id("phone_mobile")).sendKeys("987654321");
		driver.findElement(By.id("alias")).sendKeys("MottaBharath@gmail.com");

		driver.findElement(By.id("submitAccount")).click();

		driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/ul/li/div/div[2]/div[2]/a[1]")).click();

		driver.findElement(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/p[2]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='center_column']/form/p/button")).click();
		driver.findElement(By.id("uniform-cgv")).click();

		driver.findElement(By.xpath("//*[@id='HOOK_PAYMENT']/div[1]/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id='cart_navigation']/button")).click();

		driver.quit();

	}
}
