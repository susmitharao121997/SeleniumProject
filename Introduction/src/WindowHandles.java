import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    driver.findElement(By.cssSelector("a.blinkingText")).click();
	    driver.manage().window().maximize();
	    Set<String> window = driver.getWindowHandles();
	    Iterator<String> it = window.iterator();
	    String ParentWindow = it.next();
	    String childWindow = it.next();
	    driver.switchTo().window(childWindow);
	    System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText()); 	
	    String name = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
	    System.out.println(name);
	    driver.switchTo().window(ParentWindow);
	}

}
