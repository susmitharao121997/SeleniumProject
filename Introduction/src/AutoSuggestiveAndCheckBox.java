import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AutoSuggestiveAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
       //// System.out.println(driver.findElement(By.cssSelector("input[id*= SeniorCitizenDiscount]")).isSelected());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*= SeniorCitizenDiscount]")).isSelected());
        driver.findElement(By.cssSelector("input[id*= SeniorCitizenDiscount]")).click();
        ////System.out.println(driver.findElement(By.cssSelector("input[id*= SeniorCitizenDiscount]")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*= SeniorCitizenDiscount]")).isSelected());
        
        //count
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        
        //Enabled
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
        {
        	Assert.assertTrue(true);
        }
        else
        {
           Assert.assertTrue(false);
        }
        
             
       /* driver.findElement(By.id("autosuggest")).sendKeys("Ind");
        Thread.sleep(10000);
        List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item'/a"));
        var a = true;
        for(WebElement option :options)
        {
        	var b = true;
        	if(option.getText().equalsIgnoreCase("India"));
        	{
        		var c = true;
        		option.click();
        		break;
        	}
        }   */     		
	}
}