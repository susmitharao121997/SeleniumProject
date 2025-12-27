
public class MethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
	    getData1();
	    MethodsDemo2 d1 = new MethodsDemo2();
	    d1.getUserData();
	}
	
	public String getData()
	{
		System.out.println("Hello world");
		return "susmitha Rao";
	}
	
	public static String getData1()
	{
		System.out.println("Hello world");
		return "susmitha Rao";
	}

}
