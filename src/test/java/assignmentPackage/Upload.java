package assignmentPackage;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement ele = driver.findElement(By.xpath("//a[@id='file-upload']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

		System.out.println("Site traversed ");
		WebElement fn = driver.findElement(By.xpath("//a[@id='file-upload']"));
		fn.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement fn2 = driver.findElement(By.cssSelector("#myFile"));
		fn2.sendKeys("C:\\Users\\Sanket\\Desktop\\TestUpload.txt");

		System.out.println(" File selected");
		WebElement fn3 = driver.findElement(By.xpath("//input[@id='submit-button']"));
		fn3.click();

		Alert alt1 = driver.switchTo().alert();
		alt1.accept();

		System.out.println(" Successfull");

	}

}
