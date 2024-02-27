package assignmentPackage;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupAlert {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement web = driver.findElement(By.xpath("//a[@id='popup-alerts']"));

		js.executeScript("arguments[0].scrollIntoView(true);", web);

		web.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement click1 = driver.findElement(By.xpath("//span[@id='button1']"));
		click1.click();
		System.out.println("Clicked on click1 successfully");

		Alert alt = driver.switchTo().alert();
		alt.accept();
		System.out.println("Clicked on popup alert(ok) successfully");

		WebElement click2 = driver.findElement(By.xpath("//span[@id='button2']"));
		click2.click();

		System.out.println("Clicked on click2 successfully");

		WebElement click2modal = driver.findElement(By.xpath("//button[normalize-space()='Close']"));
		click2modal.click();

		WebElement click4 = driver.findElement(By.xpath("//span[@id='button4']"));
		click4.click();

		System.out.println("Clicked on click4 successfully");
		alt.accept();

		System.out.println("Clicked on popup alert(ok) successfully");
		click4.click();

		alt.dismiss();
		System.out.println("Clicked on popup alert(cancel) successfully");
		driver.close();

	}

}
