package Javaprograms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Streams {

	//count the number of names starting with alphabet A
    @Test
	public static void regular()
	{
	 ArrayList<String> names = new ArrayList<String>();
	 names.add("Afra");
	 names.add("Aliya");
	 names.add("Rishi");
	 names.add("Susmitha");
	 names.add("Asifa");
	 int count = 0;
	 for(String name: names)
	 {
		 if(name.startsWith("A"))
		 {
			 count++;
		 }
	 }
	 System.out.println(count);
	}
    
    @Test
    public static void StreamFilter()
    {
    ArrayList<String> names = new ArrayList<String>();
   	 names.add("Afra");
   	 names.add("Aliya");
   	 names.add("Rishi");
   	 names.add("Susmitha");
   	 names.add("Asifa");
   	 long c = names.stream().filter(s->s.startsWith("A")).count();
   	 System.out.println(c);	
   	 long d = Stream.of("Afra","Asifa","Aliya","Susmitha","Rishi").filter(s->
   	 {
   		 s.startsWith("A");
   		 return true;
   	 }).count();
   	 System.out.println(d);
   	 //print names of length greater than 4
   	 names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
   	 names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
    }
    
   @Test
   public static void StreamMap()
   {
	   //print names ends with 'a' with uppercase
	   Stream.of("Afra","Asifa","Aliya","Susmitha","Rishi").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	   //print names which has first letter A and sorted
	   List<String> names = Arrays.asList("Afra","Asifa","Aliya","Susmitha","Rishi");
	   names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
	   //merging two different lists
	   List<String> names1 = Arrays.asList("ram","sita","prabhu","lakshman","ved");
	   Stream<String> newstream =  Stream.concat(names.stream(), names1.stream());
	   System.out.println("******************");
	  //// newstream.sorted().forEach(s->System.out.println(s)); 
	   boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("Rishi"));
	   System.out.println(flag);
	   Assert.assertTrue(true);
   }
   @Test 
   public static void streamCollect()
   {
	   List<String> ls = Stream.of("Afra","Asifa","Aliya","Susmitha","Rishi").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
	   System.out.println(ls.get(0));
	   //print unique numbers from array
	   //print unique sorted array
	   List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
	   values.stream().distinct().forEach(s->System.out.println(s));
	   values.stream().distinct().sorted().forEach(s->System.out.println(s));
	   List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
	   System.out.println(li.get(3));
   }
    @Test
    public static void main(String[] args) 
    {
    	regular();
    	StreamFilter();
    	StreamMap();
    	streamCollect();
    }
}
