import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    WebElement staticDropDown =  driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	    Select dropDown = new Select(staticDropDown);
	    dropDown.selectByIndex(3);
	    System.out.println(dropDown.getFirstSelectedOption().getText());
	    dropDown.selectByVisibleText("AED");
	    System.out.println(dropDown.getFirstSelectedOption().getText());
	    dropDown.selectByValue("INR");
	    System.out.println(dropDown.getFirstSelectedOption().getText());
	}

}
