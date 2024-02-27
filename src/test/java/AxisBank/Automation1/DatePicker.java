package AxisBank.Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		WebElement Date = driver.findElement(By.xpath("//label[@for='departure']"));
		Date.click();
		Thread.sleep(2000);

		WebElement Date2 = driver
				.findElement(By.xpath("//div[@class='DayPicker-Day'][@aria-label=\"Thu Feb 29 2024\"]"));
		Date2.click();
	}

}
