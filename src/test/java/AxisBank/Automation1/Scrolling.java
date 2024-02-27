package AxisBank.Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

		// VerticalScroll-down
		// Thread.sleep(900);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollBy(0,600)", "");
		// VerticalScroll-up
		// Thread.sleep(900);

		// js.executeScript("window.scrollBy(0,-400)", "");
		// Horizontal -Right
		// Thread.sleep(900);
		// js.executeScript("window.scrollBy(400,0)", "");

		WebElement ele = driver.findElement(By.xpath("//small[@class='text-white']"));
		js.executeScript("arguments[0].scrollIntoView(true);", ele);

	}
}