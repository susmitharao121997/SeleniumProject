import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(5000);
	    js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	    List<WebElement> Rowvalues = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
	    System.out.println(Rowvalues.size());
	    List<WebElement> Columnvalues = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
	    System.out.println(Columnvalues.size());  
	    List<WebElement> SecondRow = driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]"));
	    for(int i=0;i<SecondRow.size();i++)
	    {
	      String value = SecondRow.get(i).getText();
	      System.out.println(value);
	    }    
	}
}