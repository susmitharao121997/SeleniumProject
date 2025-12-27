import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://the-internet.herokuapp.com/nested_frames");
	    driver.switchTo().frame("frame-top");
	    driver.switchTo().frame("frame-middle");
	    String name = driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText();
	    System.out.println(name);
	}

}
