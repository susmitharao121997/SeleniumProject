package Javaprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/greenkart/#/offers");
	}

}
