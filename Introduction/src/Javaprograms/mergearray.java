package Javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class mergearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> values1 = Arrays.asList(1,2,3,0,0,0);
        List<Integer> values2 = Arrays.asList(2,5,6);
        Stream<Integer> newstream =  Stream.concat(values1.stream(), values2.stream());
        newstream.sorted().forEach(s->System.out.print(s)); 
	}
}