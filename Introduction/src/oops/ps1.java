package oops;

import org.testng.annotations.Test;

public class ps1 extends ps{
@Test
public void testrun()
{
	dothis(); //parent class
	ps2 p = new ps2(2);//parameterized constructor
	System.out.println(p.increment());
	System.out.println(p.decrement());
}
}	