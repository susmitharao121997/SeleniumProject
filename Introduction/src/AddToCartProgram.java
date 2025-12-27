import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    String[] itemsNeeded = {"Brocolli","Cauliflower","Beetroot"};
	    int j=0;
	    driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    ////driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  
	    Thread.sleep(3000);
	    addCart(driver, itemsNeeded);
	    driver.findElement(By.cssSelector("img[alt='Cart']")).click();
	    driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
	    driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
	    driver.findElement(By.cssSelector("button.promoBtn")).click();
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
	    System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	    
	   /* List<WebElement> itemNames = driver.findElements(By.cssSelector("h4.product-name"));
	    for(int i=0; i<itemNames.size(); i++)
	    {
	    	String[] name = itemNames.get(i).getText().split("-");
	    	String formattedName = name[0].trim();
	    	List itemsNeededlist = Arrays.asList(itemsNeeded);
	    	if(itemsNeededlist.contains(formattedName))
	    	{
	    		j++;
	    		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
	    		if(j==itemsNeeded.length)
	    		{
	    			break;
	    		}
	    	}
	    }	*/    
	    
	}
	
	public static void addCart(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
		 List<WebElement> itemNames = driver.findElements(By.cssSelector("h4.product-name"));
		    for(int i=0; i<itemNames.size(); i++)
		    {
		    	String[] name = itemNames.get(i).getText().split("-");
		    	String formattedName = name[0].trim();
		    	List itemsNeededlist = Arrays.asList(itemsNeeded);
		    	if(itemsNeededlist.contains(formattedName))
		    	{
		    		j++;
		    		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		    		if(j==itemsNeeded.length)
		    		{
		    			break;
		    		}
		    	}
		    }	    
	}

}
