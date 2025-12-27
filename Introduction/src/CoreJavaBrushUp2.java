import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2 == 0)
			{
				System.out.println(arr2[i]);
				break; // found one multiple of 2 
			}
			else
			{
				System.out.println(arr2[i] + "is not a multiple of 2");
			}
		}*/
		
	/*	double[] numbers = {1,2.5,5,6,4};
		// print first and last element
	    for(int i=0;i<numbers.length;i++)
	    {
	        if(i==0||i==numbers.length-1)
	        {
	    System.out.println(numbers[i]);
	        }
	    }
	    
		//print reverse array
	    for(int i=numbers.length-1;i>=0;i--)
        {
            System.out.println(numbers[i]);
            
            //count no of elements in array
            System.out.println(numbers.length);
            
        }*/
		
		//ArrayList 
		ArrayList<String> a = new ArrayList<String>();
		a.add("susmitha");
		a.add("Rao");
		System.out.println(a.get(0));
		////a.remove(1);
		//iterating over array list
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		for(String val:a)
		{
			System.out.println(val);
		}
		System.out.println("********************");
		//item is present in array list
		System.out.println(a.contains("susmitha"));
		//convert array to array list
		String[] name = {"Susmitha","Rao","Rishi"};
		List<String> names = Arrays.asList(name);
		System.out.println(names);
		System.out.println(names.contains("Rishi"));
	}
}
