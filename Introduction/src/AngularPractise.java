import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AngularPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/angularpractice/");
	    driver.findElement(By.xpath("//input[@name='name']")).sendKeys("susmitha");
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("susmitha@gmail.com");
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys("sus12");
	    driver.findElement(By.id("exampleCheck1")).click();
	    WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
	    Select option = new Select(dropdown);
	    option.selectByIndex(1);
	    System.out.println(option.getFirstSelectedOption());
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("12-09-1997");
	    driver.findElement(By.cssSelector(".btn.btn-success")).click();
	    System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	}
}
