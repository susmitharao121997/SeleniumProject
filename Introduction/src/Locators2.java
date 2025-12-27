import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "rahul";
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
		/*WebDriver driver = new EdgeDriver();
		System.setProperty("webdriver.edge.driver","Documents/msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver","Documents/geckodriver.exe");*/
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String password = getPassword(driver);
	    driver.get("https://rahulshettyacademy.com/locatorspractice/");
	    driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	    driver.findElement(By.name("inputPassword")).sendKeys(password);
	    driver.findElement(By.className("signInBtn")).click();
	    Thread.sleep(1000);
	    System.out.println(driver.findElement(By.tagName("p")).getText());
	    String text = driver.findElement(By.tagName("p")).getText();
	    System.out.println(text);
	    Assert.assertEquals(text,"You are successfully logged in.");
	    String nameText = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
	    System.out.println(nameText);
	    Assert.assertEquals(nameText, "Hello "+name+",");
	    driver.findElement(By.xpath("//*[text()='Log Out']")).click();
	    driver.close();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String names = driver.findElement(By.cssSelector("form p")).getText();
		String[] pwd = names.split("'");
		//pwd[0] = Please use temporary password 
		//pwd[1] = rahulshettyacademy' to Login.
		String pwdname = pwd[1].split("'")[0];
		return pwdname;
		
	}

}
