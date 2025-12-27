package Javaprograms;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;



public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
	    System.setProperty("webdriver.chrome.driver","Documents/chromedriver.exe");
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    SoftAssert a = new SoftAssert();
	    List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
	    for(WebElement link: links)
	    {
	    String url = link.getAttribute("href");
	    HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
	    conn.setRequestMethod("HEAD");
	    conn.connect();
	    int resCode = conn.getResponseCode();
	    System.out.println(resCode);
	    a.assertTrue(resCode<400, "The link with text " + link.getText() + " is broken with code " + resCode);
	  /*  if(resCode>400) {
	    	System.out.println("The link with text " + link.getText() + "is broken with code " + resCode);
	        Assert.assertTrue(false);*/
	    }
	    a.assertAll();
	    }
	}