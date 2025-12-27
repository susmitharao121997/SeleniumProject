import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
////	WebDriver driver = new FirefoxDriver();
	////System.setProperty("webdriver.gecko.driver","Documents/geckodriver.exe");
	/*WebDriver driver = new EdgeDriver();
	System.setProperty("webdriver.edge.driver","Documents/msedgedriver.exe");*/
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	driver.manage().window().maximize();
    driver.get("https://rahulshettyacademy.com");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
  ////  driver.close();
	}

}
