import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class DynamicValueAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    driver.findElement(By.id("checkBoxOption3")).click();
	    String name = driver.findElement(By.xpath("//label[@for='honda']")).getText();
	    System.out.println(name);
	    WebElement staticDropDown =  driver.findElement(By.id("dropdown-class-example"));
	    Select dropDown = new Select(staticDropDown);
	    dropDown.selectByVisibleText(name);
	    driver.findElement(By.id("name")).sendKeys(name);
	    driver.findElement(By.id("alertbtn")).click();
	    String alertText = driver.switchTo().alert().getText();
	    if(alertText.contains(name))
	    {
	    	System.out.println(name);
	    }
	    else
	    {
	    	System.out.println("name not found");
	    }
	}
}
