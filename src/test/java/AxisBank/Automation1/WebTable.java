package AxisBank.Automation1;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/tables");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Find the number of rows present
		List<WebElement> rowno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		int rowcount = rowno.size();
		System.out.println(rowcount);

		// Find the number of columns
		List<WebElement> colno = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td"));
		int colcount = colno.size();
		System.out.println(colcount);

		// Fetch the cell data from the particular cell
		WebElement celldata = driver.findElement(By.xpath("//table[@id ='table1']/tbody/tr[4]/td[3]"));
		String text = celldata.getText();
		System.out.println(text);

		String expectedtext = "tconway@earthlink.net";

		if (text.equals(expectedtext)) {
			System.out.println("The cell data is correct");
		} else {
			System.out.println("The cell data is wrong");
		}

		// implicit wait will wait for all the elements in the script to load before it
		// could throw

		// element not found exception

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);

		// explicit wait is used to wait for a particular element based on the expected
		// condition

		// explicit wait - to wait for the compose button to be click-able

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id = 'table1']/tbody/tr[4]/td[3]")));

		driver.quit(); // Close the WebDriver instance
	}
}
