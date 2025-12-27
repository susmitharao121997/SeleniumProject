import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class ExplicitwaitAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    String[] names = {"iphone X","Samsung Note 8","Nokia Edge","Blackberry"};
	    driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.id("password")).sendKeys("learning");
	    driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
	    driver.findElement(By.id("okayBtn")).click();
	    WebElement staticDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
	    Select dropDown = new Select(staticDropDown);
        dropDown.selectByValue("consult");
        System.out.println(dropDown.getFirstSelectedOption().getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.id("signInBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='nav-link btn btn-primary']")));
        List phoneNames = Arrays.asList(names);
        List<WebElement> productName = driver.findElements(By.xpath("//div[@class='card-body']/h4"));
        for(int i=0;i<productName.size();i++)
        	{
        	String namephone = productName.get(i).getText();
        	if(phoneNames.contains(namephone))
        	{
        		driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
        	}
        	}
        driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
	}

}
