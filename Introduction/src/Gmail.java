import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://myaccount.google.com/personal-info?utm_source=sign_in_no_continue");
	   //// driver.findElement(By.id("identifierId")).sendKeys("susmitharao97@gmail.com");	
	    
	}

}
