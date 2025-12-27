import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://the-internet.herokuapp.com/");
	    driver.findElement(By.xpath("//div[@id='content']//li/a[text()='Multiple Windows']")).click();
	    String Parent = driver.getWindowHandle();
	    driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	    Set<String> windows = driver.getWindowHandles();
	    for(String window:windows)
	    {
	     System.out.println(driver.switchTo().window(window));
	    }
	   String text = driver.findElement(By.xpath("//div[@class='example']")).getText();
	   System.out.println(text);
	   driver.switchTo().window(Parent);
	   String text1 = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
	   System.out.println(text1);	   
	}

}
