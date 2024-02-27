package AxisBank.Automation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox3 {

	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

		driver.manage().window().maximize();

		// XPaths of the checkboxes
		String[] checkBoxXPaths = { "(//input[@class='cb1-element'])[1]", "(//input[@class='cb1-element'])[2]",
				"(//input[@class='cb1-element'])[3]", "(//input[@class='cb1-element'])[4]" };

		// Click each checkbox using a for loop
		for (String checkBoxXPath : checkBoxXPaths) {
			WebElement checkBox = driver.findElement(By.xpath(checkBoxXPath));
			if (checkBox.isEnabled()) {
				checkBox.click();
				System.out.println("Checkbox clicked");
			} else {
				System.out.println("Checkbox not enabled");
			}
		}
	}
}
