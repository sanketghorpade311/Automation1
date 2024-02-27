package AxisBank.Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox2 {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");

		driver.manage().window().maximize();
		WebElement check1 = driver.findElement(By.xpath("(//input[@name='optradio'])[1]"));
		WebElement check2 = driver.findElement(By.xpath("(//input[@name='optradio'])[2]"));

		if (check1.isEnabled()) {
			check1.click();

		} else {
			check2.click();
		}
	}

	// Radio

}
