package assignmentPackage;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPortal {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement ele = driver.findElement(By.xpath("(//a[@id='login-portal'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

		WebElement fn = driver.findElement(By.xpath("(//a[@id='login-portal'])[1]"));
		fn.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement fn2 = driver.findElement(By.xpath("(//input[@id='text'])[1]"));
		fn2.click();
		fn2.sendKeys("webdriver");

		WebElement fn3 = driver.findElement(By.xpath(" //input[@id='password']"));
		fn3.click();
		fn3.sendKeys("webdriver123");

		WebElement fn4 = driver.findElement(By.xpath("//button[@id='login-button']"));
		fn4.click();
		Thread.sleep(2000);

		Alert alt1 = driver.switchTo().alert();
		alt1.accept();

		System.out.println("Website opened");
		System.out.println("Data input Complete");
		System.out.println("Validation successfull and popup closed");
		driver.close();
	}

}
