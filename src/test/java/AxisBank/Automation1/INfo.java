[10:37 AM]Harsha Khande

public class UploadDownload {

	  public static void main(String[] args) throws InterruptedException {  
  
    System.setProperty("webdriver.chrome.driver",   
        "C:\\Users\\Harsha Patil\\Documents\\Manipal\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");  
  
        WebDriver driver = new ChromeDriver();  
  
        driver.get("[https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");](https://chercher.tech/practice/practice-pop-ups-selenium-webdriver%22); "https://chercher.tech/practice/practice-pop-ups-selenium-webdriver%22);")  
  
        driver.manage().window().maximize();  
  
        Thread.sleep(500);  
  
  
        WebElement upload = driver.findElement(By.xpath("//input[@name ='upload']"));  
  
        upload.sendKeys("C:\\Users\\Harsha Patil\\Desktop\\Anirudh\\single Inh.jpg");  
  
        Thread.sleep(500);

        WebElement download = driver.findElement(By.xpath("//input[@name ='download']"));  

        download.click();  
  
        Thread.sleep(500);  
  
        /*  
         * File file = new File("C:\\Users\\Harsha Patil\\Downloads\\Resume.pdf");  
         *   
         * if (file.exists()) { System.out.println("The file exists."); } else {  
         * System.out.println("The file does not exist."); }  
         *   
         */  
  
  
  
  

  }

	}

	[10:38 AM]

	Harsha Khande

	public class DatePicker {

		  public static void main(String[] args) throws InterruptedException {  
  
    System.setProperty("webdriver.chrome.driver",   
        "C:\\Users\\Harsha Patil\\Documents\\Manipal\\chromedriver-win64 (2)\\chromedriver-win64\\chromedriver.exe");  
  
        WebDriver driver = new ChromeDriver();  
  
        driver.get("[https://www.makemytrip.com/");](https://www.makemytrip.com/%22); "https://www.makemytrip.com/%22);")  
  
        driver.manage().window().maximize();  
  
        Thread.sleep(500);  
  
  
        WebElement Date = driver.findElement(By.xpath("//label[@for='departure']"));  
  
  
        Thread.sleep(500);  
  
  
        Date.click();  
  
  
        WebElement newDate = driver.findElement(By.xpath("//div[@class='DayPicker-Day'][@aria-label=\"Tue Feb 27 2024\"]"));  
  
        newDate.click();  
  
  
  
  
  
  

  }

}
