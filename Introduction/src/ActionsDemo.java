

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://www.amazon.com/");
	    WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
	   Actions a = new Actions(driver);
	   //// a.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).contextClick().build().perform();
	    a.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();	    
	  ////  searchBox.sendKeys("Hello");
	    List<WebElement> products = driver.findElements(By.xpath("//div[@class='two-pane-results-container']"));

	    for(WebElement product: products)
	    {
	    	product.getText().contains(" kitty");
	    	product.click();
	    }
	}

}
