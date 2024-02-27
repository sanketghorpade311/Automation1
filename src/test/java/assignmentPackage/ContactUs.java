package assignmentPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactUs {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\maven\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/");
		driver.manage().window().maximize();

		Thread.sleep(500);

		WebElement contus = driver.findElement(By.xpath("//h1[contains(text(),'CONTACT US')]"));
		contus.click();

		Set<String> windowHandles = driver.getWindowHandles();
		for (String windowHandle : windowHandles) {
			driver.switchTo().window(windowHandle);
		}

		WebElement fn = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.click();
		fn.sendKeys("Sanket");
		System.out.println("First name is = Sanket");

		WebElement ln = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.click();
		ln.sendKeys("Ghorpade");
		System.out.println("Last name is = Ghorpade");

		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email Address']"));
		email.click();
		email.sendKeys("sanket322g@gmail.com");
		System.out.println("sanket322@gmail.com");

		WebElement comments = driver.findElement(By.xpath("//textarea[@placeholder='Comments']"));
		comments.click();
		comments.sendKeys("This is text input");
		System.out.println("Data Submitted");

		WebElement submit = driver.findElement(By.xpath("//input[@value='SUBMIT']"));
		submit.click();

		driver.close();
	}

}
