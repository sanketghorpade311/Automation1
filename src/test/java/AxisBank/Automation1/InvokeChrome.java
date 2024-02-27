package AxisBank.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeChrome {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");

		// Get Title
		// String title = driver.getTitle();
		// System.out.println(title);

		// Get URl

		// String currurk = driver.getCurrentUrl();
		// System.out.println(currurk);

		driver.navigate().forward();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);
		// PageSource
		driver.navigate().refresh();
		Thread.sleep(1000);

		driver.close();
		// close(); will close current browser session

	}

}
