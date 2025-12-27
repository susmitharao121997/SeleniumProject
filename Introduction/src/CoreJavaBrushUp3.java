import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//string is an object  //string literal(same value means create one object only (S)
		String s ="susmitha";
		String s1 = "susmitha";
		String s2 = "Rao";
       //new object (creates different objects for same value
		String s3 = new String("welcome");
		String s4 = new String("welcome");
		String s5 = "susmitha Rao Rishi";
		String[] splittedString = s5.split(" ");
		for(int i=0;i<splittedString.length;i++)
		{
			System.out.println(splittedString[i]);
		}
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);	
		System.out.println("***************");	
		//trim
		String[] splittedString1 = s5.split("Rao");
		for(int i=0;i<splittedString1.length;i++)
		{
			System.out.println(splittedString1[i].trim());
		}
		//print characters
		for(int i=0;i<s5.length();i++)
		{
			System.out.print(s5.charAt(i));
		}
		System.out.println("***************");	
		//print Reverse character
		for(int i=s5.length()-1;i>=0;i--)
		{
			System.out.println(s5.charAt(i));
		}
	}

}
