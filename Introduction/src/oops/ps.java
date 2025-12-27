package oops;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ps {
	public void dothis()
	{
		System.out.println("do this");
	}
	@AfterMethod
	public void last()
	{
		System.out.println("last");
	}
	@BeforeMethod
	public void hi()
	{
		System.out.println("hibefore");
	}
}
