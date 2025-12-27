import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://www.amazon.in/");
	    driver.manage().window().maximize();
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	    searchBox.sendKeys("iphone");
	   //// searchBox.submit();
	    Thread.sleep(5000);
	   /* WebElement product = driver.findElement(By.xpath("//div[@aria-label='iphone 16e']"));
	    product.click();*/
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@id='sac-autocomplete-results-container']"))
        );
        List<WebElement> products = driver.findElements(
                By.xpath("//div[@id='sac-autocomplete-results-container']//div[@role='button']")
        );
	    for(WebElement product: products)
	    {
	    	if(product.getText().trim().equalsIgnoreCase("iphone 16e"))
	    	{
                wait.until(ExpectedConditions.elementToBeClickable(product)).click();
	    		break;
	    	}		
	    }  
	}
	////    driver.findElement(By.linkText("ESR for iPhone 16 Pro Max Case, Compatible with MagSafe, Military-Grade Protective Case, TPU, Stand Phone Case, Scratch-Resistant Back Cover, Classic Series, Clear")).click();
	////    driver.findElement(By.id("add-to-cart-button")).click();
	
}

