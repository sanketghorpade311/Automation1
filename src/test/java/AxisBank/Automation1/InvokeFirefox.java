package AxisBank.Automation1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InvokeFirefox {

	public static void main(String[] args) {

		System.setProperty("webdriver.Gecko.driver", "D:\\maven\\geckodriver-v0.34.0-win-aarch64\\geckodriver.exe");

		WebDriver firedriver = new FirefoxDriver();
		firedriver.get("https://www.selenium.dev/");

	}
}
