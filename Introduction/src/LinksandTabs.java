import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksandTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    //print the link counts in the page
	    System.out.println(driver.findElements(By.tagName("a")).size());
	    WebElement footdriver = driver.findElement(By.id("gf-BIG"));
	    System.out.println(footdriver.findElements(By.tagName("a")).size());
	    //limiting web driver scope
	    WebElement columndriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	    System.out.println(columndriver.findElements(By.tagName("a")).size()); 
	    //click on each link in the column and check if the page is opening
	    for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
	    {
	    	String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
	    	columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
	    	Thread.sleep(5000);
	    }
	    //Getting the title of child tabs 
	    Set<String> windows = driver.getWindowHandles();
	    Iterator<String> it = windows.iterator();
	    while(it.hasNext())
	    {
	    driver.switchTo().window(it.next());
	    System.out.println(driver.getTitle());
	    }
	}
}